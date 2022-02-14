package lesson5;

public class NetSalaryCalculator {

    public static void main(String[] args) {

        int grossSalary = 550000;
        boolean isITField = false;

        double incomeTax = incomeTaxOfGrossSalary(grossSalary, isITField);
        System.out.println("The income tax of the given salary is " + incomeTax);

        boolean isParticipating = false;
        boolean isJoinedVoluntarily = false;
        double socialFee = socialTaxOfGrossSalary(grossSalary, isParticipating, isJoinedVoluntarily);
        System.out.println("The social fee of the given salary is " + socialFee);

        double stampFee = stampTaxOfGrossSalary(grossSalary);
        System.out.println("The stamp fee of the given salary is " + stampFee);

        double netSalary = grossSalary - incomeTax - socialFee - stampFee;
        System.out.println("Net salary is " + netSalary);

    }

    /**
     *
     * @param grossSalary The given gross salary
     * @return true if the grossSalary is lower than the defined minimal salary, false otherwise
     */
    public static boolean isMinimalSalary(int grossSalary) {

        int minimalSalary = 68000;
        return grossSalary <= minimalSalary ? true : false;
    }

    /**
     *
     * @param grossSalary The given gross salary
     * @param isITField Boolean value to define whether the employee is from IT field, or no
     * @return Income tax of the given gross salary
     */
    public static double incomeTaxOfGrossSalary(int grossSalary, boolean isITField) {

        double incomeTax = 0;
        double grossSalaryInITField = grossSalary * 0.1;
        double grossSalaryOutOfITField = grossSalary * 0.21;

        if (!isMinimalSalary(grossSalary)) {
            incomeTax = isITField ? grossSalaryInITField : grossSalaryOutOfITField;
        }

        return incomeTax;
    }

    /**
     *
     * @param grossSalary The given gross salary
     * @param isParticipating Boolean value to define whether the employee is participating in the rule, or no
     * @param isJoinedVoluntarily Boolean value to define whether the employee joined voluntarily or mandatory
     * @return Social tax of the given gross salary
     */
    public static double socialTaxOfGrossSalary(int grossSalary, boolean isParticipating, boolean isJoinedVoluntarily) {

        double socialTax = 0;

        int socialTaxBound = 1020000;
        double floatingTaxOfVoluntarilyJoined = grossSalary * 0.05;
        double fixedTaxOfVoluntarilyJoined = 51000;

        if (!isMinimalSalary(grossSalary)) {
            if (isParticipating) {
                if (isJoinedVoluntarily) {
                    socialTax = grossSalary < socialTaxBound ? floatingTaxOfVoluntarilyJoined : fixedTaxOfVoluntarilyJoined;
                } else {
                    socialTax = socialTaxOfMandatoryJoined(grossSalary);
                }
            }
        }

        return socialTax;
    }

    /**
     *
     * @param grossSalary The given gross salary
     * @return Mandatory social tax of the given gross salary
     */
    private static double socialTaxOfMandatoryJoined(int grossSalary) {

        double socialTaxOfMandatoryJoined = 0;

        if (isMinimalSalary(grossSalary)) {
            return socialTaxOfMandatoryJoined;
        }

        int socialTaxBound1 = 500000;
        double socialTaxForBound1 = grossSalary * 0.045;
        int socialTaxBound2 = 1020000;
        double socialTaxForBound2 = grossSalary * 0.1-27500;
        double socialTaxForBound3 = 74500;

        if (grossSalary < socialTaxBound1) {
            socialTaxOfMandatoryJoined = socialTaxForBound1;
        } else if (grossSalary < socialTaxBound2) {
            socialTaxOfMandatoryJoined = socialTaxForBound2;
        } else {
            socialTaxOfMandatoryJoined = socialTaxForBound3;
        }

        return socialTaxOfMandatoryJoined;

    }

    /**
     *
     * @param grossSalary The given gross salary
     * @return Stamp tax of the given gross salary
     */

    public static double stampTaxOfGrossSalary(int grossSalary) {

        double stampTax = 0;

        if(isMinimalSalary(grossSalary)) {
            return stampTax;
        }

        int stampTaxBound1 = 100000;
        double stampTaxForBound1 = 1500;
        int stampTaxBound2 = 200000;
        double stampTaxForBound2 = 3000;
        int stampTaxBound3 = 500000;
        double stampTaxForBound3 = 5500;
        int stampTaxBound4 = 1000000;
        double stampTaxForBound4 = 8500;
        double stampTaxForBound5 = 15000;

        if (grossSalary <= stampTaxBound1) {
            stampTax = stampTaxForBound1;
        } else if (grossSalary <= stampTaxBound2) {
            stampTax = stampTaxForBound2;
        } else if (grossSalary <= stampTaxBound3) {
            stampTax = stampTaxForBound3;
        } else if(grossSalary <= stampTaxBound4) {
            stampTax = stampTaxForBound4;
        } else {
            stampTax = stampTaxForBound5;
        }

        return stampTax;
    }

}
