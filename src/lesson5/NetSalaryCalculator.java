package lesson5;

public class NetSalaryCalculator {

    public static void main(String[] args) {
        int grossSalary = 750000;
        boolean isITField = true;

        double incomeTax = incomeTaxOfGrossSalary(grossSalary, isITField);
        System.out.println("The income tax of the given salary is " + incomeTax);

        double socialFee = socialFeeOfGrossSalary(grossSalary);
        System.out.println("The social fee of the given salary is " + socialFee);

        double stampFee = stampFeeOfGrossSalary(grossSalary);
        System.out.println("The stamp fee of the given salary is " + stampFee);

        double netSalary = grossSalary - incomeTax - socialFee - stampFee;
        System.out.println("Net salary is " + netSalary);

    }

    public static double incomeTaxOfGrossSalary(int grossSalary, boolean isITField) {

        return isITField ? grossSalary * 0.1 : grossSalary * 0.21;
    }

    public static double socialFeeOfGrossSalary(int grossSalary) {

        return grossSalary <= 500000 ? grossSalary * 0.045 :
                (grossSalary <= 1020000 ? grossSalary * 0.1 - 27500 : 74500);
    }

    public static double stampFeeOfGrossSalary(int grossSalary) {

        return grossSalary <= 100000 ? 1500 : (grossSalary <= 200000 ? 3000 :
                (grossSalary <= 500000 ? 5500 : (grossSalary <= 1000000 ? 8500 : 15000)));
    }

}
