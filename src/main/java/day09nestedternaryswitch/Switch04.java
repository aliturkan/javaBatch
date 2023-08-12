package day09nestedternaryswitch;

import java.util.Scanner;

public class Switch04 {

        /*
            Switch Statement can be used with String, int, char but cannot be used with long, double, float, boolean
         */

    public static void main(String[] args) {

        //Example 1: Create a calculator does +, -, *, /, %
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the operation among +, -, *, /, %");
        char opr = input.next().charAt(0);

        System.out.println("Enter two integers to do the operation");
        int a = input.nextInt();
        int b = input.nextInt();

        switch(opr){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "x" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + ":" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Undefined operation");
        }
    }
}