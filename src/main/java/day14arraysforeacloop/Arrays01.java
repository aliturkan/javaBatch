package day14arraysforeacloop;

import java.util.Arrays;

public class Arrays01 {

        /*
            1)Array can contain just "primitive" data types and "references"
         */

    public static void main(String[] args) {

        //Example 1: Create an integer array with 4 elements, then find the sum of all elements
        int nums[] = new int[4];
        System.out.println(Arrays.toString(nums));// [0, 0, 0, 0]

        nums[0] = 12;
        nums[1] = 8;
        nums[2] = 10;
        nums[3] = 7;
        System.out.println(Arrays.toString(nums));// [12, 8, 10, 7]

        int sum = 0;
        //[12, 8, 10, 7]
        for(int w : nums){
            sum = sum + w;
        }
        System.out.println(sum);

        //Example 2: Create a String array with the length 5, print the elements whose length is more than 6 on the console.

        String[] cities = new String[5];
        System.out.println(Arrays.toString(cities));// [null, null, null, null, null]

        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Jacksonville";
        cities[3] = "California";
        cities[4] = "Tampa";
        System.out.println(Arrays.toString(cities));// [Miami, New York, Jacksonville, California, Tampa]

        for(String w : cities){
            if(w.length()>6){
                System.out.print(w + " ");
            }
        }

        //Example 3: Create a String array with the length 5, print the elements before "California" on the console.
        String[] city = new String[5];
        System.out.println(Arrays.toString(city));// [null, null, null, null, null]

        city[0] = "Miami";
        city[1] = "New York";
        city[2] = "Jacksonville";
        city[3] = "California";
        city[4] = "Tampa";
        System.out.println(Arrays.toString(city));// [Miami, New York, Jacksonville, California, Tampa]

        for(String w : city){
            if(w.equals("California")){
                break;
            }
            System.out.print(w + " ");
        }

        //Example 4: Create a String array with the length 5, print the elements except "California" and "Miami" on the console.
        String[] c = new String[5];
        System.out.println(Arrays.toString(c));// [null, null, null, null, null]
        c[0] = "Miami";
        c[1] = "New York";
        c[2] = "Jacksonville";
        c[3] = "California";
        c[4] = "Tampa";
        System.out.println(Arrays.toString(c));// [Miami, New York, Jacksonville, California, Tampa]

        //[Miami, New York, Jacksonville, California, Tampa]
        for(String w : c){
            if(w.equals("Miami") || w.equals("California")){
                continue;
            }
            System.out.print(w + " ");// New York Jacksonville Tampa
        }
    }
}