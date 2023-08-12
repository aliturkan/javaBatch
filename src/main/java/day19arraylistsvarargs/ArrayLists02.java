package day19arraylistsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Example 2: Ask user to enter an integer from 1 to 10
        //           If the number user entered exists in the Database(DB) change the number to "Bingo"
        //           If the number user entered does not exist in the DB add it into the DB
        //           If all records in the DB is "Bingo" give a message to the user like "You won!"

        List<String> dataBase = new ArrayList<>();
        dataBase.add("5");
        dataBase.add("8");
        dataBase.add("2");
        dataBase.add("9");

        Scanner input = new Scanner(System.in);

        int counter = 0;

        do{
            System.out.println("Enter an integer from 1 to 10");
            String n = input.next();

            int num = Integer.valueOf(n);

            if(num>10 || num<1){
                System.out.println("Use the numbers from 1 to 10");
            }else if(dataBase.contains(n)){
                dataBase.set(dataBase.indexOf(n), "Bingo");
                counter++;
            }else{
                dataBase.add(n);
            }

            if(counter== dataBase.size()){
                System.out.println("You won!");
                break;
            }

        }while(true);
        System.out.println(dataBase);
    }
}