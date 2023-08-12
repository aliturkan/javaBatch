package day30iteratorsmaps;

        /*
            1)Iterators do the same with the loops
            2)Loops have infinite loop risk but iterators do not have.
            3)There are two types of iterators
                    i)Iterator:
                        You can just "remove" the elements, it is impossible to "update" or to "add" new elements
                        You can use the elements from first to the last. It has one direction.
                    ii)ListIterator:
                        You can "remove" the elements, "update" the elements, "add" new elements.
                        You can use elements from the first to the last and from the last to the first. It is bidirectional.
         */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);               // [Tom, Jim, Clara, Angie, Mark]

        //How to use "iterator"
        Iterator<String> itr = myList.iterator();  // [  Tom,  Jim,  Clara,  Angie,  Mark ]

        while(itr.hasNext()){//hasNext() asks the pointer if there is any element after the pointer or not
            itr.next();//next() takes the pointer to the right and returns the element
            itr.remove();//remove() removes the element next() method returned
        }
        System.out.println(myList);// [ ]

        //How to use ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        System.out.println(yourList);                // [Tom, Jim, Clara, Angie]

        ListIterator<String> lr = yourList.listIterator();  // [  Tom,  Jim,  Clara,  Angie  ]

        while(lr.hasNext()){
            lr.next();
        }                                         // [  Tom,  Jim,  Clara,  Angie  ]

        while(lr.hasPrevious()){
            String el = lr.previous();
            lr.set(el + "!");
        }
        System.out.println(yourList);

    }

}