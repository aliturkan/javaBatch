package day04scannerclass;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 5 digit number...");
        short num =input.nextShort();

        int firstTwo = num/1000;
        int lastTwo = num%100;
        System.out.println("The sum is " + (firstTwo+lastTwo));

    }

}