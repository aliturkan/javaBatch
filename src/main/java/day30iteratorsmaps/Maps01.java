package day30iteratorsmaps;

        /*
            1)Maps are for storing multiple data
            2)Maps use "key" - "value" structure to store multiple data
            3)"key"s are unique, "value"s can be repeatedly
            4)Every map element is called as "Entry"
            5)All map elements are called "EntrySet"
            6)All map elements are unique because "key" part is unique.
            7)There are 3 Maps in Java;
                    i)HashMap:
                        a)HashMap puts the elements in "random order", HashMap is so fast
                        b)HashMap accepts "null" as key just once.
                        c)HashMap accepts multiple "null" in the "value" part
                    ii)HashTable
                    iii)TreeMap
         */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {

    public static void main(String[] args) {

        HashMap<String, Integer> cp = new HashMap<>();
        cp.put("USA", 400);
        cp.put("Germany", 83);
        cp.put("Albania", 3);
        cp.put("Turkey", 85);
        cp.put("Germany", 87);
        System.out.println(cp);// { USA=400, Turkey=85, Germany=83, Albania=3 }

        //Example 1: Find the average population of the given countries
        Collection<Integer> values = cp.values();// values() gives you all values in "value" part in a Collection
        System.out.println(values);// [400, 85, 83, 3]

        double sum = 0;
        for(Integer w : values){
            sum = sum + w;
        }
        double avg = sum / values.size();
        System.out.println(avg);// 142.75

        //Example 2: Print the country names contains "r"
        Set<String> keys = cp.keySet();// keySet() gives you all "key"s in a map
        for(String w : keys){
            if(w.contains("r")){
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //How to get value of a specific key
        int populationOfAlbania = cp.get("Albania");// get() gives you the value of a specific key
        System.out.println(populationOfAlbania);

        //How to check if keys have a specific key
        boolean isExist1 = cp.containsKey("Belgium");
        System.out.println(isExist1);//false

        //How to check if values have a specific value
        boolean isExist2 = cp.containsValue(85);
        System.out.println(isExist2);//true

        //Note: If you use same key with a different value in put(), it means you are updating the value
        //      cp.put("Germany", 83); then cp.put("Germany", 87); means you updated 83 to 87

        //How to update value of a key
        cp.replace("Germany", 99);
        System.out.println(cp);// {USA=400, Turkey=85, Germany=99, Albania=3}

        cp.replace("Germany", 99, 100);
        System.out.println(cp);// {USA=400, Turkey=85, Germany=100, Albania=3}

        cp.putIfAbsent("UK", 500);
        System.out.println(cp);// {USA=400, Turkey=85, UK=500, Germany=100, Albania=3}

        //How to get all entries in a set
        Set<Map.Entry<String,Integer>> allEntries = cp.entrySet();
        for(Map.Entry<String,Integer> w : allEntries){
            System.out.println(w.getValue() + " - " + w.getKey());
        }
    }
}