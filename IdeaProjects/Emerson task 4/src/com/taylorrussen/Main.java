package com.taylorrussen;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        double additionResult;
        double subtractionResult;
        double multiResult;
        float divisionResult;

        System.out.println("Input your first number: ");
        Scanner in = new Scanner(System.in);
        firstNumber = in.nextInt();

        System.out.println("Enter your second number: ");
        secondNumber = in.nextInt();

        additionResult = (firstNumber + secondNumber);
        System.out.printf("Addition result: %.2f \n", additionResult);

        subtractionResult = (firstNumber - secondNumber);
        System.out.printf("Subtraction result: %.2f \n", subtractionResult);

        multiResult = (firstNumber * secondNumber);
        System.out.printf("Multiplication result: %.2f \n", multiResult);

        divisionResult = (firstNumber / secondNumber);
        System.out.printf("Division result: %.2f \n" , divisionResult);


    }
}
