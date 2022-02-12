package test;

import lesson5.NetSalaryCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetSalaryCalculatorUnitTests {

    @Test
    public void testMinimalSalaryFunctionality() {

        boolean minimalSalary = NetSalaryCalculator.isMinimalSalary(25000);
        Assert.assertEquals(minimalSalary, true, "25000 is lower than a minimal salary");

    }

    @Test
    public void testIncomeTaxOfGrossSalaryInITField() {

        double incomeTax = NetSalaryCalculator.incomeTaxOfGrossSalary(500000, true);
        Assert.assertEquals(incomeTax, true, "50000 is lower than a minimal salary");

    }

    @Test
    public void testSocialFeeOfGrossSalary() {

        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(150000, true, true);
        Assert.assertEquals(socialFee, true, "6750 is lower than a minimal salary");

    }

    @Test
    public void testStampFeeOfGrossSalary() {

        double stampFee = NetSalaryCalculator.stampTaxOfGrossSalary(3000000);
        Assert.assertEquals(stampFee, true, "15000 is lower than a minimal salary");

    }

}
