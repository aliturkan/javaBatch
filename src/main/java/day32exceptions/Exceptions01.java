package day32exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        System.out.println(getCharFromStringByIndex("Java", 2));
        System.out.println(getCharFromStringByIndex("Java", 4));

        System.out.println(getNumOfCharsInString("Automation"));
        System.out.println(getNumOfCharsInString(" "));
        System.out.println(getNumOfCharsInString(""));
        System.out.println(getNumOfCharsInString(null));

        System.out.println(convertStringToInt1("123") + 1);//124
        System.out.println(convertStringToInt1("1ab") + 1);

        System.out.println(convertStringToInt2("1ab") + 1);
    }
    //Example 1: Create a method to get a character from a String by using index
    public static char getCharFromStringByIndex(String s, int idx){
        try{
            return s.charAt(idx);
        }catch(StringIndexOutOfBoundsException e){//StringIndexOutOfBoundsException is thrown if non-existing index was used.
            System.out.println(idx + " does not exist as index...");
            return ' ';
        }
    }

    //Example 2: Create a method to get the number of characters in a String
    public static int getNumOfCharsInString(String s){
        try{
            return s.length();
        }catch(NullPointerException e){// NullPointerException is thrown if "null" was used with some methods in String Class
            System.out.println("This method cannot be used with null");
            return 0;
        }
    }

    //Example 3: Create a method to convert a String to an Integer
    //1.Way:
    public static int convertStringToInt1(String s){
        try {
            return Integer.valueOf(s);
        }catch(NumberFormatException e){// NumberFormatException is thrown if String in valueOf() has non-digit character/s
            System.out.println("Do not use non-digit characters in valueOf()");
            return 0;
        }
    }

    //2.Way:
    public static int convertStringToInt2(String s){
        try {
            return Integer.parseInt(s);
        }catch(NumberFormatException e){// NumberFormatException is thrown if String in valueOf() has non-digit character/s
            System.out.println("Do not use non-digit characters in valueOf()");
            return 0;
        }
    }
}