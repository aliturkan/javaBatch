package day03wrapperclasstypecastingmethodcreation;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //How to create an Object?
        //Class Name   Object Name  Assignment Operator  "new" keyword      Constructor
        Scanner        input             =                new         Scanner(System.in);

        System.out.println("Hey user enter your first name...");

        String name = input.next();

        System.out.println("Your name is " + name);

    }

}