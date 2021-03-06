/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.income;

/**
 *
 * @author HERU
 */
public abstract interface Taxable {
    
    public static final String TAXABLE_GROSSPAY = "TAXABLE_GROSSPAY";
    public static final String TAXABLE_BASICPAY = "TAXABLE_BASICPAY";
    public static final String TAXABLE_HOLIDAYPAY = "TAXABLE_HOLIDAYPAY";
    public static final String TAXABLE_OVERTIMEPAY = "TAXABLE_OVERTIMEPAY";
    public static final String TAXABLE_NIGHTDIFFERENTIALPAY = "TAXABLE_NIGHTDIFFERENTIALPAY";
    public static final String TAXABLE_GOVERNMENTCONTRIBUTIONS = "TAXABLE_GOVERNMENTCONTRIBUTIONS";
    public static final String TAXABLE_OTHERSALARY = "TAXABLE_OTHERSALARY";
    public static final String TAXABLE_DEMINIMISBENEFITS = "TAXABLE_DEMINIMISBENIFITS";
    public static final String TAXABLE_13THMONTHPAY = "TAXABLE_13THMONTHPAY";
    public static final String TAXABLE_HAZARDPAY = "TAXABLE_HAZARDPAY";
    public static final String TAX_DUE = "TAX_DUE";
    public static final String TAX_WITHHELD = "TAX_WITHHELD";
    public static final String TAX_EXCEMPTION = "TAX_EXCEMPTION";
    public static final String TAXABLE_COMPENSATION_INCOME = "TAXABLE_COMPENSATION_INCOME";
    public static final String PREMIUM_HEALTH_EXCEMPTION = "PREMIUM_HEALTH_EXCEMPTION";
    public static final String NET_COMPENSATION = "NET_COMPENSATION";
    public static final String EXCESS_WITHHELD = "EXCESS_WITHHELD";
    public static final String OVER_WITHHELD = "OVER_WITHHELD";
    
    
    public abstract void setTaxableGrossPay(String s);
    public abstract String getTaxableGrossPay();
    
    public abstract void setTaxableBasicPay(String s);
    public abstract String getTaxableBasicPay();
    
    public abstract void setTaxableHolidayPay(String s);
    public abstract String getTaxableHolidayPay();
    
    public abstract void setTaxableOvertimePay(String s);
    public abstract String getTaxableOvertimePay();
    
    public abstract void setTaxableNightDifferentialPay(String s);
    public abstract String getTaxableNightDifferentialPay();
    
    public abstract void setTaxableGovermentContributions(String s);
    public abstract String getTaxableGovermentContributions();
    
    public abstract void setTaxableOtherSalary(String s);
    public abstract String getTaxableOtherSalary();
    
    public abstract void setTaxableDeminimisBenifits(String s);
    public abstract String getTaxableDeminimisBenifits();
    
    public abstract void setTaxable13thMonthPay(String s);
    public abstract String getTaxable13thMonthPay();
    
    public abstract void setTaxableHazardPay(String s);
    public abstract String getTaxableHazardPay();
    //
    public abstract void setTaxDue(String s);
    public abstract String getTaxDue();
    
    public abstract void setTaxWithHeld(String s);
    public abstract String getTaxWithHeld();
    
    public abstract void setTaxableCompensationIncome(String s);
    public abstract String getTaxableCompensationIncome();
    
    public abstract void setTaxExcemptionAmount(String s);
    public abstract String getTaxExcemptionAmount();

    public abstract void setPremiumHealthExcemptionAmount(String s);
    public abstract String getPremiumHealthExcemptionAmount();
    
    public abstract void setNetCompensationIncome(String s);
    public abstract String getNetCompensationIncome();
    
    public abstract String getExcessAmountWithheld();
    public abstract String getOverWithheldAmount();
}
