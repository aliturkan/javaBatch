package day05stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password...");
        String pwd = input.nextLine();

        boolean firstRule =pwd.length()>7;


        boolean secondRule=!pwd.contains(" ");


        boolean thirdRule=pwd.replaceAll("[^A-Z]","").length()>0;


        boolean fourthRule=pwd.replaceAll("[^a-z]","").length()>0;


        boolean fifthRule=pwd.replaceAll("[A-Za-z0-9]","").length()>0;


        boolean sixthRule=pwd.replaceAll("[^0-9]","").length()>0;


        System.out.println(firstRule && secondRule && thirdRule && fourthRule && fifthRule && sixthRule);

    }
}
