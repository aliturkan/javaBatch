package miniproject02;

import java.util.Scanner;

public class VehicleInsurancePaymentApp{

       /*
       Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: December 2022, June 2022
      1st term: June 2022                      2nd term: December 2022
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
       To be able to let user restart we should present option to restart
*/

    public static void main(String[] args) {

        startCalculation();


    }
    public static void startCalculation(){
        boolean isFailed;

        Scanner input=new Scanner(System.in);

        do {
            isFailed=false;
            System.out.println("---Calculation for Vehicle Insurance----"+"\nChoose a term for payment calculation: ");
            System.out.println("1- June 2023");
            System.out.println("2- December 2023");
            int term= input.nextInt();

            //if the term entered in correct way the process should go on and ask user if he wants to restart the application
            if (term==1 || term==2){

                Vehicle objVehicle=new Vehicle();
                System.out.println("Enter the type of vehicle for payment calculation: ");
                System.out.println("Car, Truck, Bus, Motorcycle");
                objVehicle.type= input.next().toUpperCase();

                objVehicle.payment=objVehicle.countPayment(term);

                //check if the payment is greater than 0, give a message to the user "Calculation Done!"
                //if the payment is 0 or negative give a message to the user "Incorrect data entrance"

                String termName= term==1 ? "June 2023": "December 2023";
                int select;
                if (objVehicle.payment>0){
                    System.out.println("Calculation Done!");
                    System.out.println("Vehicle Type: "+ objVehicle.type);
                    System.out.println("Term : "+ termName);
                    System.out.println("Payment Amount: " + objVehicle.payment);
                    System.out.println("To Restart Please Press 1, To Exit Please Press 0: ");
                    select= input.nextInt();

                    if(select==1) {
                        isFailed = true;
                    }else{
                        isFailed=false;
                    }

                }else{
                    System.out.println("Incorrect data entrance");
                    System.out.println("To Restart Please Press 1, To Exit Please Press 0: ");
                    select= input.nextInt();
                    if (select==1){
                        isFailed=true;

                    }else {

                        isFailed=false;
                    }


                }



            }else{

                System.out.println("Incorrect data entrance");
                isFailed=true;

            }



        }while (isFailed);



    }


}