package day16arraylists;

import java.util.ArrayList;

public class ArrayList02 {

    public static void main(String[] args) {

        //Example 1: Create 2 Character ArrayList and check if the lists are equal to each other or not
        ArrayList<Character> ch1 = new ArrayList<>();
        ch1.add('j');
        ch1.add('a');
        ch1.add('v');
        ch1.add('a');
        System.out.println(ch1);// [j, a, v, a]

        ArrayList<Character> ch2 = new ArrayList<>();
        ch2.add('j');
        ch2.add('a');
        ch2.add('v');
        ch2.add('a');
        System.out.println(ch2);// [j, a, v, a]

        if(ch1.equals(ch2)){//equals() checks i)size ii)elements iii)indexes of the elements
            System.out.println("They are equal..");
        }else{
            System.out.println("They are not equal");
        }

        int idxOfFirstOccurrence = ch1.indexOf('a');// 1
        System.out.println(idxOfFirstOccurrence);

        int idxOfLastOccurrence = ch1.lastIndexOf('a');// 3
        System.out.println(idxOfLastOccurrence);

        //Example 2: Type code to print unique elements in an ArrayList
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');

        for(Character w : letters){
            if(letters.indexOf(w) == letters.lastIndexOf(w)){
                System.out.print(w);
            }
        }
    }
}















