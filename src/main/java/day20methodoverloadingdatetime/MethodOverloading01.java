package day20methodoverloadingdatetime;

public class MethodOverloading01 {

        /*
            1)If you create methods i)with the same name and ii)different parameters iii)in a class, it is called "Method Overloading"
            2)To mae the parameters different i)Change the data type of the parameters
                                              ii)Change the number of the parameters
                                              iii)Change the order of the parameters if the data types of the parameters are different
            3)By using "Method Overloading" you will be able to see all usages of a method
              For example when you use "indexOf()" method for a String Java will display 4 options to use.
              If the names are different it would not be possible to see all usages when you type indexOf() after a String
            4)"private methods" can be overloaded as well, because "Method Overloading" is done in a single class, if you are not going outside the
              class being private does not create any issue.
            5)Whenever you do method overloading if you need you can change the return type of the method. It is not problem for method overloading.
            6)Whenever you do method overloading if you need you can change the body of the method. It is not problem for method overloading.
            Note: i)Do not touch method name
                  ii)Changing parameters is mandatory
                  iii)Changing access modifier, return type, and method body is optional, if you need change them

            Note: In Method Overloading we are changing the "Method Signature"
                  "Method Signature" has 2 parts one is "Method Name" the other is "Parameters"
                  We change just the "Parameters" part in overloading
            Note: Other name of the "Method Overloading" is "Polymorphism" or "Static Polymorphism"
         */

    public static void main(String[] args) {

        multiply(3, 5);

        multiply(3.2, 5);

    }

    //Create a method multiplies two integers
    private static int multiply(int a, int b){
        return a*b;
    }

    //Create a method multiplies an integer by a double
    private static double multiply(int a, double b){
        return a*b;
    }

    //Create a method multiplies a double by an integer
    public static double multiply(double a, int b){
        return a*b;
    }

    //Create a method multiplies three integers
    public static int multiply(int a, int b, int c){
        return a*b*c;
    }


}