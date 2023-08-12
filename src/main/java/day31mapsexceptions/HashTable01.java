package day31mapsexceptions;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1)HashTable is "thread-safe" and "synchronized" but HashMap is not "thread-safe" not "synchronized"
        2)HashTable puts the elements in random order.
        3)To be "thread-safe" and "synchronized" needs time, that is why HashTable is slower than HashMap
        4)HashTable does not accept null in "key"s and in "value"s
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Ali Can", 13);
        ht.put("Tom Hanks", 65);
        ht.put("Brad Pitt", 56);
        //ht.put(null, 45); ==> HashTable does not accept null in "key"s
        //ht.put("Mark Twain", null); ==> HashTable does not accept null in "value"s

        System.out.println(ht);// {Tom Hanks=65, Ali Can=13, Brad Pitt=56}

        System.out.println(ht.get("Angelina Jolie"));// null
        System.out.println(ht.getOrDefault("Angelina Jolie", -1));// -1

        //System.out.println(ht.get("Ali Can") + ht.get("Tom Hanks") + ht.get("Brad Pitt") + ht.get("Angelina Jolie"));
        System.out.println(ht.getOrDefault("Ali Can", 0) + ht.getOrDefault("Tom Hanks", 0) + ht.getOrDefault("Brad Pitt", 0) + ht.getOrDefault("Angelina Jolie", 0));
    }
}