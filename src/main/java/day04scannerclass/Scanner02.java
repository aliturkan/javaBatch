package day04scannerclass;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter two numbers then do addition and multiplication operations with the numbers

        //1.Step: Create a Scanner object
        Scanner input = new Scanner(System.in);

        //2.Step: Give a message to user about what to do
        System.out.println("Enter first number...");

        //3.Step: Select appropriate method and get the data from user
        double num1 = input.nextDouble();

        System.out.println("Enter second number...");
        double num2 = input.nextDouble();

        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The multiplication is " + num1*num2);
    }
}