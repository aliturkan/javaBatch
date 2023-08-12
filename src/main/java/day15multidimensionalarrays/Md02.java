package day15multidimensionalarrays;

import java.util.Arrays;

public class Md02 {

    public static void main(String[] args) {

        //Example 1: Convert a multidimensional array to a one dimensional array
        //           { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }
        String[][] words = { {"learn", "java", "it"}, {"is", "easy"} };

        //1.Step: Create a one dimensional array
        //        We need to calculate the number of elements in the multidimensional array
        int totalNumOfElements = 0;
        //{ {"learn", "java", "it"}, {"is", "easy"} }
        for(String[] w : words){
            totalNumOfElements = totalNumOfElements + w.length;
        }

        String[] newWords = new String[totalNumOfElements];
        System.out.println(Arrays.toString(newWords));// [null, null, null, null, null]

        //2.Step: Transfer elements from multidimensional array to one dimensional array
        //{ {"learn", "java", "it"}, {"is", "easy"} }
        int idx = 0;
        //{ {"learn", "java", "it"}, {"is", "easy"} }
        for(String[] w : words){
            //{"is", "easy"}
            //{"learn", "java", "it"}
            for(String u : w){
                newWords[idx] = u;
                //newWords[0] = "Learn"
                //newWords[1] = "Java"
                //newWords[2] = "it"
                idx++;
            }
        }
        System.out.println(Arrays.toString(newWords));//[learn, java, it, is, easy]
    }
}