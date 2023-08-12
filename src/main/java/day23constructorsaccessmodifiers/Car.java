package day23constructorsaccessmodifiers;

public class Car {

    public String make;
    public String model;
    public int year;
    public int price;

    public Car() {
    }

    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}