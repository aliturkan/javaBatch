package day31mapsexceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        String[] arr = {"Tom", "Ajda", "Brad", "Cuneyt", "Angelina"};

        System.out.println(getElementFromStringArray(arr, 3));
        System.out.println(getElementFromStringArray(arr, 1));
        System.out.println(getElementFromStringArray(arr, 6));
        System.out.println(getElementFromStringArray(arr, -3));

    }

    //Example 1: Create a method return any element from an array by using the index of the element
    public static String getElementFromStringArray(String[] arr, int idx){

        try{
            return arr[idx];
        }catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException is thrown if non-existing index was used.
            return arr[arr.length-1];
        }

    }

}
















