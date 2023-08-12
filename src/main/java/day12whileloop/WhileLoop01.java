package day12whileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Type code to print integers from 3 to 6 on the console

        //1.Way:
        for(int i=3; i<7; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Way:
        int i=3;

        while(i<7){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: Type code to print odd integers from 10 to 4 on the console
        int k=10;

        while(k>3){
            if(k%2!=0){
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //Example 3: Type code to find the sum of the even integers from 10 to 13
        int m=10;

        int sum=0;

        while(m<14){
            if(m%2==0){
                sum=sum+m;
            }
            m++;
        }
        System.out.println(sum);

        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6
        int n = -587;
        n = Math.abs(n);

        int sumOfDigits = 0;

        while(n>0){
            sumOfDigits = sumOfDigits + n%10;
            n/=10;
        }
        System.out.println(sumOfDigits);

        /*
            Example 5: Type java code by using while loop,
                    Write a program that prompts the user to input a number.
                    It should then print the multiplication table of that number.
                    3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to see its multiplication table");
        int a = input.nextInt();

        int b = 1;

        while(b<11){
            System.out.println(a + "x" + b + "=" + (a*b));
            b++;
        }
    }
}