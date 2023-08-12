package day02variables;
public class Variables03 {

    public static void main(String[] args) {

        //Example 1: Create two short variables and print their sum on the console
        short s1 = 12;
        short s2 = 23;
        System.out.println(s1 + s2);

        //Example 2: Create 2 variables for prices then print their sum on the console.
        double shirtPrice = 12.99;
        double shoesPrice = 124.99;
        System.out.println(shirtPrice + shoesPrice);

        //Example 3: Create a variable for student's age and another variable for population of a country.
        //           Print their difference on the console.
        byte stdAge = 13;
        int populationOfGermany = 83000000;
        System.out.println(populationOfGermany - stdAge);

        //Note: If you use different data types in a mathematical operation, the result will be in the largest data type.
        //      4 / 1.2 ==> double         2.4F * 5 ==> float

        //Note: If you use same data type in a mathematical operation result will in the data type
        //      When you divide an int by another int, the result can be double like in 6/5=1.2
        //      but Java makes the data type of the result in int as well.
        //      To convert double to int Java removes the decimal part so 1.2 will be 1
        //      6 / 2 ==> int         6 / 5 ==> int
        System.out.println(6/5);// 1

        //What if you want to see 1.2 when you divide 6 by 5?
        System.out.println(6/5.0);// 1.2

        /* Example 1: Estimate the result of the given operation
                   (2 + 4.6) / 3 - 4 * 2
        */
        System.out.println((2 + 4.6) / 3 - 4 * 2);// -5.8

        //Note: Order of operations in Math i)Do the operations in the parenthesis
        //                                  ii)Do multiplications and divisions
        //                                  iii)Do additions and subtractions

    }
}
