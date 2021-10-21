
package bonds;

import org.quantlib.Actual360;
import org.quantlib.BusinessDayConvention;
import org.quantlib.Calendar;
import org.quantlib.Compounding;
import org.quantlib.Date;
import org.quantlib.DateGeneration;
import org.quantlib.DayCounter;
import org.quantlib.DiscountingBondEngine;
import org.quantlib.DoubleVector;
import org.quantlib.FloatingRateBond;
import org.quantlib.Frequency;
import org.quantlib.IborIndex;
import org.quantlib.Month;
import org.quantlib.Period;
import org.quantlib.PricingEngine;
import org.quantlib.RelinkableYieldTermStructureHandle;
import org.quantlib.TARGET;
import org.quantlib.TimeUnit;
import org.quantlib.BondFunctions;
import org.quantlib.InterestRate;
import org.quantlib.Settings;
import org.quantlib.Schedule;
import org.quantlib.Duration;
import org.quantlib.Euribor;
import org.quantlib.FlatForward;
import org.quantlib.Japan;

public class TestFloatingRate {
        public static void main(String[] args) throws Exception {

                // MARKET DATA
                // https://mhittesdorf.wordpress.com/2013/02/25/introducing-quantlib-the-term-structure-of-interest-rates/
                // https://www.boerse-frankfurt.de/bond/xs2345868744-toyota-motor-finance-netherlands-b-v-0-202-21-23
                Calendar cal = new Japan();
                int settlementDays = 1;
                Date settlementDate = Date.todaysDate().add(settlementDays);
                // Date settlementDate = new Date(21, Month.October, 2021);
                // must be a business day
                settlementDate = cal.adjust(settlementDate);

                Date todayDate = cal.advance(settlementDate, -settlementDays, TimeUnit.Days);

                Settings.instance().setEvaluationDate(todayDate);
                System.out.println("Today: " + todayDate.weekday() + ", " + todayDate);
                System.out.println("Settlement date: " + settlementDate.weekday() + ", " + settlementDate);

                Date issueDate = new Date(24, Month.May, 2021);
                Date maturityDate = new Date(24, Month.May, 2023);
                Double coupon = 0.00202;
                Period tenor = new Period(Frequency.Quarterly);
                DayCounter dayCounter = new Actual360();

                Double faceAmount = 100.0;

                DoubleVector couponsVector = new DoubleVector();
                couponsVector.add(coupon);

                Schedule floatingBondSchedule = new Schedule(issueDate, maturityDate, tenor, new TARGET(),
                                BusinessDayConvention.Following, BusinessDayConvention.Following,
                                DateGeneration.Rule.Backward, false);

                RelinkableYieldTermStructureHandle liborTermStructure = new RelinkableYieldTermStructureHandle();
                FlatForward discountCurve = new FlatForward(settlementDate, 0.002, dayCounter, Compounding.Compounded,
                                Frequency.Quarterly);

                IborIndex libor3m = new Euribor(new Period(3, TimeUnit.Months), liborTermStructure);
                liborTermStructure.linkTo(discountCurve);

                libor3m.addFixing(new Date(20, Month.August, 2021), coupon);
                libor3m.addFixing(new Date(20, Month.May, 2021), coupon);

                FloatingRateBond bond = new FloatingRateBond(settlementDays, faceAmount, floatingBondSchedule, libor3m,
                                dayCounter);

                // BONDS TO BE PRICED

                // Price engine
                PricingEngine bondEngine = new DiscountingBondEngine(liborTermStructure);
                bond.setPricingEngine(bondEngine);

                Double yield = -0.002667;

                Double cleanPrice = bond.cleanPrice(yield, dayCounter, Compounding.Compounded, Frequency.Quarterly,
                                settlementDate);
                Double dirtyPrice = bond.dirtyPrice(yield, dayCounter, Compounding.Compounded, Frequency.Quarterly,
                                settlementDate);

                System.out.printf("Clean Price : %.2f \n", cleanPrice);
                System.out.printf("Dirty Price : %.2f \n", dirtyPrice);
                System.out.printf("NPV : %.2f \n", bond.NPV());

                System.out.printf("Accrual start date: %s \n", BondFunctions.accrualStartDate(bond).ISO());
                System.out.printf("Accrual end date: %s \n", BondFunctions.accrualEndDate(bond).ISO());
                System.out.printf("Accrual period: %.4f \n", BondFunctions.accrualPeriod(bond));
                System.out.printf("Accrued Interest: %.4f \n", bond.accruedAmount());
                System.out.printf("Accrual Days: %d \n", BondFunctions.accrualDays(bond));
                System.out.printf("Accrued Days: %d \n", BondFunctions.accruedDays(bond));
                System.out.printf("Accrued period: %.4f \n", BondFunctions.accruedPeriod(bond));

                InterestRate yieldRate = new InterestRate(yield, dayCounter, Compounding.Compounded,
                                Frequency.Quarterly);
                System.out.printf("convexity : %.4f \n", BondFunctions.convexity(bond, yieldRate, settlementDate));
                System.out.printf("Basis point value: %.4f \n", BondFunctions.basisPointValue(bond, yieldRate));
                System.out.printf("bps: %.4f \n", BondFunctions.bps(bond, yieldRate));
                System.out.printf("Simple Duration: %.3f \n",
                                BondFunctions.duration(bond, yieldRate, Duration.Type.Simple));
                System.out.printf("Modified duration: %.3f \n",
                                BondFunctions.duration(bond, yieldRate, Duration.Type.Modified));
                System.out.printf("yield Value Basis Point: %.4f \n",
                                BondFunctions.yieldValueBasisPoint(bond, yieldRate));
                System.out.printf("YTM : %.6f \n",
                                bond.yield(cleanPrice, dayCounter, Compounding.Compounded, Frequency.Quarterly));
                System.out.printf("Z-Spread : %.6f \n", BondFunctions.zSpread(bond, cleanPrice, discountCurve,
                                dayCounter, Compounding.Compounded, Frequency.Quarterly));

        }
}
