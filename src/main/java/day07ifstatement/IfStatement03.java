package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        /*
           Ask user to enter his age, then print his situation according to the given table
           0-4==>Baby  5-12==>Kid  13-20==>Young   21-30==>Adult  31-?==>Undefined
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        int age = input.nextInt();

        if(age<0){
            System.out.println("Negative ages are invalid");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Kid");
        }else if(age<21){
            System.out.println("Young");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Undefined age");
        }

    }

}