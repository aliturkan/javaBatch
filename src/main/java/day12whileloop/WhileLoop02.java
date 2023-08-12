package day12whileloop;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

        /*
            Example 1: Write a Java Program to Print Rectangle Star Pattern using while Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and the column numbers");
        int row = input.nextInt();
        int column = input.nextInt();

        int i = 1;

        while(i<=row){

            int k =1;
            while(k<=column){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;

        }
    }
}