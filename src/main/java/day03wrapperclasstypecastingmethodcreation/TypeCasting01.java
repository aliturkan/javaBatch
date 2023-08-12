package day03wrapperclasstypecastingmethodcreation;

public class TypeCasting01 {

    public static void main(String[] args) {

        // byte - short - int - long - float - double ==> Do AutoWidening
        byte b = 25;
        short s = b;
        System.out.println(s);//25

        long l = 456;
        double d = l;
        System.out.println(d);//456.0

// byte - short - int - long - float - double ==> ExplicitNarrowing
        long n = 5674;
        short h = (short)n;
        System.out.println(h);

        float f = 12.78F;
        int i = (int)f;
        System.out.println(i);// 12

    }

}