package day30iteratorsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
        //Interview Question
        //Example 1: Type code to find the number of occurrences of the words in a sentence
        //           Java, I like Java Java. ==> Java=3, I=1, like=1

    public static void main(String[] args) {

        String sentence = "Java, I like Java Java.";
        System.out.println(sentence);

        //Remove punctuation marks to make "Java," and "Java" and "Java." same with the "Java"
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);// Java I like Java Java

        //To get the words use split(" ")
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));// [Java, I, like, Java, Java]

        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        // [Java, I, like, Java, Java]
        for(String w : words){
            Integer numOfOccurrences = occurrenceMap.get(w);
            if(numOfOccurrences==null){
                occurrenceMap.put(w, 1);
            }else{
                occurrenceMap.replace(w, numOfOccurrences+1);
            }
        }
        System.out.println(occurrenceMap);
    }
}