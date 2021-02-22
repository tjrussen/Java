package com.taylorrussen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;

        System.out.println("Input number: ");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        for(int i = 0; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d \n", number, i ,number * i);
        }


    }
}