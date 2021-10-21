
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
import org.quantlib.USDLibor;
import org.quantlib.BondFunctions;
import org.quantlib.InterestRate;
import org.quantlib.Settings;
import org.quantlib.UnitedStates;
import org.quantlib.Schedule;
import org.quantlib.Duration;
import org.quantlib.FlatForward;

public class Airswift {
        public static void main(String[] args) throws Exception {

                // MARKET DATA
                // https://mhittesdorf.wordpress.com/2013/02/25/introducing-quantlib-the-term-structure-of-interest-rates/
                // https://www.boerse-frankfurt.de/bond/airswift-global-as-21-25
                Calendar cal = new UnitedStates();
                int settlementDays = 1;
                Date settlementDate = Date.todaysDate().add(settlementDays);
                // Date settlementDate = new Date(21, Month.October, 2021);
                // must be a business day
                settlementDate = cal.adjust(settlementDate);

                Date todayDate = cal.advance(settlementDate, -settlementDays, TimeUnit.Days);

                Settings.instance().setEvaluationDate(todayDate);
                System.out.println("Today: " + todayDate.weekday() + ", " + todayDate);
                System.out.println("Settlement date: " + settlementDate.weekday() + ", " + settlementDate);

                Date issueDate = new Date(12, Month.May, 2021);
                Date maturityDate = new Date(12, Month.May, 2025);
                Double coupon = 0.08623;
                Period tenor = new Period(Frequency.Quarterly);
                DayCounter dayCount = new Actual360();

                Double faceAmount = 100.0;

                DoubleVector couponsVector = new DoubleVector();
                couponsVector.add(coupon);

                Schedule floatingBondSchedule = new Schedule(issueDate, maturityDate, tenor, new TARGET(),
                                BusinessDayConvention.Following, BusinessDayConvention.Following,
                                DateGeneration.Rule.Backward, false);

                RelinkableYieldTermStructureHandle liborTermStructure = new RelinkableYieldTermStructureHandle();
                FlatForward curve = new FlatForward(settlementDate, 0.002, dayCount, Compounding.Compounded,
                                Frequency.Quarterly);

                IborIndex libor3m = new USDLibor(new Period(3, TimeUnit.Months), liborTermStructure);
                liborTermStructure.linkTo(curve);

                libor3m.addFixing(new Date(10, Month.August, 2021), coupon);

                FloatingRateBond bond = new FloatingRateBond(settlementDays, faceAmount, floatingBondSchedule, libor3m,
                                dayCount);

                // BONDS TO BE PRICED

                // Price engine
                PricingEngine bondEngine = new DiscountingBondEngine(liborTermStructure);
                bond.setPricingEngine(bondEngine);
                Double yield = 0.084819;

                System.out.printf("Clean Price : %.2f \n", bond.cleanPrice());
                System.out.printf("Dirty Price : %.2f \n", bond.dirtyPrice());
                System.out.printf("NPV : %.2f \n", bond.NPV());

                System.out.printf("Accrual start date: %s \n", BondFunctions.accrualStartDate(bond).ISO());
                System.out.printf("Accrual end date: %s \n", BondFunctions.accrualEndDate(bond).ISO());
                System.out.printf("Accrual period: %.4f \n", BondFunctions.accrualPeriod(bond));
                System.out.printf("Accrued Interest: %.4f \n", bond.accruedAmount());
                System.out.printf("Accrual Days: %d \n", BondFunctions.accrualDays(bond));
                System.out.printf("Accrued Days: %d \n", BondFunctions.accruedDays(bond));
                System.out.printf("Accrued period: %.4f \n", BondFunctions.accruedPeriod(bond));

                InterestRate yieldRate = new InterestRate(yield, dayCount, Compounding.Compounded, Frequency.Quarterly);
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
                                bond.yield(bond.cleanPrice(), dayCount, Compounding.Compounded, Frequency.Quarterly));

        }
}
