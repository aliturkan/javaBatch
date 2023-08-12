package day28interfacescollections;

public interface Brake extends Details{

    int price();
    int volume = 7;
    int weight();

    static void secure(){
        System.out.println("Brakes work securely");
    }
}