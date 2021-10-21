
package bonds;

import org.quantlib.Actual360;
import org.quantlib.BusinessDayConvention;
import org.quantlib.Compounding;
import org.quantlib.Date;
import org.quantlib.DateGeneration;
import org.quantlib.DayCounter;
import org.quantlib.DiscountingBondEngine;
import org.quantlib.FloatingRateBond;
import org.quantlib.Frequency;
import org.quantlib.IborIndex;
import org.quantlib.Month;
import org.quantlib.Period;
import org.quantlib.RelinkableYieldTermStructureHandle;
import org.quantlib.BondFunctions;
import org.quantlib.InterestRate;
import org.quantlib.Settings;
import org.quantlib.UnitedStates;
import org.quantlib.Schedule;
import org.quantlib.Duration;
import org.quantlib.Euribor6M;
import org.quantlib.FlatForward;
import org.quantlib.QuoteHandle;
import org.quantlib.SimpleQuote;
import org.quantlib.YieldTermStructureHandle;
import org.quantlib.CashFlow;

public class FloatingRateDuration {
        public static void main(String[] args) throws Exception {

                // https://www.youtube.com/watch?v=r_1wSd0hnN4

                Date today = new Date(8, Month.October, 2014);
                Settings.instance().setEvaluationDate(today);

                RelinkableYieldTermStructureHandle forecast_curve = new RelinkableYieldTermStructureHandle();
                IborIndex index = new Euribor6M(forecast_curve);

                forecast_curve.linkTo(new FlatForward(today, 0.002, new Actual360(), Compounding.Compounded,
                                Frequency.Semiannual));

                // Fixing the first coupon which is ongoing
                index.addFixing(new Date(6, Month.August, 2014), 0.002);

                // Instantiate the Bond
                Date issueDate = new Date(8, Month.August, 2014);
                Date maturityDate = new Date(8, Month.August, 2019);
                int settlementDays = 3;
                Double faceAmount = 100.0;
                DayCounter paymentDayCounter = new Actual360();

                Schedule schedule = new Schedule(issueDate, maturityDate, new Period(Frequency.Semiannual),
                                new UnitedStates(UnitedStates.Market.NYSE), BusinessDayConvention.Following,
                                BusinessDayConvention.Following, DateGeneration.Rule.Backward, false);

                FloatingRateBond bond = new FloatingRateBond(settlementDays, faceAmount, schedule, index,
                                paymentDayCounter);

                // Cashflows
                System.out.printf("------------CASHFLOWS-------------\n");
                System.out.printf("Date\t\t|\tAmount \n");
                System.out.printf("----------------------------------\n");
                for (CashFlow cashFlow : bond.cashflows()) {
                        System.out.printf("%s\t|\t%.6f \n", cashFlow.date().ISO(), cashFlow.amount());
                }
                System.out.printf("----------------------------------\n");

                SimpleQuote yield = new SimpleQuote(0.002);

                FlatForward yieldCurve = new FlatForward(bond.settlementDate(), new QuoteHandle(yield), new Actual360(),
                                Compounding.Compounded, Frequency.Semiannual);

                bond.setPricingEngine(new DiscountingBondEngine(new YieldTermStructureHandle(yieldCurve)));

                System.out.printf("Dirty Price : %.7f \n", bond.dirtyPrice());

                InterestRate yieldRate = new InterestRate(0.002, paymentDayCounter, Compounding.Compounded,
                                Frequency.Semiannual);

                // Wrong result duration (function duration is too generic to be able to
                // calculate duration for Floating rate)
                System.out.printf("Modified duration: %.7f \n",
                                BondFunctions.duration(bond, yieldRate, Duration.Type.Modified));
                Double p = bond.dirtyPrice();
                Double dy = 1e-5;
                yield.setValue(0.002 + dy);
                Double p_p = bond.dirtyPrice();
                yield.setValue(0.002 - dy);
                Double p_m = bond.dirtyPrice();
                Double duration = -(1 / p) * (p_p - p_m) / (2 * dy);
                System.out.printf("duration: %.7f \n", duration);

                // Solution
                forecast_curve.linkTo(yieldCurve);

                p = bond.dirtyPrice();
                dy = 1e-5;
                yield.setValue(0.002 + dy);
                p_p = bond.dirtyPrice();
                yield.setValue(0.002 - dy);
                p_m = bond.dirtyPrice();
                duration = -(1 / p) * (p_p - p_m) / (2 * dy);
                System.out.printf("duration: %.7f \n", duration);

        }
}
