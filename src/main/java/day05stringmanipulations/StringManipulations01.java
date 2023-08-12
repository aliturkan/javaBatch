package day05stringmanipulations;

public class StringManipulations01 {

    /*1)toUpperCase() method converts all characters to upper cases
    2)toLowerCase() method converts all characters to lower cases
    3)substring(s, e); takes the characters starting from "s"(inclusive) ending at "e"(exclusive)
    4)substring(s); takes the characters starting from "s"(inclusive) to the end of the String
    5)split("a"); method splits the String from the given character.*/

    public static void main(String[] args) {

        //Example 1: Change the full name like initials are in upper cases, other characters are in lower cases
        //           TOM HANKS ==> Tom Hanks    or  tom hanks ==> Tom Hanks
        String name = "TOM HANKS";

        //Get the first character and change it to upper case
        String firstChar = name.substring(0,1).toUpperCase();

        //Get the first name then get the characters different from initial, change them all to lowercase
        String restOfTheFirstName = name.split(" ")[0].substring(1).toLowerCase();


        //Get the last name and convert initial to upper case
        String firstCharOfLastName = name.split(" ")[1].substring(0,1).toUpperCase();

        //Get the last name, get the characters different from first character, convert them to lower case

        String restOfTheLastName = name.split(" ")[1].substring(1).toLowerCase();

        System.out.println(firstChar + restOfTheFirstName + " " + firstCharOfLastName + restOfTheLastName);

        // 2.way
        String nameInLowerCase=name.toLowerCase();
        String initialOfFirstName = nameInLowerCase.substring(0,1).toUpperCase();
        System.out.println(initialOfFirstName+ nameInLowerCase.split(" ")[0].substring(1) );


    }

}