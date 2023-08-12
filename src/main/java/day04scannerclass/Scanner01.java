package day04scannerclass;

import java.util.Scanner;

public class Scanner01 {

    /*
        1)next() is for getting "just a single word" from user.
        2)nextLine() is for getting "all the String" user entered.
        3)nextInt() is for getting integer from user.
        4)nextDouble() is for getting double from user.
        5)nextBoolean() is for getting boolean from user.
     */

    public static void main(String[] args) {

        //Example 1: Ask user to enter i)Full name ii)Age iii)Height iv)Marital status
        //           Then print them on the console in different lines with a label

        //1.Step: Create Scanner Object
        Scanner input = new Scanner(System.in);

        //2.Step: Give a message to user about what to do
        System.out.println("Please enter your full name...");

        //3.Step: Use appropriate method to get data from user
        String fullName = input.nextLine();
        System.out.println("Please enter your age...");

        int age = input.nextInt();
        System.out.println("Please enter your height...");

        double height = input.nextDouble();
        System.out.println("Please tell me, are you married?");

        boolean isMarried = input.nextBoolean();

        System.out.println("Your full name is " + fullName);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + height);
        System.out.println("Is married? " + isMarried);
    }
}