package day15multidimensionalarrays;

public class Md03 {

    public static void main(String[] args) {

        //Example 1: Type code to find the sum of the maximum and minimum values in a multidimensional array
        //           { {5, 0}, {-2, 14}, {65, -12, 23} } ==> -12 + 65 = 53

        //1.Way:
        int[][] a = { {5, 0}, {65, -12, 23} };

        int maxValue = a[0][0];
        int minValue = a[0][0];

        //{ {5, 0}, {65, -12, 23} }
        for(int[] w : a){

            for(int u : w){

                if(u>maxValue){
                    maxValue = u;
                }

                if(u<minValue){
                    minValue = u;
                }
            }
        }
        System.out.println(maxValue + minValue);

        //2.Way: Recommended
        int[][] b = { {5, 0}, {65, -12, 23} };

        int maxV = b[0][0];
        int minV = b[0][0];

        //{ {5, 0}, {65, -12, 23} }
        for(int[] w : b){

            for(int u : w){

                maxV = Math.max(u, maxV);

                minV = Math.min(u, minV);
            }
        }
        System.out.println(maxV + minV);

    }

}