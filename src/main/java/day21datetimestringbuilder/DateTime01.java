package day21datetimestringbuilder;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);// 11:03:16.896288

        //How to format time
        //"hh" uses 12 hours system, "HH" uses 24 hours system
        //Using "a" at the end it tells you if it is AM or PM
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String myTime = dtf.format(currentTime);
        System.out.println(myTime);// 11:08 AM

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);// 2023-04-16T11:15:58.115333

        LocalDateTime ldtJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ldtJapan);// 2023-04-17T00:18:01.452842
    }
}