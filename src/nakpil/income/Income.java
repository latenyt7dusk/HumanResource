/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.income;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Duskmourne
 */
public class Income implements Taxable, NonTaxable {

    private Map<String, String> Data = new HashMap();

    public Income() {
        //Taxable Income
        this.Data.put(TAXABLE_GROSSPAY, "0");
        this.Data.put(TAXABLE_BASICPAY, "0");
        this.Data.put(TAXABLE_HOLIDAYPAY, "0");
        this.Data.put(TAXABLE_OVERTIMEPAY, "0");
        this.Data.put(TAXABLE_NIGHTDIFFERENTIALPAY, "0");
        this.Data.put(TAXABLE_OTHERSALARY, "0");
        this.Data.put(TAXABLE_GOVERNMENTCONTRIBUTIONS, "0");
        this.Data.put(TAXABLE_DEMINIMISBENEFITS, "0");
        this.Data.put(TAXABLE_13THMONTHPAY, "0");
        this.Data.put(TAXABLE_HAZARDPAY, "0");
        this.Data.put(TAX_DUE, "0");
        this.Data.put(TAX_WITHHELD, "0");
        this.Data.put(TAXABLE_COMPENSATION_INCOME, "0");
        this.Data.put(TAX_EXCEMPTION, "0");
        this.Data.put(PREMIUM_HEALTH_EXCEMPTION, "0");
        this.Data.put(NET_COMPENSATION, "0");

        //Non-Taxable Income
        this.Data.put(NONTAXABLE_GROSSPAY, "0");
        this.Data.put(NONTAXABLE_BASICPAY, "0");
        this.Data.put(NONTAXABLE_HOLIDAYPAY, "0");
        this.Data.put(NONTAXABLE_OVERTIMEPAY, "0");
        this.Data.put(NONTAXABLE_NIGHTDIFFERENTIALPAY, "0");
        this.Data.put(NONTAXABLE_OTHERSALARY, "0");
        this.Data.put(NONTAXABLE_GOVERNMENTCONTRIBUTIONS, "0");
        this.Data.put(NONTAXABLE_DEMINIMISBENEFITS, "0");
        this.Data.put(NONTAXABLE_13THMONTHPAY, "0");
        this.Data.put(NONTAXABLE_HAZARDPAY, "0");
        this.Data.put(NONTAXABLE_COMPENSATION_INCOME, "0");

    }

    public final void setData(Map<String, String> data) {
        this.Data = data;
    }

    public final Map<String, String> getData() {
        return Data;
    }

    @Override
    public final void setTaxableGrossPay(String s) {
        this.Data.put(TAXABLE_GROSSPAY, s);
    }

    @Override
    public final String getTaxableGrossPay() {
        return Data.get(TAXABLE_GROSSPAY);
    }

    @Override
    public final void setTaxableBasicPay(String s) {
        this.Data.put(TAXABLE_BASICPAY, s);
    }

    @Override
    public final String getTaxableBasicPay() {
        return Data.get(TAXABLE_BASICPAY);
    }

    @Override
    public final void setTaxableHolidayPay(String s) {
        this.Data.put(TAXABLE_HOLIDAYPAY, s);
    }

    @Override
    public final String getTaxableHolidayPay() {
        return Data.get(TAXABLE_HOLIDAYPAY);
    }

    @Override
    public final void setTaxableOvertimePay(String s) {
        this.Data.put(TAXABLE_OVERTIMEPAY, s);
    }

    @Override
    public final String getTaxableOvertimePay() {
        return Data.get(TAXABLE_OVERTIMEPAY);
    }

    @Override
    public final void setTaxableNightDifferentialPay(String s) {
        this.Data.put(TAXABLE_NIGHTDIFFERENTIALPAY, s);
    }

    @Override
    public final String getTaxableNightDifferentialPay() {
        return Data.get(TAXABLE_NIGHTDIFFERENTIALPAY);
    }

    @Override
    public final void setTaxableGovermentContributions(String s) {
        this.Data.put(TAXABLE_GOVERNMENTCONTRIBUTIONS, s);
    }

    @Override
    public final String getTaxableGovermentContributions() {
        return Data.get(TAXABLE_GOVERNMENTCONTRIBUTIONS);
    }

    @Override
    public final void setTaxableOtherSalary(String s) {
        this.Data.put(TAXABLE_OTHERSALARY, s);
    }

    @Override
    public final String getTaxableOtherSalary() {
        return Data.get(TAXABLE_OTHERSALARY);
    }

    @Override
    public void setTaxableDeminimisBenifits(String s) {
        this.Data.put(TAXABLE_DEMINIMISBENEFITS, s);
    }

    @Override
    public final String getTaxableDeminimisBenifits() {
        return Data.get(TAXABLE_DEMINIMISBENEFITS);
    }

    @Override
    public final void setTaxable13thMonthPay(String s) {
        this.Data.put(TAXABLE_13THMONTHPAY, s);
    }

    @Override
    public final String getTaxable13thMonthPay() {
        return Data.get(TAXABLE_13THMONTHPAY);
    }

    @Override
    public final void setTaxableHazardPay(String s) {
        this.Data.put(TAXABLE_HAZARDPAY, s);
    }

    @Override
    public final String getTaxableHazardPay() {
        return Data.get(TAXABLE_HAZARDPAY);
    }

    @Override
    public final void setNonTaxableGrossPay(String s) {
        this.Data.put(NONTAXABLE_GROSSPAY, s);
    }

    @Override
    public final void setTaxDue(String s) {
        this.Data.put(TAX_DUE, s);
    }

    @Override
    public final String getTaxDue() {
        return Data.get(TAX_DUE);
    }

    @Override
    public final void setTaxWithHeld(String s) {
        this.Data.put(TAX_WITHHELD, s);
    }

    @Override
    public final String getTaxWithHeld() {
        return Data.get(TAX_WITHHELD);
    }

    @Override
    public final String getNonTaxableGrossPay() {
        return Data.get(NONTAXABLE_GROSSPAY);
    }

    @Override
    public final void setNonTaxableBasicPay(String s) {
        this.Data.put(NONTAXABLE_BASICPAY, s);
    }

    @Override
    public final String getNonTaxableBasicPay() {
        return Data.get(NONTAXABLE_BASICPAY);
    }

    @Override
    public final void setNonTaxableHolidayPay(String s) {
        this.Data.put(NONTAXABLE_HOLIDAYPAY, s);
    }

    @Override
    public final String getNonTaxableHolidayPay() {
        return Data.get(NONTAXABLE_HOLIDAYPAY);
    }

    @Override
    public final void setNonTaxableOvertimePay(String s) {
        this.Data.put(NONTAXABLE_OVERTIMEPAY, s);
    }

    @Override
    public final String getNonTaxableOvertimePay() {
        return Data.get(NONTAXABLE_OVERTIMEPAY);
    }

    @Override
    public final void setNonTaxableNightDifferentialPay(String s) {
        this.Data.put(NONTAXABLE_NIGHTDIFFERENTIALPAY, s);
    }

    @Override
    public final String getNonTaxableNightDifferentialPay() {
        return Data.get(NONTAXABLE_NIGHTDIFFERENTIALPAY);
    }

    @Override
    public final void setNonTaxableGovermentContributions(String s) {
        this.Data.put(NONTAXABLE_GOVERNMENTCONTRIBUTIONS, s);
    }

    @Override
    public final String getNonTaxableGovermentContributions() {
        return Data.get(NONTAXABLE_GOVERNMENTCONTRIBUTIONS);
    }

    @Override
    public final void setNonTaxableOtherSalary(String s) {
        this.Data.put(NONTAXABLE_OTHERSALARY, s);
    }

    @Override
    public final String getNonTaxableOtherSalary() {
        return Data.get(NONTAXABLE_OTHERSALARY);
    }

    @Override
    public final void setNonTaxableDeminimisBenifits(String s) {
        this.Data.put(NONTAXABLE_DEMINIMISBENEFITS, s);
    }

    @Override
    public final String getNonTaxableDeminimisBenifits() {
        return Data.get(NONTAXABLE_DEMINIMISBENEFITS);
    }

    @Override
    public final void setNonTaxable13thMonthPay(String s) {
        this.Data.put(NONTAXABLE_13THMONTHPAY, s);
    }

    @Override
    public final String getNonTaxable13thMonthPay() {
        return Data.get(NONTAXABLE_13THMONTHPAY);
    }

    @Override
    public final void setNonTaxableHazardPay(String s) {
        this.Data.put(NONTAXABLE_HAZARDPAY, s);
    }

    @Override
    public final String getNonTaxableHazardPay() {
        return Data.get(NONTAXABLE_HAZARDPAY);
    }

    @Override
    public final void setNonTaxableCompensationIncome(String s) {
        this.Data.put(NONTAXABLE_COMPENSATION_INCOME, s);
    }

    @Override
    public final String getNonTaxableCompensationIncome() {
        return Data.get(NONTAXABLE_COMPENSATION_INCOME);
    }

    @Override
    public final void setTaxableCompensationIncome(String s) {
        this.Data.put(TAXABLE_COMPENSATION_INCOME, s);
    }

    @Override
    public final String getTaxableCompensationIncome() {
        return Data.get(TAXABLE_COMPENSATION_INCOME);
    }

    @Override
    public final void setTaxExcemptionAmount(String s) {
        this.Data.put(TAX_EXCEMPTION, s);
    }

    @Override
    public final String getTaxExcemptionAmount() {
        return Data.get(TAX_EXCEMPTION);
    }

    @Override
    public final void setPremiumHealthExcemptionAmount(String s) {
        this.Data.put(PREMIUM_HEALTH_EXCEMPTION, s);
    }

    @Override
    public final String getPremiumHealthExcemptionAmount() {
        return Data.get(PREMIUM_HEALTH_EXCEMPTION);
    }

    @Override
    public final void setNetCompensationIncome(String s) {
        this.Data.put(NET_COMPENSATION, s);
    }

    @Override
    public final String getNetCompensationIncome() {
        return Data.get(NET_COMPENSATION);
    }

    private double ExcessWithheld, OverWithheld;

    @Override
    public final String getExcessAmountWithheld() {
        this.ExcessWithheld = Double.parseDouble(Data.get(TAX_DUE)) - Double.parseDouble(TAX_WITHHELD);
        return String.valueOf((ExcessWithheld <= 0) ? 0 : ExcessWithheld);
    }

    @Override
    public final String getOverWithheldAmount() {
        this.OverWithheld = Double.parseDouble(TAX_WITHHELD) - Double.parseDouble(Data.get(TAX_DUE));
        return String.valueOf((OverWithheld <= 0) ? 0 : OverWithheld);
    }

}
