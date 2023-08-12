package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Michale");
        names.add("Alex");
        names.add("Alberto");
        names.add("Chris");

        System.out.println(getSquaresOfLengthsInListDistinctly1(names));

        printIntegers1(3, 11);
        System.out.println();
        printIntegers2(3, 11);
        System.out.println();
        System.out.println(getFactorial(5));
        System.out.println();
        System.out.println(findTheSumOfIntegersBetweenTwoGivenIntegers(7, 4));
        System.out.println();
        System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange1(45, 47));
        System.out.println(getTheSumOfDigitsOfIntegersInTheGivenRange2(45, 47));

    }
    //Example 1: Create a method takes the square of lengths of Strings, puts them in a list in reverse order distinctly

    public static List<Integer> getSquaresOfLengthsInListDistinctly1(List<String> names){
        return names.
                stream().
                map(String::length).//map(t->t.length()) can be used as well
                //t->t.length() is called "Lambda Expression" - String::length is called "Method Reference"
                        distinct().
                map(Utils::getSquare).//map(t->t*t) can be used as well
                        sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
    }

        /*
            Note: Normally for distinct elements we should use "Set" to store the elements.
                  But "collect(Collectors.toSet())" method does not let you sort the elements, but we need to sort the elements in reverse order
                  That is why we did not use "collect(Collectors.toSet())" we used "collect(Collectors.toList());" with "distinct()"
        */

    //Example 2: Create a method prints the integers from 3 to 11
    //1.Way:
    public static void printIntegers1(int start, int end){
        for(int i=start; i<=end; i++){
            System.out.print(i + " ");
        }
    }
    //2.Way:
    public static void printIntegers2(int start, int end){
        IntStream.rangeClosed(start, end).forEach(Utils::printInTheSameLineWithSpace);//t-> System.out.print(t + " ") can be used as well
    }

    //Example 3: Create a method to calculate the factorial of a given number
    //           5! ==> 1*2*3*4*5 = 120        3! ==> 1*2*3 = 6     0! = 1   No factorial for negative integers
    public static int getFactorial(int num) {
        if (num == 0) {
            return 1;
        } else if (num<0){
            System.out.println("Factorial of negative integers cannot be calculated");
            return -1;
        }
        return IntStream.rangeClosed(1, num).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 4: Create a method to find the sum of integers from 4 to 7
    public static int findTheSumOfIntegersBetweenTwoGivenIntegers(int start, int end){
        if(start>end){
            int temp = start;
            start = end;
            end = temp;
        }
        return IntStream.rangeClosed(start, end).reduce(Math::addExact).getAsInt();
    }

    //Example 5: Create a method to find the sum of the digits of integers from 45 to 47
    //           4+5+4+6+4+7=30
    //1.Way:
    public static int getTheSumOfDigitsOfIntegersInTheGivenRange1(int a, int b){
        return IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).reduce(Math::addExact).getAsInt();
    }

    //2.Way:
    public static int getTheSumOfDigitsOfIntegersInTheGivenRange2(int a, int b){
        return IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).sum();
    }
}