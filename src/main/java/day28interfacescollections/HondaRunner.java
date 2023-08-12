package day28interfacescollections;

        /*
            What is the difference between "abstract class" and "interface"?
                1)"interface" can have just "abstract method"s but "abstract class" can have both "abstract" and "concrete" methods.
                  In Java 8, Java lets us create "methods with body" by using "default" and "static" keywords.
                  In Java 9, Java lets us create "methods with body" by using "private" keyword as well.
                2)"interface"s have "public", "static", and "final" variables, but "abstract classes" can have every type of variables
                3)A class can have just a single "abstract class parent", but a class can have many "interface parent"
                4)Both "abstract class" and "interface" cannot give you an object but "abstract class" has constructor "interface" does not have
                5)To make an "abstract class" parent of a concrete class we use "extends" keyword
                  To make an "interface" parent of a concrete class we use "implements" keyword
         */

public class HondaRunner {

    public static void main(String[] args) {

        System.out.println(Engine.volume);

        System.out.println(Brake.volume);

        Honda myHonda = new Honda();
        myHonda.eco();

        Brake.secure();

    }

}