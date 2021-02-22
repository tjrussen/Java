package com.taylorrussen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int numberThree;
        double totalAverage;

        System.out.println("Enter the first number:");
        Scanner in = new Scanner(System.in);
        numberOne = in.nextInt();
        System.out.println("Enter the second number:");
        numberTwo = in.nextInt();
        System.out.println("Enter final number:");
        numberThree = in.nextInt();

        totalAverage = (numberOne + numberTwo + numberThree) / 3;

        System.out.printf("The average for these numbers is %5.2f", totalAverage);
    }
}

