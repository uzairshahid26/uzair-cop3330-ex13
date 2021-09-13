/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = scanner.nextInt();

        System.out.print("What is the rate? ");
        double rate = scanner.nextDouble();

        System.out.print("What is the number of years? ");
        int year = scanner.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int number = scanner.nextInt();

        // Calculation
        double A = principal*Math.pow(1+((rate*0.01)/number),number*year);

        // Print the answer
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principal, rate, year, number, A);

        scanner.close();

    }
}
