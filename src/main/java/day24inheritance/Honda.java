package day24inheritance;

public class Honda extends Car{

    public int age = 6;

    public void move(){
        System.out.println("Hondas move..");
    }
    public Honda (){
        super();
        System.out.println("Honda Constructor 1");
    }
    public Honda (int a){
        this();//It takes me to the constructor without parameter
        //in the Honda Class
        System.out.println("Honda Constructor 2: " + a);
    }
}