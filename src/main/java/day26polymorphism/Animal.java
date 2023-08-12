package day26polymorphism;

public class Animal {

        /*
            1)Polymorphism has two parts;
                i)Method Overloading +
                ii)Method Overriding +
            2)We sometimes need specific implementation of a method for a child class.
              We should take the method from parent class and modify its body to have specific implementation
              This process is called "Method Overriding"
            3)In "Method Overriding", we do not touch "Method Signature" I mean we do not touch "Method Name"
              and "Method Parameters"
            4)To do "Method Overriding";
                i)Click on right button of the mouse in the child class
                ii)Click on Generate
                iii)Select "Override Methods"
                iv)From the list select the method you want to override
                v)Modify the method body, do not touch method signature
            5)"@Override" is called "Annotation", it checks "Method Overriding" rules in my code
            6)How "Access Modifiers" work in "Method Overriding"?
                i)The method in the child class cannot have narrower "Access Modifier" than the method in the parent class
                The method in the parent class is "default" ==> The method in the child class can be "default", "protected", "public"
                The method in the parent class is "protected" ==> The method in the child class can be "protected", "public"
           7)If a method in the parent class is "private" it cannot be overridden
           8)What is "IS-A Relationship" and "HAS-A Relationship"?
                i) If there is "parent - child relationship" between the classes,
                   the data types from parent to child have "HAS-A Relationship" and
                   the data types from child to parent have "IS-A Relationship".
                ii)If there is "HAS-A Relationship" or "IS-A Relationship" between two data types,
                   the data types are called "Covariant Data Types"
            9)In Method Overriding, you should have "Covariant Data Types" in return types, if you do not have "Covariant Data Types"
              return types must be the same
                i)Primitive data types are not classes, so they cannot have "parent-child relationship"
                  If there is no "parent-child relationship" you cannot have "HAS-A Relationship" or "IS-A Relationship"
                  If you cannot have "HAS-A Relationship" or "IS-A Relationship" you cannot change the return types in "Method Overriding"
                  As a result if return type of method is primitive do not touch it.
                ii)Wrapper Classes are classes but there is no "parent-child relationship" among them that is why you cannot have
                   "HAS-A Relationship" or "IS-A Relationship" among the wrapper classes.
                   If you don't have "HAS-A Relationship" or "IS-A Relationship" you cannot change the return types in "Method Overriding"
                   As a result if return type of method is a wrapper class do not touch it.
                 iii)If there is "HAS-A Relationship" or "IS-A Relationship" between the return types in "Method Overriding"
                     you can change the return types.
                     But be careful about the data the method is returning and the return type
             10) OOP has 4 principals;
                    + a)Inheritance
                    + b)Polymorphism = Method Overloading + Method Overriding
                    - c)Encapsulation
                    - d)Abstraction
         */

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

    public int move(){
        return 100;
    }

    public Integer weight(){
        return 200;
    }

    public Animal born(){
        return new Animal();
    }

}