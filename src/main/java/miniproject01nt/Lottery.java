package miniproject01nt;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

    /*
    Project: Numerical Lotto Application
   Let n random numbers be generated for the ticket.
   Let the lottery result be generated with n random numbers.
   There should be no repeated numbers in the numerical lottery.

   Ask user to enter n(number of digits) also min and max values for numbers
   compare result of matching digits and ticket, how many matches there are
   notify the user.

    */

    public static void main(String[] args) {

        startLoto();


    }

    public static void startLoto() {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the total number of digits you want to receive for the lottery: ");

        int numOfDigits= input.nextInt();
        System.out.println("Enter the minimum value for the numbers: ");
        int min= input.nextInt();

        System.out.println("Enter the maximum value for the numbers: ");
        int max=input.nextInt();

        int[] lottoArr= new int[numOfDigits];

        int[] ticketArr=new int[numOfDigits];

        Random random=new Random();

        int randomnumber1=0;
        int randomnumber2=0;
        boolean isRepeated;

        for (int i=0; i<numOfDigits; i++){

            do {
                isRepeated=false;
                randomnumber1=random.nextInt(max+1-min)+min;

                for (int j=0; j<numOfDigits; j++ ){

                    if (lottoArr[j]==randomnumber1){
                        isRepeated=true;
                        break;
                    }

                }

            }while (isRepeated);

            lottoArr[i]=randomnumber1;

            do {
                isRepeated=false;
                randomnumber2=random.nextInt(max+1-min)+min;

                for (int j=0; j<numOfDigits; j++ ){

                    if (ticketArr[j]==randomnumber2){
                        isRepeated=true;
                        break;
                    }

                }

            }while (isRepeated);

            ticketArr[i]=randomnumber2;

        }
        System.out.println("Your ticket is: ");
        for (int i=0; i<ticketArr.length; i++){
            System.out.print(ticketArr[i]+ " ");
        }
        System.out.println();
        System.out.println("Lotto result is: ");
        for (int i=0; i< lottoArr.length; i++){
            System.out.print(lottoArr[i]+ " ");
        }

        System.out.println();
        int result=compareArr(ticketArr, lottoArr);
        if (result>0){

            System.out.println("Congratulations! You have "+ result+ " matching numbers.");

        }else {
            System.out.println("Unfortunately NO Matching numbers.Try again");
        }

    }

    public static int compareArr(int[] arr, int[]brr){

        int counter=0;

        for(int i=0; i<arr.length; i++){

            for (int j=0; j<brr.length; j++){

                if (arr[i]==brr[j]){

                    counter++;

                }

            }

        }


        return counter;
    }


}