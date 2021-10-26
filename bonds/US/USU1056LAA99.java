package bonds.US;

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
import org.quantlib.Thirty360;
import org.quantlib.UnitedStates;
import org.quantlib.Duration;

public class USU1056LAA99 {
    public static void main(String[] args) throws Exception {

        // MARKET DATA
        Calendar cal = new UnitedStates();
        int settlementDays = 1;
        Date settlementDate = new Date(05, Month.August, 2021);
        settlementDate = cal.adjust(settlementDate);

        Date todayDate = cal.advance(settlementDate, -settlementDays, TimeUnit.Days);

        Settings.instance().setEvaluationDate(todayDate);
        System.out.println("Today: " + todayDate.weekday() + ", " + todayDate);
        System.out.println("Settlement date: " + settlementDate.weekday() + ", " + settlementDate);

        Date issueDate = new Date(05, Month.April, 2021);
        Date maturityDate = new Date(15, Month.April, 2028);
        Double coupon = 0.0625;
        Period tenor = new Period(6, TimeUnit.Months);
        DayCounter dayCount = new Thirty360();

        Double faceAmount = 100.0;

        DoubleVector couponsVector = new DoubleVector();
        couponsVector.add(coupon);

        FixedRateBond bond = new FixedRateBond(settlementDays, cal, faceAmount, issueDate, maturityDate, tenor,
                couponsVector, dayCount, BusinessDayConvention.Unadjusted);

        Double yield = 0.05244677;

        Double cleanPrice = bond.cleanPrice(yield, dayCount, Compounding.Compounded, Frequency.Semiannual,
                settlementDate);
        Double dirtyPrice = bond.dirtyPrice(yield, dayCount, Compounding.Compounded, Frequency.Semiannual,
                settlementDate);

        InterestRate yieldRate = new InterestRate(yield, dayCount, Compounding.Compounded, Frequency.Semiannual);

        System.out.printf("\n\n------------------------COMPARE-------------------------\n");
        System.out.printf("Clean Price =>  Quantlib: %.8f | Sample: 105.6034507\n", cleanPrice);
        System.out.printf("Invoice Price =>  Quantlib: %.8f | Sample: 107.6863333\n", dirtyPrice);
        System.out.printf("Accrued Days =>  Quantlib: %d | Sample: 120\n", BondFunctions.accruedDays(bond));
        System.out.printf("Accrued Interest =>  Quantlib: %.7f | Sample: 2.08333333\n", bond.accruedAmount());
        System.out.printf("Convexity =>  Quantlib: %.6f | Sample: 34.377822\n",
                BondFunctions.convexity(bond, yieldRate, settlementDate));
        System.out.printf("Simple Duration =>  Quantlib: %.8f | Sample: 5.50105465\n",
                BondFunctions.duration(bond, yieldRate, Duration.Type.Simple));
        System.out.printf("Modified duration =>  Quantlib: %.8f | Sample: 5.3604846\n",
                BondFunctions.duration(bond, yieldRate, Duration.Type.Modified));
        System.out.printf("-------------------------------------------------------\n\n\n");

        System.out.printf("Accrual start date:  %s \n", BondFunctions.accrualStartDate(bond).ISO());
        System.out.printf("Accrual end date:  %s \n", BondFunctions.accrualEndDate(bond).ISO());
        System.out.printf("Accrual period:  %.4f \n", BondFunctions.accrualPeriod(bond));
        System.out.printf("Accrual Days:  %d \n", BondFunctions.accrualDays(bond));
        System.out.printf("Accrued period:  %.4f \n", BondFunctions.accruedPeriod(bond));
        System.out.printf("Basis point value:  %.4f \n", BondFunctions.basisPointValue(bond, yieldRate));
        System.out.printf("bps:  %.4f \n", BondFunctions.bps(bond, yieldRate));
        System.out.printf("yield Value Basis Point:  %.4f \n", BondFunctions.yieldValueBasisPoint(bond, yieldRate));
        System.out.printf("YTM :  %.6f \n",
                bond.yield(cleanPrice, dayCount, Compounding.Compounded, Frequency.Semiannual));

    }
}
