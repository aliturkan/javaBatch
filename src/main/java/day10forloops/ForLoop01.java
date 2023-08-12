package day10forloops;

public class ForLoop01 {

    /*
        1)Loops are used for "repeated actions" in Java
        2)There are 4 loops in Java i)for-loop  ii)while loop  iii)do-while loop  iv)for-each loop
     */

    public static void main(String[] args) {

        //Example 1: Type code to print "Hi!" 5 times on the console

        //1.Way: Not recommended
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        System.out.println("===============");

        //2.Way:
        for (int i = 1; i < 6; i++) {
            System.out.println("Hi!");
        }

        for (int b = 100; b > -1; b -= 2) {
            System.out.print(b + "+");

        }
        //Example 2: Type code to print integers from 12 to 3
        for (int i = 12; i > 3; i--) {
            System.out.println(i);
        }

        //Example 3: Type code to print "even" integers from 7 to 12

        //1.Way:
        for (int i = 8; i < 13; i += 2) {
            System.out.println(i);
        }

        //2.Way
        for (int i = 7; i < 13; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }



            }
    }