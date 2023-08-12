package day34lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    /*
        1)We learned "Structural Programming" so far, we will learn now "Functional Programming".
        2)"Functional Programming" uses Java Methods mostly to type codes.
     */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printEvenElements(nums);
        System.out.println();
        printEvens(nums);
        System.out.println();
        printSquareOfDistinctOddElements(nums);
        System.out.println();
        System.out.println(findSumOfCubeOfDistinctEvens(nums));
        System.out.println();
        System.out.println(findMax1(nums));
        System.out.println();
        System.out.println(findMax2(nums));
        System.out.println();
        System.out.println(findMin1(nums));
        System.out.println();
        System.out.println(findMin2(nums));
        System.out.println();
        System.out.println(findMultiplication(nums));
        System.out.println();
        System.out.println(isLessThanSpecificNumber(nums, 140));
        System.out.println();
        System.out.println(isNoneNegative(nums));
        System.out.println();
        System.out.println(isAnyElHasThreeDigits(nums));

    }

    //Example 1: Create a method to print even elements in an integer list

    //1.Way: Use "Structural Programming"
    public static void printEvenElements(List<Integer> myList){
        for(Integer w : myList){
            if(w%2==0){
                System.out.print(w + " ");
            }
        }
    }

    //2.Way: Use  "Functional Programming"
    public static void printEvens(List<Integer> myList){
        myList.
                stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Create a method to print square of distinct odd elements
    public static void printSquareOfDistinctOddElements(List<Integer> myList){
        myList.
                stream().
                distinct().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Create a method to find the sum of the cube of the different even elements in a list
    public static int findSumOfCubeOfDistinctEvens(List<Integer> myList){
        return myList.
                stream().
                distinct().
                filter(t->t%2==0).
                map(t->t*t*t).
                reduce(0, (t,u)->t+u);
    }

    //Example 4: Create a method to find the element whose value is the maximum
    //1.Way:
    public static int findMax1(List<Integer> myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t,u)->t>u ? t : u);
    }

    //2.way:
    public static int findMax2(List<Integer> myList){
        return myList.
                stream().
                distinct().
                sorted().
                reduce((t, u)->u).get();
    }

    //Example 5: Create a method to find the element whose value is the minimum
    //1.Way:
    public static int findMin1(List<Integer> myList){
        return myList.
                stream().
                distinct().
                reduce(myList.get(0), (t,u)->t<u ? t : u);
    }
    //2.way:
    public static int findMin2(List<Integer> myList){
        return myList.
                stream().
                distinct().
                sorted().
                findFirst().
                get();
    }

    //Example 6: Create a method to find the multiplication of the elements less than 15 and even
    public static int findMultiplication(List<Integer> myList){
        return myList.
                stream().
                filter(t->t<15).//filter(t->t<15 && t%2==0) also works
                        filter(t->t%2==0).
                reduce(1, (t,u)->t*u);
    }

    //Example 7: Create a method to check if all elements are less than 140 or not.
    public static boolean isLessThanSpecificNumber(List<Integer> myList, int num){
        return myList.stream().allMatch(t->t<num);
    }

    //Example 8: Create a method to check if no element is negative or not.
    public static boolean isNoneNegative(List<Integer> myList){
        return myList.stream().noneMatch(t->t<0);
    }

    //Example 9: Create a method to check if any element has 3 digits
    public static boolean isAnyElHasThreeDigits(List<Integer> myList){
        return myList.stream().anyMatch(t->t<1000 && t>99);
    }
}