package day24inheritance;

public class Car extends Vehicle {

    public int age = 8;

    public void move(){
        System.out.println("Cars move..");
    }
    public void engine(){
        System.out.println("All cars have engine");
    }
    public Car(){
        this(7);//It takes me to the constructor with int parameter
        //in the Car Class
        System.out.println("Car constructor 1");
    }
    public Car(int a ){
        super(8);//It takes me to the constructor with int parameter
        //in the Vehicle Class
        System.out.println("Car constructor 2: " + a);
    }
}