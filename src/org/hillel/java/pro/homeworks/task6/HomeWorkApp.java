package org.hillel.java.pro.homeworks.task6;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("1.");
        printThreeWords();
        System.out.println("2.");
        checkSumSign();
        System.out.println("3.");
        printColor();
        System.out.println("4.");
        compareNumbers();
        System.out.println("5.");
        System.out.println(isSumOfNumbersInRange(6,5));
        System.out.println(isSumOfNumbersInRange(2,19));
        System.out.println("6.");
        isNumberPositiveOrNegative(5);
        isNumberPositiveOrNegative(-8);
        System.out.println("7.");
        System.out.println("Is number '-5' negative ? "+isNumberNegative(-5));
        System.out.println("Is number '12' negative ? "+isNumberNegative(12));
        System.out.println("8.");
        printString("Task 8", 8);
        System.out.println("9*.");
        System.out.println("Is year 1979 leap ? "+isYearLeap(1979));
        System.out.println("Is year 2000 leap ? "+isYearLeap(2009));
        System.out.println("Is year 2024 leap ? "+isYearLeap(2024));

    }

    public static void printThreeWords(){

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign(){

        int a = 8;
        int b = -15;

        if (a+b >= 0) System.out.println("Сума позитивна");
        else System.out.println("Сума негативна");
    }

    public static void printColor(){

        int value = 160;

        if (value <= 0) System.out.println("Червоний");
        else if ((value>0) && (value<=100)) System.out.println("Жовтий");
        else if (value>100) System.out.println("Зелений");

    }

    public static void compareNumbers(){

        int a = 67;
        int b = 67;

        if (a >= b) System.out.println(" a >= b");
        else System.out.println("a < b");
    }

    public static boolean isSumOfNumbersInRange(int a, int b){

        if (a+b >= 10 && a+b <=20) return true;
        else return false;

    }

    public static void isNumberPositiveOrNegative(int number){
        if (number >= 0 ) System.out.println( number + " є додатнім числом.");
        else System.out.println( number + " є від’ємним числом.");
    }

    public static boolean isNumberNegative(int number){
        if (number >= 0 ) return false;
        else return true;
    }

    public static void printString(String stringToPrint, int count){

        for (int i = 1; i < count+1; i++) {
            System.out.println(i+" : " + stringToPrint);
        }
    }

    public static boolean isYearLeap(int year){

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
