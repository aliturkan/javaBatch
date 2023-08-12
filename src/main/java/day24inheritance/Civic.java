package day24inheritance;

public class Civic extends Honda{

    public int age = 4;

    public void move(){
        System.out.println("Civics move..");
    }
    //    public Civic(){
    //      System.out.println(this.age);  // 4
    //      System.out.println(super.age); // 6

    //      this.move();   // Civics move..
    //    super.move();  // Hondas move..
    //     }
    public Civic(){
        super();
        System.out.println("Civic Constructor 1");
    }
    public Civic(int a){
        super(6);//It takes me to the constructor with int parameter
        //in the Honda Class
        System.out.println("Civic Constructor 2: " + a);
    }
}