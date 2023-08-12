package day11forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop02 {

    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter row number");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }*/

        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter row number");
        int size = input.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
