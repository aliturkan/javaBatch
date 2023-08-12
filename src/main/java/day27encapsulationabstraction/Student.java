package day27encapsulationabstraction;

        /*
            1)What is Encapsulation?
              Data hiding
            2)How to hide a data?
              By using "private access modifier"
            3)Why do we need Encapsulation?
                i)To protect data from outside affects
                ii)To have simplicity
            4)Can you read the encapsulated data if you need?
              Yes, I can read the data by using "get method"s
            5)Can you update the encapsulated data if you need?
              Yes, I can update the data by using "set method"s
            6)By using set methods, we are able to work with lesser objects.
              After creating an object, we update it and use it as a different object.
              I mean, instead of creating 4 objects for Math, Science, Art, English teachers we create just a single teacher object
              and set it to Math Teacher object or others whenever we need. This is good for simplicity and saving memory.
            7)"Set Methods" update the values on the object not on the class.

            Interview Questions
            1)What is the difference between "Method Overloading" and "Method Overriding"?
                i) "Method Overriding" needs "inheritance" but "Method Overloading" does not need "inheritance"
                   "inheritance" is prerequisite for "Method Overriding"
                ii) "Method Overriding" does not change method signature, but "Method Overloading" changes
                    "Method Overriding" changes the body of the method, "Method Overloading" changes the parameter.
                iii) "private method"s can be Overloaded, but cannot be Overridden.
                     Because "Method Overloading" happens in a single class, to be private if you are in a single class does not affect anything.
                     "Method Overriding" happens in different classes so to be private matters.
                iv)"static method"s cannot be overridden but can be overloaded.
                    Because "static method"s are common for all objects, if you change the implementation by using a single object, other objects will be affected as well
                    this can create issue in our application, that is why Java does not let us override static methods.

                            Can you override "main method"?
                            No because it is static.

                            Note 1: Other name of "Method Overloading" is "Static Polymorphism"
                                    Other name of "Method Overriding" is "Dynamic Polymorphism"

                            Note 2: Could you explain "final" keyword?
                                    "final" keyword can be used for i)variables  ii)Methods  iii)Classes
                                    i)If you use "final" keyword for a variable
                                        a)You have to initialize(Assign value) the variable
                                        b)You cannot change the initial value
                                    ii)If you use "final" keyword for a method, its body cannot be updated
                                       Because of that "final methods" cannot be overridden.
                                    iii)If you use "final" keyword for a class, the class cannot have a child class.
                                        "final class" can be a child class, but it cannot have a child class.
                v) "final method"s cannot be overridden but can be overloaded.
                   Because, in overriding we change the method body, but final methods do not let us to change the method body.
         */

public class Student {

    private String stdId = "TH2023FL";
    private boolean success = true;

        //Create a get method to read the value of stdId
        //1.Way: Typed it manually
//    public String getStdId(){
//        return stdId;
//    }

    //2.Way: By using IntelliJ
    public String getStdId() {
        return stdId;
    }

        //Create a set method to update the value of stdId
        //1.Way: Type it manually
//    public void setStdId(String stdId){
//        this.stdId = stdId;
//    }

    //2.Way: By using IntelliJ
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    //If the data-type of an encapsulated data is boolean, getter method name starts with "is" not with "get"
    public boolean isSuccess() {
        return success;
    }

}