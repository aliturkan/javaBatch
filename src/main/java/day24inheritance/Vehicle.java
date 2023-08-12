package day24inheritance;

public class Vehicle {

    /*
        1) Variables and methods with the same name come from bottom to top in inheritance
        2) "this" keyword is for getting variable value from the class itself or calling the method from the class itself
        3) "super" keyword is for getting variable value from the parent class or calling the method from the parent class
        4) Java runs constructors from top to bottom in inheritance because without having parent,
           it's impossible to have child
        5) "super()" is for calling constructors from first level parent class
        6) "super()" exists as default in every constructor, normally it is invisible, if you want you can type it explicitly
        7) By putting appropriate parameters inside the "super()" parenthesis, you can select whatever constructor
           you want from the parent class.
        8) "this()" is for calling constructors from the class itself
     */
    public int age = 12;
    public void move(){
        System.out.println("Vehicles move..");
    }
    public Vehicle(){
        super();
        System.out.println("Vehicle constructor 1");
    }
    public Vehicle(int a){
        this();//It takes me to the constructor without parameter
        //in the Vehicle Class
        System.out.println("Vehicle constructor 2: " + a);
    }
}