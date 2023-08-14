package day27encapsulationabstraction;

        /*
            1)Method without body is called "abstract method"
            2)Sometimes no child uses the body of a method in the parent class so
              no need to put body for the method.
              If you do not put body for the method it means you are creating "abstract method"
            3)To create an abstract method
                i)Do not type the body of the method.
                ii)Use "abstract" keyword between "access modifier" and "return type"
                iii)Make the class abstract
            4)What is the difference between "abstract method"s and "regular(concrete) method"s?
              "abstract method"s focus on "what to do", "concrete method"s focus on "what to do" and "how to do"
            5)"abstract method"s must be overridden by the child classes, otherwise Java complains.
              Because of that, if we want some functionalities to be mandatory for the child classes
              we make them abstract.
            6)An "abstract class" can have "abstract method"s, can an abstract class have "concrete method"?
              Yes, "abstract class" can have both "abstract method"s and "concrete method"s
            7)"concrete method"s are not mandatory for the child classes to override.
            8)"abstract method"s must be overridden by the concrete child classes,
              if the child class is "abstract", it is optional to override abstract methods
            9)"abstract method"s cannot be private because they must be overridden by the child classes
              if you make it "private" child classes cannot access to it cannot override.
            10)"abstract method"s cannot be final because they must be overridden by the child classes
              But final methods cannot be overridden.
            11)"abstract classes"s have "abstract methods", "abstract method"s do not have a body it means "abstract method"s are uncompleted methods.
               So abstract classes have uncompleted parts in them, so abstract classes are uncompleted templates.
               Because of that Java does not let us create objects from abstract classes.
            12)"abstract class" is a class that is why it has constructor but the constructor cannot create an object
         */

public abstract class Courses {

    public abstract void math();

    public void art(){
        System.out.println("Learn painting");
    }

}