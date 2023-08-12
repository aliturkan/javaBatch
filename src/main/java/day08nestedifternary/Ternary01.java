package day08nestedifternary;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a number is positive or not

        //Use if-else statement
        int num = -12;
        if(num>0){ System.out.println("Positive"); }else{ System.out.println("Not positive"); }

        //Use ternary statement
        String result = num>0 ? "Positive" : "Not positive";
        System.out.println(result);

        //Example 2: Type code to check if a number is even or odd
        int number = 13;

        String r = number%2==0 ? "Even" : "Odd";
        System.out.println(r);

        //Example 3: Type code to find the minimum of two integers
        int i = 21;
        int k = 21;

        int min = i<k ? i : k;
        System.out.println(min);

        //Example 4: Type code to calculate the "absolute value" of a number
        //           5 ==> 5        -5 ==> -1*-5         0 ==> 0
        int m = -5;

        int abs = m>0 ? m : -1*m;
        System.out.println(abs);

        //Example 5:  You have 2 integers;
        //            If both of the integers are positive do multiplication.
        //            Otherwise, return "I do not know how to multiply"
        int a = 5;
        int b = -7;

        Object d = a>0 && b>0 ? a*b : "I do not know how to multiply";
        System.out.println(d);

        //Example 6: You have 2 integers
        //           If both are positive do addition
        //           Otherwise return the maximum one
        int f = 15;
        int g = -12;

        int fg = f>0 && g>0 ? f+g : (f>g ? f : g);
        System.out.println(fg);
    }
}