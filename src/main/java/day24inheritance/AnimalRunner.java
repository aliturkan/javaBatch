package day24inheritance;
public class AnimalRunner {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();
        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();
    }
}