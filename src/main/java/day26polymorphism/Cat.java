package day26polymorphism;

public class Cat extends Mammal{

    @Override
    public void eat() {
        System.out.println("Cats eat...");
    }

    @Override
    public int move() {
        return 150;
    }

    @Override
    public Integer weight() {
        return super.weight();
    }

    @Override
    public Mammal born() {
        return new Cat();
    }
}