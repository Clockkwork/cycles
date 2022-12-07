import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
    }

    public static void task1() {
        System.out.println("Задача №1 ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача №2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача №3 ");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача №4 ");
        for (int i = 0; i < 17; i += 2) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача №5 ");
        for (int i = 10; i > -11; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task6() {
        System.out.println("Задача №6 ");
        for (int i = 2020; i < 2070; i += 4) {
            System.out.println("Високосный год " + i);
        }
    }

    public static void task7() {
        System.out.println("Задача №7 ");
        for (int i = 1904; i < 2097; i += 4) {
            System.out.println("Год является високосным " + i);
        }
    }

    public static void task8() {
        System.out.println("Задача №8");
        for (int i = 7; i < 100; i += 7) {
            System.out.println("Последовательность " + i);
        }
    }

    public static void task9() {
        System.out.println("Задача №9");
        for (int i = 1; i < 1025; i *= 2) {
            System.out.println("Последовательность чисел " + i);
        }
    }

    public static void task10() {
        System.out.println("Задача №10");
        int piggyBank = 29000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total + piggyBank;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
    }

    public static void task11() {
        System.out.println("Задача №11");
        float piggyBank = 29000f;
        float total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + piggyBank;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
        System.out.println("Итого сумма накоплений за год + 12% годовых " + total);
    }

    public static void task12() {
        System.out.println("Задача №12");
        int first = 0;
        int second = 1;
        int third = 1;
        System.out.println(second);
        System.out.println(third);
        for (int count = 2; count < 11; count++) {
            first = second + third;
            System.out.println(first);
            second = third;
            third = first;
        }
    }

    public static void task13() {
        System.out.println("Задача №13");
        int piggyBank = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + piggyBank;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей ");
        }
    }

    public static void task14() {
        System.out.println("Задача №14");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void task15() {
        System.out.println("Задача №15");
        int death = 8;
        int birth = 17;
        int population = 12_000_000;
        int year = 0;
        int people = 0;
        while (year < 10) {
            people = population / 1000 * (birth - death);
            population += people;
            year += 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
    }

    public static void task16() {
        System.out.println("Задача №16");
        float money = 15000f;
        int desiredAmount = 12_000_000;
        int month = 0;
        float percent = 0;
        while (money < desiredAmount) {
            percent = money / 100 * 7;
            money = money + percent;
            month += 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + (int) money + " рублей ");
        }
    }

    public static void task17() {
        System.out.println("Задача №17");
        float money = 15000f;
        int month = 0;
        float percent = 0;
        while (money < 12_000_000) {
            month += 1;
            percent = money / 100 * 7;
            money = money + percent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений равна " + (int) money + " рублей ");
            }
            }
        }

    public static void task18() {
        System.out.println("Задача №18");
        float money = 15000f;
        float totalMoney = 0;
        int year = 9;
        int monthCounter = 0;
        int lengthYear = 12;//12 месяцев в году
        int months = year * lengthYear;//Узнать сколько в 9 годах месяцев
        float percent =  0;
        while(monthCounter <= months){
            percent = totalMoney /100 * 7;
            totalMoney += percent;
            totalMoney += money;
            monthCounter ++;
            if(monthCounter % 6 == 0){
                System.out.println("Месяц " + monthCounter +  " сумма накоплений равна " + (int)totalMoney + " рублей ");
            }
        }
        }
    public static void task19(){
        System.out.println("Задача №19 ");
        int friday = 2;
        int month = 31;

        do{
            System.out.println("Сегодня пятница " + friday + " число" + ".Необходимо подготовить отчёт");
            friday += 7;
        }
        while(friday <= month);
    }

    public static void task20(){
        System.out.println("Задача №20 ");
        int yearsCounter = 0;
        int currentYear = 2022;
        int beforeCurrentYear = 200;
        int afterCurrentYear = 100;
        int flyComet = 79;

        while(yearsCounter <= currentYear + afterCurrentYear){
            yearsCounter +=flyComet;
            if(yearsCounter >= currentYear - beforeCurrentYear&&yearsCounter <= currentYear + afterCurrentYear){
                System.out.println(yearsCounter);
            }


        }
    }
        }






