package day02variables;

import java.util.Locale;

public class Variables02 {

        //Non-primitive data types: They can be created by Java, like String, Arrays, Scanner, ...
        //                          They can be created by developers, like Variables01, Variables02, etc.
        //                          Non-primitive data types are infinitely many.

    //String data type: String is for multiple characters.
    //                  Put the value between double quotes.
    public String nameOfStd = "Tom Hanks";

        //What is the difference between "primitive data types" and "non-primitive data types"?
        //1)primitive data types created by Java, developers cannot create primitive data types
        //  but non-primitive data types can be created by both Java and developers
        //2)primitive data type names start with lower cases, non-primitive data type names start with upper cases.
        //3)primitive data types are just 8, non-primitive data types are infinitely many.
        //4)primitive data types are stored in "Stack Memory", non-primitive data types are stored in "Heap Memory"
        //  Note: "Stack Memory" stores i)primitive data types and ii)addresses(reference) of non-primitive data types
        //        "Heap Memory" stores non-primitive data types
        //5*)non-primitive data types have methods together with the value, but primitive data types do not have methods
        //  primitive data types have just value.

    public int num = 45;
    public String city = "Miami";

        //"main method" works first in an application, like an engine in a car.
        //Every application needs a "main method", if you do not have "main method" application cannot run.

        //"void" is one of the "return type" in a method.
        //If a method does not produce a new data make the "return type" void.

    //How to create a "main method"?
    public static void main(String[] args) {
        String countryName = "Germany";
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.length());
    }
}