package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {

    /*
           Example 1: Type code to find the number of occurrences of letters in a sentence
                      Java is easy. ==> J=1, a=3, v=1, i=1, s=2, y=1
    */

    public static void main(String[] args) {

        String sentence = "Java is easy.";

        sentence = sentence.replaceAll("[^A-Za-z]", "");
        System.out.println(sentence);// Javaiseasy

        String[] letters = sentence.split("");
        System.out.println(Arrays.toString(letters));// [J, a, v, a, i, s, e, a, s, y]

        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        // [J, a, v, a, i, s, e, a, s, y]
        for(String w : letters){

            Integer numOfOccurrence = occurrenceMap.get(w);
            if(numOfOccurrence==null){
                occurrenceMap.put(w, 1);
            }else {
                occurrenceMap.put(w, numOfOccurrence + 1);
            }
        }
        System.out.println(occurrenceMap);
    }
}