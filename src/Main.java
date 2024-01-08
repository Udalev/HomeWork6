public class Main {
    public static void main(String[] args)
    {
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 2");
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 3");
        System.out.println();

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 4");
        System.out.println();

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Задача 5");
        System.out.println();

        int startYear = 1904;
        int endYear = 2096;

        System.out.println("Високосные года с " + startYear + " по " + endYear + ":");

        for (int year = startYear; year <= endYear; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println();
        System.out.println("Задача 6");
        System.out.println();

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задача 7");
        System.out.println();

        int number = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(number + " ");
            number *= 2;
        }

        System.out.println();
        System.out.println("Задача 8");
        System.out.println();

        int Deposit = 29000;
        int totalSavings = 0;

        for (int month = 1; month <= 12; month++) {
            totalSavings += Deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        System.out.println();
        System.out.println("Задача 9");
        System.out.println();

        double initialDeposit = 0;
        double monthlyDeposit = 29000;
        double annualInterestRate = 0.12;

        for (int month = 1; month <= 12; month++) {
            initialDeposit = initialDeposit * (1 + annualInterestRate / 12) + monthlyDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + initialDeposit + " рублей");
        }

        System.out.println();
        System.out.println("Задача 10");
        System.out.println();

        int multiplier = 2;

        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + result);
        }
    }
}