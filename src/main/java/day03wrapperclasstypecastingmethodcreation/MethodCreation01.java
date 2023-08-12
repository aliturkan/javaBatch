package day03wrapperclasstypecastingmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

        //Using a method inside the "main method" is called "Method Call"
        System.out.println(add(45, 57));// 102
        System.out.println(multiply(2, 10, 5));// 100
        System.out.println(getPerimeterOfRectangle(2.4, 5));// 14.8

        //Actual values used in method call are called "Argument"s
        //Variables created in method parenthesis are called "Parameter"s
        System.out.println(getSurfaceAreaOfRectangularPrism(3.2, 5, 4));// 97.6

        printNameWithExclamationMark("Tom");

    }

    public static int add(int a, int b){
        return a+b;
    }

    //Example 1: Create a method multiplies three given integers


    public static int multiply(int a, int b, int c){
        return a*b*c;
    }

    //Example 2: Create a method calculates the perimeter of a rectangle
    public static double getPerimeterOfRectangle(double a, double b){
        return 2*a + 2*b;
    }

    //Example 3: Create a method calculates the surface area of a rectangular prism
    public static double getSurfaceAreaOfRectangularPrism(double a, double b, double c){
        return 2*b*c + 2*a*c + 2*a*b;
    }

    //Example 4: Create a method prints the given name on the console with "!" at the end
    //           Tom ==> Tom!
    public static void printNameWithExclamationMark(String name){
        System.out.println(name + "!");
    }

        //Note: If a method just prints something on the console make "return type" as "void"
        //      If a method does not return a new data, its "return type" must be "void"

}