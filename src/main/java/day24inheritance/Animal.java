package day24inheritance;
public class Animal {
    /*
    Notes:
    1. Benefits of "inheritance"
       i) stops "repetition"
       ii) makes updating codes easy
       iii) makes "maintenance" easy
       iv) provides "atomic" structure
     2. Put common functionalities in "Parent class"; put specific functionalities in "Child class"
     3. "Parent class" and "Super class" are synonyms
        "Child class" and  "Sub class" are synonyms
     4. To make a class child of another class, we use "extends" keyword from the child to parent class
     5. "Object class" is the parent of all classes in Java
     6. All classes except "Object Class" in Java has at least one parent which is "Object Class"
     7. "Default constructor" comes from "Object class"
     8. Child classes can use class members from the parent classes
        However, parent classes cannot use anything from the child classes.
        (one way direction)
     9. Types of Inheritance:
        i) Multiple Inheritance: A child will have multiple parents.
                                  (Java doesn't support it)
                                  (Java supports "single inheritance")
        ii) Multilevel Inheritance: Child --> Parent --> GrandParent --> GreatGrandParent
                                  (Java supports "Multilevel inheritance")
        iii) Hierarchical Inheritance: Single parent multiple child classes like Anima --> (Cat and Dog)
     6. Access modifiers in Inheritance
        a) public class members (methods, variables, constructors) can be inherited without any restrictions
        b) private class members cannot be inherited
        c) default class members can be inherited if the parent and child classes are in the same package
        d) protected class members can be inherited without any restrictions
     */
    public void eat(){
        System.out.println("Animals eat ..");
    }
    public void drink(){
        System.out.println("Animals drink ..");
    }
}