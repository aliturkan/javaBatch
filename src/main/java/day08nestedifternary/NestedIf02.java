package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {
        /*
                Type java code by using nested if.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();

        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap year");
            }else{
                System.out.println("Not leap year");
            }
        }else {
            if(year%4==0){
                System.out.println("Leap year");
            }else{
                System.out.println("Not leap year");
            }
        }
    }
}