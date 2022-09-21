package ru.docdoc;

public class Main {

    public static void main(String[] args) {

        System.out.println("Max Int: " + Integer.MAX_VALUE);
        System.out.println("Overflow Int: " + Integer.MAX_VALUE+1);
        System.out.println("Min Int: " + Integer.MIN_VALUE);
        System.out.println("Underflow Int: " + (Integer.MIN_VALUE-1));
        System.out.println();

        int a = 5;
        double b = 7.5;
        int c = 7;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println(a + " / " + c + " = " + (a / c));
        System.out.println(a + " % " + c + " = " + (a % b));

    }
}
