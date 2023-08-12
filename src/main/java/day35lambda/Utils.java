package day35lambda;

public class Utils {


    public static int getSumOfDigits(int a) {

        int sum = 0;

        while (a > 0) {
            sum = sum + a % 10;
            a = a / 10;
        }
        return sum;
    }


    public static int getSquare(int a) {
        return a * a;
    }


    public static void printInTheSameLineWithSpace(Object s) {
        System.out.print(s + " ");
    }


    public static boolean checkToBeEven(int a) {
        return a % 2 == 0;
    }


    public static boolean checkToBeOdd(int a) {
        return a % 2 != 0;
    }
}












