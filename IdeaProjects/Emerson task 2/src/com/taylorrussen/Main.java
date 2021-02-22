package com.taylorrussen;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int widthFig;
        int heightFig;
        double perimeterFig;
        double areaFig;

        System.out.println("Enter the width:");
        Scanner in = new Scanner(System.in);
        widthFig = in.nextInt();
        System.out.println("Enter the height:");
        heightFig = in.nextInt();

        perimeterFig = (widthFig *2) + (heightFig *2);
        System.out.printf("The perimeter of the rectangle is: %.2f", perimeterFig);

        System.out.println("\n");

        areaFig = (widthFig * heightFig);
        System.out.printf("And the area of the rectangle is: %.2f", areaFig);

    }
}