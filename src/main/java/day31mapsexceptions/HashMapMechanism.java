package day31mapsexceptions;

import java.util.HashMap;

public class HashMapMechanism {

    /*
            1)When you create a HashMap Java gives you 16 "buckets"
            2)Java puts indexes for every bucket from 0 to 15
            3)When you put an entry int the map;
                i)Java creates "hashcode" for the "key" of the entry
                ii)Java divides the "hashcode" by 16 and gets the remainder as index then
                   puts the entry to the bucket whose index was found after division.
            4)If multiple entries will be put into a single bucket, Java uses "LinkedList" structure.
            5)If 75% of existing buckets is full then Java gives you another 16 buckets.
            6)To find a specific value, Java follows the steps like;
              Index --> HashCode --> Key --> Return the Value

     */

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Albania", 3);
        hm.put("Germany", 83);
        hm.put("Belgium", 12);
    }

}