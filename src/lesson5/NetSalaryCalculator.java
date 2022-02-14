package lesson5;

public class NetSalaryCalculator {

    public static void main(String[] args) {

        int grossSalary = 1050000;
        boolean isITField = true;

        double incomeTax = incomeTaxOfGrossSalary(grossSalary, isITField);
        System.out.println("The income tax of the given salary is " + incomeTax);

        boolean isParticipating = true;
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

        return grossSalary < 68000 ? true : false;
    }

    /**
     *
     * @param grossSalary The given gross salary
     * @param isITField Boolean value to define whether the employee is from IT field, or no
     * @return Income tax of the given gross salary
     */
    public static double incomeTaxOfGrossSalary(int grossSalary, boolean isITField) {

        double incomeTax = 0;

        if (!isMinimalSalary(grossSalary)) {
            incomeTax = isITField ? grossSalary * 0.1 : grossSalary * 0.21;
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

        if (!isMinimalSalary(grossSalary)) {
            if (isParticipating) {
                if (isJoinedVoluntarily) {
                    socialTax = grossSalary < 1020000 ? grossSalary * 0.05 : 51000;
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

        if (!isMinimalSalary(grossSalary)) {
            return socialTaxOfMandatoryJoined;
        }

        if (grossSalary < 500000) {
            socialTaxOfMandatoryJoined = grossSalary * 0.045;
        } else if (grossSalary < 1020000) {
            socialTaxOfMandatoryJoined = grossSalary * 0.1-27500;
        } else {
            socialTaxOfMandatoryJoined = 74500;
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

        if(!isMinimalSalary(grossSalary)) {
            return stampTax;
        }

        if (grossSalary <= 100000) {
            stampTax = 1500;
        } else if (grossSalary <= 200000) {
            stampTax = 3000;
        } else if (grossSalary <= 500000) {
            stampTax = 5500;
        } else if(grossSalary <= 1000000) {
            stampTax = 8500;
        } else {
            stampTax = 15000;
        }

        return stampTax;
    }

}
