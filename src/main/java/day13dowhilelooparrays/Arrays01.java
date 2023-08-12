package day13dowhilelooparrays;

import java.util.Arrays;

public class Arrays01 {

        /*
            1)Arrays are for storing multiple data in same data type.
         */

    public static void main(String[] args) {

        //How to create an Array
        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));// [null, null, null, null, null]

        //How to add elements into an array
        stdNames[2] = "Tom";
        stdNames[4] = "Alex";
        stdNames[0] = "Mary";
        stdNames[1] = "Jim";
        stdNames[3] = "Jhon";

        //How to print an array on the console
        System.out.println(Arrays.toString(stdNames));// [Mary, Jim, Tom, Jhon, Alex]

        //How to get a specific element from an array
        System.out.println(stdNames[3]);//Jhon

        //How to get number of elements in an array
        System.out.println(stdNames.length);

        //Example 1: Find the total number of characters used in stdNames array elements

        //1.Way:
        int total = 0;

        for(int i=0; i<stdNames.length; i++){

            total = total + stdNames[i].length();

        }
        System.out.println(total);

        //2.Way: for-each loop ==> enhanced loop
        int sum = 0;
        // [Mary, Jim, Tom, Jhon, Alex]
        for(String w : stdNames){
            sum = sum + w.length();
        }
        System.out.println(sum);
    }
}