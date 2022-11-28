import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        // Задача 1
        System.out.println("Задача 1");
        int capital = 2_459_000;
        int deposit = 15_000;
        double sum = 0;
        int month = 1;
        double percentPerMonth = 0.01;
        while (sum <= capital) {
            sum += deposit;
            month++;
            sum = sum + (sum * percentPerMonth);
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }

        // Задача 2
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++);
            System.out.print(" ");
        }
        System.out.println(" ");
        for (number = 10; number > 0; number--) {
            System.out.print(number);
            System.out.print(" ");
        }

        System.out.println(" ");

        // Задача 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRatePerYear1000 = 17;
        int mortalityPerYear1000 = 8;
        int growth = birthRatePerYear1000 - mortalityPerYear1000;
        for (int year = 1; year <= 10; year++) {
            population += population * growth / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        }



        // Задача 4
        System.out.println("Задача 4");
        int saving = 12_000_000;
        int depositAmount = 15_000;
        double percentagePerMonth = 0.07;
        int countMonth = 1;
        for (; depositAmount < saving; countMonth++) {
            depositAmount += depositAmount * percentagePerMonth;
            System.out.println("За " + countMonth + " месяцев, накопил " + depositAmount + " рублей");
        }

        // Задача 5
        System.out.println("Задача 5");
        int saving1 = 12_000_000;
        int depositAmount1 = 15_000;
        double percentagePerMonth1 = 0.07;
        int countMonth1 = 1;
        for (; depositAmount1 < saving1; countMonth1++) {
            depositAmount1 += depositAmount1 * percentagePerMonth1;
            if (countMonth1 % 6 == 0) {
                System.out.println("За " + countMonth1 + " месяцев, накопил " + depositAmount1 + " рублей");
            }
        }


        // Задача 6
        System.out.println("Задача 6");
        int month1 = 9 * 12;
        int depositAmount2 = 15_000;
        double percentagePerMonth2 = 0.07;
        int countMonth2 = 1;
        for (; countMonth2 <= month1; countMonth2++) {
            depositAmount2 += depositAmount2 * percentagePerMonth2;
            if (countMonth2 % 6 == 0) {
                System.out.println("За " + countMonth2 + " месяцев, накопил " + depositAmount2 + " рублей");
            }
        }

        // Задача 7
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет \n", day);
        }

        // Задача 8
        System.out.println("Задача 8");
        int year1 = 0;
        int nowYear = LocalDate.now().getYear();
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int period = 79;
        while (year1 <= finishYear) {
            if (year1 >= startYear) {
                System.out.println(year1);
            }
            year1 += period;
        }

        // Задача 9
        System.out.println("Задача 9");
        int numberTwo = 2;
        for (int i = 1; i <=10; i++) {
            System.out.println(numberTwo + " * " + i + " = " + numberTwo * i);
        }
    }
}