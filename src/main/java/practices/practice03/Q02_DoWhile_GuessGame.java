package practices.practice03;

import java.util.Scanner;

public class Q02_DoWhile_GuessGame {
         /*
    Write a game that finds random numbers between 0 and 100.
    Hint: If the number you entered is less than randomNumber print ==> Enter a larger number.
    If the number you entered is greater than randomNumber print  ==> Enter a smaller number.
    If the number you entered is equal to randomNumber print  ==> Congratulations!!!  You found the number.
      */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);

        System.out.println("Enter a number between 0-100");
        int number;
        int guessNumber = 10;

        do {
            guessNumber--;
            number = scanner.nextInt();
            if (number < randomNumber) {
                System.out.println("Enter a larger number");
                System.out.println("You have " + guessNumber + " guess(es)");

            } else if (number > randomNumber) {
                System.out.println("Enter a smaller number");
                System.out.println("You have " + guessNumber + " guess(es)");

            } else {
                System.out.println("Congratulations!!!  You found the number");
                System.out.println("You found the number in " + (10 - guessNumber) + " guess(es)");
                System.out.println("Your point is: " + (guessNumber + 1) * 10);//1 ==> 100
                break;
            }
            if (guessNumber == 0) {
                System.out.println("You could not find the number in 10 guesses!! You failed!!!");
                System.out.println("Continue: Y/N");
                String condition = scanner.next();
                if (condition.equalsIgnoreCase("Y")) {
                    System.out.println("Enter a number between 0-100");
                    guessNumber = 10;
                    randomNumber = (int) (Math.random() * 101);

                } else {
                    break;
                }
            }

        } while (true);

        System.out.println("Good Bye!!!");

    }
}