package day14arraysforeacloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Type code lets user enter many student names into an array.
        //           Whenever user wants he should be able to quit
        //           When I quit or complete I should be able see all elements on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students you want to add...");
        int n = input.nextInt();
        String[] names = new String[n];

        for(int i=0; i<n; i++){

            System.out.println("Please enter " + (i+1) + ". student name, to quit press 'q'");

            String stdName = input.next();

            if(!stdName.equalsIgnoreCase("Q")){

                names[i] = stdName;

            }else{
                break;
            }
        }
        //[r, u, t, null, null, null, ...]
        for(String w : names){
            if(w==null){
                break;
            }
            System.out.print(w + " ");
        }
    }
}