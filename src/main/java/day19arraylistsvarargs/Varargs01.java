package day19arraylistsvarargs;

public class Varargs01 {

    public static void main(String[] args) {

        System.out.println(add(1,2,3,4,5,6,7,8,9));

    }
    //Create a method adds two integers

    /*public static int add(int a, int b){
        return a + b;*/

        public static int add(int... v){

            int sum = 0;

            for(int w : v){
                sum = sum + w;
            }

            return sum;

        }
    }

