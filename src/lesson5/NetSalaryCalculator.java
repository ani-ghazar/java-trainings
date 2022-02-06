package lesson5;

public class NetSalaryCalculator {

    public static void main(String[] args) {
        int grossSalary = 750000;
        boolean isITField = false;

        double incomeTax = incomeTaxOfGrossSalary(grossSalary, isITField);
        System.out.println(incomeTax);

        double socialFee = socialFeeOfGrossSalary(grossSalary);
        System.out.println(socialFee);

        double stampFee = stampFeeOfGrossSalary(grossSalary);
        System.out.println(stampFee);

        double netSalary = grossSalary - incomeTax - socialFee - stampFee;
        System.out.println("Net salary is " + netSalary);

    }

    public static double incomeTaxOfGrossSalary(int grossSalary, boolean isITField) {

        if (isITField) {
            return grossSalary * 0.1;
        }

        return grossSalary * 0.21;
    }

    public static double socialFeeOfGrossSalary(int grossSalary) {

        if (grossSalary <= 500000) {
            return grossSalary * 0.045;
        }

        if (grossSalary <= 1020000) {
            return grossSalary * 0.1 - 27500;
        }

        return 74500;
    }

    public static double stampFeeOfGrossSalary(int grossSalary) {

        if (grossSalary <= 100000) {
            return 1500;
        }

        if (grossSalary <= 200000) {
            return 3000;
        }

        if (grossSalary <= 500000) {
            return 5500;
        }

        if (grossSalary <= 1000000) {
            return 8500;
        }

        return 15000;
    }

}
