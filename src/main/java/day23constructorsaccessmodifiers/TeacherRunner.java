package day23constructorsaccessmodifiers;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher t1 = new Teacher(45);

        Teacher t2 = new Teacher(45);

        Teacher t3 = new Teacher(45);

        System.out.println(t1.age);
        System.out.println(t1.counter);

        System.out.println(t2.age);
        System.out.println(t2.counter);

        System.out.println(t3.age);
        System.out.println(t3.counter);

    }

}