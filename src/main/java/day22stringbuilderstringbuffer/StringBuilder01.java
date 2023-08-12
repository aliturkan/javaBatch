package day22stringbuilderstringbuffer;

public class StringBuilder01 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");

        sb1.insert(1, "xxx");
        System.out.println(sb1);//Jxxxava

        sb1.insert(4, "abcde", 1, 3);//Jxxxbcava
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);//avacbxxxJ

        sb1.replace(5, 8, "y");
        System.out.println(sb1);//avacbyJ

        String sb2 = sb1.toString();
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder(sb2);
        System.out.println(sb3);//avacbyJ

        int idx1 = sb3.indexOf("a");
        System.out.println(idx1);//0

        int idx2 = sb3.lastIndexOf("a");
        System.out.println(idx2);//2

        int idx3 = sb3.indexOf("a", 1 );
        System.out.println(idx3);

        //Check it tomorrow
        //int idx4 = sb3.lastIndexOf("a", 5);
        //System.out.println(idx4);
    }
}