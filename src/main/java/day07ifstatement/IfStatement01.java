package day07ifstatement;

public class IfStatement01 {

        // If it rains I will cancel the picnic


    public static void main(String[] args) {

        //Example 1: Type code to check if a number is even or odd.
        int num = 13;

        //1.Way:
        if(num%2==0){
            System.out.println("Even");
        }
        if(num%2!=0){
            System.out.println("Odd");
        }

        //2.Way:
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }


        //Example 2: Type code to check if initial of a String is upper case or not
        String s = "miami";

        //1.Way:
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            System.out.println("It is upper case");
        }
        if(s.charAt(0)<'A' || s.charAt(0)>'Z'){
            System.out.println("Not upper case");
        }

        //2.Way:
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            System.out.println("It is upper case");
        }else{
            System.out.println("Not upper case");
        }

        //Example 3: Type code to check if a number is positive, negative, or neutral
        int number = -5;

        if(number>0){
            System.out.println("Positive");
        }else if(number==0){
            System.out.println("Neutral");
        }else{
            System.out.println("Negative");
        }

        //Example 4: Type code to print they name when you know they number
        //           1-->Sunday, 2-->Monday, ... 7-->Saturday
        int dayNumber = 3;

        if(dayNumber==1){
            System.out.println("Sunday");
        }else if(dayNumber==2){
            System.out.println("Monday");
        }else if(dayNumber==3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        }else if(dayNumber==5){
            System.out.println("Thursday");
        }else if(dayNumber==6){
            System.out.println("Friday");
        }else if(dayNumber==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day number, please enter numbers from 1 to 7");
        }
    }
}