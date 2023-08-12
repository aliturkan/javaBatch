package day31mapsexceptions;

public class Exceptions01 {

        /*
            1)Every system needs strict rules like traffic rules in cities
              Java is a system, it needs some strict rules which are called "Exceptions"
            2)When you get "Exception" your application will be blocked, your execution will be stopped.
              After getting any "Exception" you next codes cannot be executed.
              If you do not want your application to be blocked, you have to handle "Exception"s
              To handle "Exception"s we use "try - catch" block.
            3)In try block, Java will try to execute your code.
              If there is no issue in execution, Java does not use "catch" block.
              If any issue occurred in try bloc, Java will go to the "catch" block and execute the codes in "catch" block.
       */

    public static void main(String[] args) {

        System.out.println(divide1(6, 2));
        System.out.println(divide1(0, 2));
        System.out.println(divide1(5, 0));
        System.out.println("I am here");

        System.out.println(divide2(5, 0));

    }

    //Example 1: Create a method divides two integers
    //1.Way: Not recommended
    public static int divide1(int a, int b){
        if(b==0){
            System.out.println("Do not divide a number by zero");
            return 0;
        }else{
            return a/b;
        }
    }

    //2.Way: Recommended
    public static int divide2(int a, int b){

        int result = 0;

        try{
            result = a/b;
        }catch(ArithmeticException e){//ArithmeticException is thrown if you break any mathematical rule.
            System.out.println("Do not divide a number by zero");
        }
        return result;
    }

}