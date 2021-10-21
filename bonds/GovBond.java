package bonds;

import org.quantlib.ActualActual;
import org.quantlib.BusinessDayConvention;
import org.quantlib.Calendar;
import org.quantlib.Compounding;
import org.quantlib.Date;
import org.quantlib.DayCounter;
import org.quantlib.DoubleVector;
import org.quantlib.FixedRateBond;
import org.quantlib.Frequency;
import org.quantlib.Month;
import org.quantlib.Period;
import org.quantlib.TimeUnit;
import org.quantlib.BondFunctions;
import org.quantlib.InterestRate;
import org.quantlib.Settings;
import org.quantlib.UnitedStates;
import org.quantlib.Duration;

public class GovBond {
        public static void main(String[] args) throws Exception {

                // MARKET DATA
                // https://www.boerse-frankfurt.de/bond/us91282cbv28-united-states-of-america-0-375-21-24

                Calendar cal = new UnitedStates(UnitedStates.Market.GovernmentBond);
                int settlementDays = 1;
                Date settlementDate = Date.todaysDate().add(settlementDays);
                // Date settlementDate = new Date(22, Month.October, 2021);
                // must be a business day
                settlementDate = cal.adjust(settlementDate);

                Date todayDate = cal.advance(settlementDate, -settlementDays, TimeUnit.Days);

                Settings.instance().setEvaluationDate(todayDate);
                System.out.println("Today: " + todayDate.weekday() + ", " + todayDate);
                System.out.println("Settlement date: " + settlementDate.weekday() + ", " + settlementDate);

                Date issueDate = new Date(15, Month.April, 2021);
                Date maturityDate = new Date(15, Month.April, 2024);
                Double coupon = 0.00375;
                Period tenor = new Period(6, TimeUnit.Months);
                DayCounter dayCount = new ActualActual(ActualActual.Convention.Bond);

                Double faceAmount = 100.0;

                DoubleVector couponsVector = new DoubleVector();
                couponsVector.add(coupon);

                FixedRateBond bond = new FixedRateBond(settlementDays, cal, faceAmount, issueDate, maturityDate, tenor,
                                couponsVector, dayCount, BusinessDayConvention.ModifiedFollowing);
                // Fixed 4.5% US Treasury Note
                // Schedule fixedRateBondSchedule = new Schedule(issueDate, maturityDate, tenor,
                // new UnitedStates(UnitedStates.Market.GovernmentBond),
                // BusinessDayConvention.Unadjusted,
                // BusinessDayConvention.Unadjusted, DateGeneration.Rule.Backward, false);

                // FixedRateBond bond = new FixedRateBond(settlementDays, faceAmount,
                // fixedRateBondSchedule, couponsVector,
                // new ActualActual(ActualActual.Convention.Bond),
                // BusinessDayConvention.ModifiedFollowing,
                // faceAmount, issueDate);
                Double yield = 0.005954;

                Double cleanPrice = bond.cleanPrice(yield, dayCount, Compounding.Compounded, Frequency.Semiannual,
                                settlementDate);
                Double dirtyPrice = bond.dirtyPrice(yield, dayCount, Compounding.Compounded, Frequency.Semiannual,
                                settlementDate);

                System.out.printf("Clean Price : %.2f \n", cleanPrice);
                System.out.printf("Dirty Price : %.2f \n", dirtyPrice);

                System.out.printf("Accrual start date:  %s \n", BondFunctions.accrualStartDate(bond).ISO());
                System.out.printf("Accrual end date:  %s \n", BondFunctions.accrualEndDate(bond).ISO());
                System.out.printf("Accrual period:  %.4f \n", BondFunctions.accrualPeriod(bond));
                System.out.printf("Accrued Interest:  %.4f \n", bond.accruedAmount());
                System.out.printf("Accrual Days:  %d \n", BondFunctions.accrualDays(bond));
                System.out.printf("Accrued Days:  %d \n", BondFunctions.accruedDays(bond));
                System.out.printf("Accrued period:  %.4f \n", BondFunctions.accruedPeriod(bond));

                InterestRate yieldRate = new InterestRate(yield, dayCount, Compounding.Compounded,
                                Frequency.Semiannual);
                System.out.printf("convexity : %.4f \n", BondFunctions.convexity(bond, yieldRate, settlementDate));
                System.out.printf("Basis point value:  %.4f \n", BondFunctions.basisPointValue(bond, yieldRate));
                System.out.printf("bps:  %.4f \n", BondFunctions.bps(bond, yieldRate));
                System.out.printf("Simple Duration:  %.3f \n",
                                BondFunctions.duration(bond, yieldRate, Duration.Type.Simple));
                System.out.printf("Modified duration:  %.3f \n",
                                BondFunctions.duration(bond, yieldRate, Duration.Type.Modified));
                System.out.printf("yield Value Basis Point:  %.4f \n",
                                BondFunctions.yieldValueBasisPoint(bond, yieldRate));
                System.out.printf("YTM :  %.6f \n",
                                bond.yield(cleanPrice, dayCount, Compounding.Compounded, Frequency.Semiannual));

                // /// Price engine

                // // Term structures that will be used for pricing
                // // the one used for discounting cash flows
                // // --- What is 0,02 ??
                // // Which reference date we should take
                // FlatForward curve = new FlatForward(new Date(15, Month.April, 2021),
                // new QuoteHandle(new SimpleQuote(0.02)), dayCount, Compounding.Compounded);
                // YieldTermStructureHandle handle = new YieldTermStructureHandle(curve);

                // // Price engine
                // PricingEngine bondEngine = new DiscountingBondEngine(handle);
                // bond.setPricingEngine(bondEngine);

                // System.out.printf("Clean Price (With Price engine) : %.4f \n",
                // bond.cleanPrice());
                // System.out.printf("Dirty Price (With Price engine) : %.4f \n",
                // bond.dirtyPrice());

                // System.out.printf("NPV (Yield to price) : %.4f \n", bond.NPV());

                // // Calculate yield:
                // Double ytm = bond.yield(dayCount, Compounding.Compounded, Frequency.Annual);
                // System.out.printf("YTM : %.4f \n", ytm);

        }
}
