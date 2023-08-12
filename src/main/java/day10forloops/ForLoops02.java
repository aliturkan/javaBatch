package day10forloops;

public class ForLoops02 {

    public static void main(String[] args) {

        //Example 1: Put "*" between 2 consecutive characters and to the end in a String.
        //For example; Java ==> J*a*v*a*
        String s = "Java";
        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        //Example 2: Type code to print unique characters in a String. Hello ==> Heo
        String t = "Hello";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch)==t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }

        System.out.println();
        //Example 3: Type code to reverse a String
        //           For Example: Tom ==> moT
        String u = "Mark";
        String rev = "";

        for(int i=u.length()-1; i>=0; i--){

            rev = rev + u.charAt(i);

        }
        System.out.println(rev);

    }
}