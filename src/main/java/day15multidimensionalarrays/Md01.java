package day15multidimensionalarrays;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        //How to create multidimensional array
        int[][] a = new int[3][2];

        //Arrays.toString(a) is to print one dimensional arrays
        System.out.println(Arrays.toString(a));// [[I@3cb5cdba, [I@56cbfb61, [I@1134affc]

        //Arrays.deepToString(a) is to print multidimensional arrays
        System.out.println(Arrays.deepToString(a));// [ [0, 0], [0, 0], [0, 0] ]

        //How to add elements into a multidimensional array
        a[0][0] = 8;
        a[0][1] = 10;

        a[1][0] = 7;
        a[1][1] = 5;

        a[2][0] = 11;
        a[2][1] = 3;
        System.out.println(Arrays.deepToString(a));// [[8, 10], [7, 5], [11, 3]]

        //How to create a multidimensional array in short way
        int[][] b = { {9, 12, 31}, {5, 4}, {8}, {10, 6} };
        System.out.println(Arrays.deepToString(b));// [[9, 12, 31], [5, 4], [8], [10, 6]]

        //Example 1: Create a multidimensional array and find the sum of all elements in the multidimensional array
        int[][] c = { {4, 5}, {9, 11, 6} };

        int sum = 0;
        //{ {4, 5}, {9, 11, 6} }
        for(int[] w : c){
            for(int u : w){
                sum = sum + u;
            }
        }
        System.out.println(sum);

        //Example 2: Type code to find the total number of elements in a multidimensional array
        String[][] names = { {"Tom"}, {"Jim", "Ali"}, {"Mark", "Jack", "Brad"} };

        int total = 0;
        //{ {"Tom"}, {"Jim", "Ali"}, {"Mark", "Jack", "Brad"} }
        for(String[] w : names){
            total = total + w.length;
        }
        System.out.println(total);
    }
}