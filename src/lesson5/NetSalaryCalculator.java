package lesson5;

public class NetSalaryCalculator {

    public static void main(String[] args) {

        int grossSalary = 20000;
        boolean isITField = false;

        double incomeTax = incomeTaxOfGrossSalary(grossSalary, isITField);
        System.out.println("The income tax of the given salary is " + incomeTax);

        double socialFee = socialFeeOfGrossSalary(grossSalary);
        System.out.println("The social fee of the given salary is " + socialFee);

        double stampFee = stampFeeOfGrossSalary(grossSalary);
        System.out.println("The stamp fee of the given salary is " + stampFee);

        double netSalary = grossSalary - incomeTax - socialFee - stampFee;
        System.out.println("Net salary is " + netSalary);

    }

    public static boolean isConsideredAsMinimalSalary(int grossSalary) {

        if (grossSalary < 60000) {
            return true;
        }

        return false;
    }

    public static double incomeTaxOfGrossSalary(int grossSalary, boolean isITField) {

        double incomeTax = 0;

        if (!isConsideredAsMinimalSalary(grossSalary)) {
            incomeTax = isITField ? grossSalary * 0.1 : grossSalary * 0.21;
        }

        return incomeTax;
    }

    public static double socialFeeOfGrossSalary(int grossSalary) {

        double socialFee = 0;

        if (!isConsideredAsMinimalSalary(grossSalary)) {
            socialFee = grossSalary <= 500000 ? grossSalary * 0.045 :
                    (grossSalary <= 1020000 ? grossSalary * 0.1 - 27500 : 74500);
        }

        return socialFee;
    }

    public static double stampFeeOfGrossSalary(int grossSalary) {

        double stampFee = 0;

        if (!isConsideredAsMinimalSalary(grossSalary)) {
            stampFee = grossSalary <= 100000 ? 1500 : (grossSalary <= 200000 ? 3000 :
                    (grossSalary <= 500000 ? 5500 : (grossSalary <= 1000000 ? 8500 : 15000)));
        }

        return stampFee;
    }

}
