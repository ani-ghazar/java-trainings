package test;

import lesson5.NetSalaryCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NetSalaryCalculatorUnitTests {

    @Test
    public void testMinimalSalaryIsNotBeingTaxed() {

        int grossSalary = 25000;
        boolean minimalSalary = NetSalaryCalculator.isMinimalSalary(25000);
        Assert.assertEquals(minimalSalary, true, "Given Salary Should Be Lower Than Minimal One");

        boolean isITField = false;
        double incomeTax = NetSalaryCalculator.incomeTaxOfGrossSalary(grossSalary, isITField);
        double expectedIncomeTax = 0;
        Assert.assertEquals(incomeTax, expectedIncomeTax, "No Income Tax Should Be Taken Out");

        boolean isParticipating = true;
        boolean isJoinedVoluntarily = false;
        double socialTax = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialTax = 0;
        Assert.assertEquals(socialTax, expectedSocialTax, "No Social Tax Should Be Taken Out");

        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 0;
        Assert.assertEquals(stampTax, expectedStampTax, "No Stamp Tax Should Be Taken Out");
    }

    // Income Tax Test Cases
    @Test
    public void testIncomeTaxOfGrossSalaryInITFieldIsTenPercent() {

        int grossSalary = 500000;
        boolean isITField = true;
        double incomeTax = NetSalaryCalculator.incomeTaxOfGrossSalary(grossSalary, isITField);
        double expectedIncomeTax = 50000;
        Assert.assertEquals(incomeTax, expectedIncomeTax, "Income Tax Of GrossSalary In ITField Should Be Ten Percent");

    }

    @Test
    public void testIncomeTaxOfGrossSalaryNotInITFieldIsTwentyOnePercent() {

        int grossSalary = 250000;
        boolean isITField = false;
        double incomeTax = NetSalaryCalculator.incomeTaxOfGrossSalary(grossSalary, isITField);
        double expectedIncomeTax = 52500;
        Assert.assertEquals(incomeTax, expectedIncomeTax, "Income Tax Of GrossSalary Not In ITField Should Be Twenty One Percent");

    }

    // Social Tax Test Cases
    @Test
    public void testSocialTaxOfGrossSalaryLowerOneMillionDramAndJoinedVoluntarily() {

        int grossSalary = 150000;
        boolean isParticipating = true;
        boolean isJoinedVoluntarily = true;
        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialFee = 7500;
        Assert.assertEquals(socialFee, expectedSocialFee, "Social Tax should be 7500 for Voluntarily Joined Person with 150000 Gross Salary");

    }

    @Test
    public void testSocialTaxOfGrossSalaryGreaterThanOneMillionDramAndJoinedVoluntarily() {

        int grossSalary = 1050000;
        boolean isParticipating = true;
        boolean isJoinedVoluntarily = true;
        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialFee = 51000;
        Assert.assertEquals(socialFee, expectedSocialFee, "Social Tax should be 51000 for Voluntarily Joined Person with 1050000 Gross Salary");

    }

    @Test
    public void testSocialTaxOfGrossSalaryLowerThanFiveHundredDramAndJoinedMandatory() {

        int grossSalary = 350000;
        boolean isParticipating = true;
        boolean isJoinedVoluntarily = false;
        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialFee = 15750;
        Assert.assertEquals(socialFee, expectedSocialFee, "Social Tax should be 15750 for Mandatory Joined Person with 350000 Gross Salary");

    }

    @Test
    public void testSocialTaxOfGrossSalaryBetweenFiveHundredAndMillionDramAndJoinedMandatory() {

        int grossSalary = 888000;
        boolean isParticipating = true;
        boolean isJoinedVoluntarily = false;
        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialFee = 61300;
        Assert.assertEquals(socialFee, expectedSocialFee, "Social Tax should be 61300 for Mandatory Joined Person with 888000 Gross Salary");

    }

    @Test
    public void testSocialTaxOfGrossSalaryOverMillionDramAndJoinedMandatory() {

        int grossSalary = 1350750;
        boolean isParticipating = true;
        boolean isJoinedVoluntarily = false;
        double socialFee = NetSalaryCalculator.socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        double expectedSocialFee = 74500;
        Assert.assertEquals(socialFee, expectedSocialFee, "Social Tax should be 74500 for Mandatory Joined Person with 1350750 Gross Salary");

    }

    // Stamp Taxes Test Cases
    @Test
    public void testStampTaxOfGrossSalaryLowerThanOneHundredDrams() {

        int grossSalary = 99000;
        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 1500;
        Assert.assertEquals(stampTax, expectedStampTax, "Stamp Tax for lower than 100000 Should be 1500");

    }

    @Test
    public void testStampTaxOfGrossSalaryBetweenOneAndTwoHundredDrams() {

        int grossSalary = 172000;
        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 3000;
        Assert.assertEquals(stampTax, expectedStampTax, "Stamp Tax for lower than 172000 Should be 3000");

    }

    @Test
    public void testStampTaxOfGrossSalaryBetweenTwoAndFiveHundredDrams() {

        int grossSalary = 331000;
        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 5500;
        Assert.assertEquals(stampTax, expectedStampTax, "Stamp Tax for lower than 331000 Should be 5500");

    }

    @Test
    public void testStampTaxOfGrossSalaryBetweenFiveHundredAndOneMillionDrams() {

        int grossSalary = 747000;
        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 8500;
        Assert.assertEquals(stampTax, expectedStampTax, "Stamp Tax for lower than 747000 Should be 8500");

    }

    @Test
    public void testStampTaxOfGrossSalaryOverOneMillionDrams() {

        int grossSalary = 1230000;
        double stampTax = NetSalaryCalculator.stampTaxOfGrossSalary(grossSalary);
        double expectedStampTax = 15000;
        Assert.assertEquals(stampTax, expectedStampTax, "Stamp Tax for lower than 1230000 Should be 15000");

    }

}
