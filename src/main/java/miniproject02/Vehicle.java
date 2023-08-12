package miniproject02;

import java.util.Scanner;

public class Vehicle {

    /*
     Tariff period: December 2022, June 2022
      1st term: June 2022                      2nd term: December 2022
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
     */

    public String type;
    public int payment;

    public int countPayment(int term){

        if (term==1){

            switch (type){
                case "CAR":
                    payment=2000;
                    break;
                case "TRUCK":
                    payment=3000;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment=1500;
                    break;
                default:
                    System.out.println("Incorrect data entrance");
                    payment=0;
                    break;
            }

        }else if(term==2){
            switch (type){
                case "CAR":
                    payment=2500;
                    break;
                case "TRUCK":
                    payment=3500;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment=1750;
                    break;
                default:
                    System.out.println("Incorrect data entrance");
                    payment=0;
                    break;
            }

        }else{
            System.out.println("Incorrect input");
            payment=0;
        }

        return payment;


    }

    public int countBusPayment(int term){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the type of bus: ");
        System.out.println("Type 1. 18-30 seats"+"\nType 2.31 and above seats");

        int busType=input.nextInt();

        switch (busType){
            case 1:
                if(term==1) {
                    payment = 4000;
                }else{
                    payment=4500;
                }
                break;
            case 2:
                if(term==1){
                    payment=5000;
                }else {
                    payment=5500;
                }
                break;

        }
        return payment;


    }


}