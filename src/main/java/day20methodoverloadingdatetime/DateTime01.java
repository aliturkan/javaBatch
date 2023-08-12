package day20methodoverloadingdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        //HOW TO GET CURRENT DATE
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);// 2023-04-15

        //HOW TO GET COMPONENTS OF THE DATE
        System.out.println(currentDate.getYear());// 2023

        System.out.println(currentDate.getMonth());//APRIL
        System.out.println(currentDate.getMonthValue());//4

        System.out.println(currentDate.getDayOfMonth());//15
        System.out.println(currentDate.getDayOfWeek());//SATURDAY

        //HOW TO GET CURRENT DATE IN A SPECIFIC ZONE
        System.out.println(LocalDate.now(ZoneId.of("Asia/Tokyo")));// 2023-04-15
        System.out.println(LocalDate.now(ZoneId.of("Europe/Sofia")));// 2023-04-15

        //HOW TO GO FUTURE AND PAST
        System.out.println(currentDate.plusYears(3).plusMonths(2).plusDays(12));//2026-06-27
        System.out.println(currentDate.minusYears(4).minusMonths(23).minusDays(11));// 2017-05-04

        //Example 1: Jhon was born 12 years 5 months 11 days ago, type code to find the day name of Jhon's birthdate
        System.out.println(currentDate.minusYears(12).minusMonths(5).minusDays(11).getDayOfWeek());// THURSDAY

        //HOW TO COMPARE TWO DATES
        LocalDate dobTom = LocalDate.of(2011, Month.JULY, 21);

        LocalDate dobJim = LocalDate.of(2007, 3, 13);

        System.out.println(dobTom.isAfter(dobJim));//true

        System.out.println(dobJim.isBefore(dobTom));//true

        //Example 2: Type code for a booking application.
        //           If booking date is before current date give an error message like "Booking date cannot be past date"
        //           If booking date equals current date give a message like "We will call you when we have availability"
        //           If booking date is after current date give a message like "The ticket was booked"
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year with 4 digits to book a ticket");
        int year = input.nextInt();

        System.out.println("Enter month number to book a ticket");
        int month = input.nextInt();

        System.out.println("Enter day number to book a ticket");
        int day = input.nextInt();

        LocalDate bookingDate = LocalDate.of(year, month, day);

        if(bookingDate.isBefore(currentDate)){
            System.out.println("Booking date cannot be past date");
        }else if(bookingDate.equals(currentDate)){
            System.out.println("We will call you when we have availability");
        }else{
            System.out.println("The ticket was booked");
        }

        //Example 3: Type code to find the day name of your birth.
        LocalDate myDob = LocalDate.of(1994, 2, 11);

        DayOfWeek dayName = myDob.getDayOfWeek();

        System.out.println(dayName);

        //How to format date
        LocalDate current = LocalDate.now();

        System.out.println(current);// ==> 2023-04-16

//"m" is reserved for minute, that is why we use "M" for month
//"M" makes the month number single digit if it is less than 10
//"MM" makes the month number two digits if it is less than 10
//"MMM" gives you first three characters of month name
//"MMMM" gives you full month name
//"yyyy" gives you the year in 4 digits
//"yy" gives you the last two digits of the year
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        String myDate = dtf.format(current);
        System.out.println(myDate);// ==> 16/04/2023
    }
}