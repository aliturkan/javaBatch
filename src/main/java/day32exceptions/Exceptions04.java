package day32exceptions;

public class Exceptions04 {

        /*
            1)finally block is used for the codes will be executed for every scenario
              like cutting connection with the database
            2)Could you please explain "final", "finally", and "finalize"
                    "final": We learned this
                    "finally": We learned it over here
                    "finalize": It is a method, it is used before destroying data in memory by Garbage Collector.
         */

    public static void main(String[] args) {
        System.out.println(divide(6, 2));
        System.out.println(divide(6, 0));
    }

    //Example 1: Create a method divides two integers
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }finally{
            System.out.println("The operation is completed");
        }
    }
}














