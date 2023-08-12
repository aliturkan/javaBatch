package day19arraylistsvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> emailDb = new ArrayList<>();
        emailDb.add("abc@gmail.com");
        emailDb.add("bcd@gmail.com");
        emailDb.add("cde@gmail.com");
        emailDb.add("ac@gmail.com");
        emailDb.add("bd@gmail.com");

        //Example 1: Ask user to create an email address
        //           If the email is unused accept it as email address
        //           If the email is used give a message to user and create a unique email address for the user
        Scanner input = new Scanner(System.in);
        System.out.println("Create an email address...");
        String email = input.next();

        if(emailDb.contains(email)){
            System.out.println("This is taken, you can use anyone of the followings...");

            LocalDate currentDate = LocalDate.now();
            String date = currentDate.toString().replaceAll("[^0-9]","");

            LocalTime currentTime = LocalTime.now();
            String time = currentTime.toString().split("\\.")[0].replaceAll("[^0-9]","");

            String recommended = email.split("@")[0] + date + time + "@" + email.split("@")[1];
            System.out.println(recommended);
        }else{
            System.out.println("This email can be used");
            emailDb.add(email);
        }
        System.out.println(emailDb);
    }
}