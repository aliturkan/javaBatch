package day32exceptions;

public class Exceptions02 {

        /*
            1)When you use "multiple catch block"s after "try-block" the order of "multiple catch block"s does not matter.
              You can put them in any order but following the code order is the best practice
              Note: But some Exception Classes are the parent of another Exception Classes, when you use parent -child Exception Classes
                    Child Exception Class must come first
            2)"try-block" cannot be used alone;
                    i)"try-block" + single catch block
                    ii)"try-block" + multiple catch block
                    iii)"try-block" + finally block
                    iv)"try-block" + single catch block + finally block
                    v)"try-block" + multiple catch block + finally block
         */

    public static void main(String[] args) {

        System.out.println(divideByNumOfCharsInString1("240"));//120
        System.out.println(divideByNumOfCharsInString1("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInString1("2"));// ArithmeticException
        System.out.println(divideByNumOfCharsInString1(null));//NumberFormatException

        System.out.println(divideByNumOfCharsInString2("240"));//120
        System.out.println(divideByNumOfCharsInString2("2a4"));//NumberFormatException
        System.out.println(divideByNumOfCharsInString2("2"));// ArithmeticException
        System.out.println(divideByNumOfCharsInString2(null));//NumberFormatException

    }

    //Example 1: Create a method divides an integer converted from a String by 1 less than the number of characters of the String.
    //           String s = "240"; ==> 240 / 2 = 120

    //1.Way: To handle multiple exceptions
    public static int divideByNumOfCharsInString1(String s){
        try {
            int sInt = Integer.valueOf(s);// "240"; ==> 240
            int numOfChars = s.length();// "240"; ==> 3
            return sInt / (numOfChars - 1);// 240 / (3-1) ==> 120
        }catch(ArithmeticException e){
            System.out.println("There is a problem in mathematical operation");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }catch(NullPointerException e){
            System.out.println("Do nut use null with some String Class methods");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }catch(NumberFormatException e){
            System.out.println("Do not use non-digit characters in valueOf()");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }

    //2.Way: To handle multiple exceptions
    public static int divideByNumOfCharsInString2(String s){
        try {
            int sInt = Integer.valueOf(s);// "240"; ==> 240
            int numOfChars = s.length();// "240"; ==> 3
            return sInt / (numOfChars - 1);// 240 / (3-1) ==> 120
        }catch(Exception e){
            System.out.println("Exception was caught");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return 0;
        }
    }
}