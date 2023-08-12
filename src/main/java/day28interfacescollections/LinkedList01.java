package day28interfacescollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
        1)When you use ArrayList removing an element or adding an element makes the other elements re-indexed.
        This is not good because reindexing many elements needs too many tasks.
        As a result; ArrayList is not successful in removing and adding elements.
        2)When you use LinkedList to remove or add elements, it will change just the pointers,
        it will not need to reindex all the other elements that is why removing and adding elements in LinkedList will be so easy.
        As a result, LinkedList is so successful in removing and adding elements.
        3)Search Operations are so easy in ArrayLists because every element has index like an address
        4)LinkedList is not successful in Search Operations because LinkedList does not use indexes I mean elements do not have addresses
     */

    public static void main(String[] args) {

        //How to create LinkedList
        LinkedList<Character> m = new LinkedList<>();

        //How to add "node"s in a LinkedList
        m.add('A');
        m.add(0,'H');
        m.addFirst('K');
        m.addLast('R');

        LinkedList<Character> n = new LinkedList<>();
        n.add('s');
        n.add('b');
        n.add('z');

        m.addAll(n);
        m.addAll(2, n);
        System.out.println(m);// [K, H, s, b, z, A, R, s, b, z]

        //remove() method removes the first node and returns the removed node
        System.out.println(m.remove());//K
        System.out.println(m);// [H, s, b, z, A, R, s, b, z]

        System.out.println(m.remove((Character) 'R'));//true because 'R' was removed
        System.out.println(m);// [H, s, b, z, A, s, b, z]

        System.out.println(m.remove(4));//A
        System.out.println(m);// [H, s, b, z, s, b, z]

        System.out.println(m.removeFirstOccurrence('s'));//true
        System.out.println(m);// [H, b, z, s, b, z]

        System.out.println(m.removeLastOccurrence('z'));//true
        System.out.println(m);// [H, b, z, s, b]

        //Removes and returns the first element from this list
        m.removeFirst();
        System.out.println(m);// [b, z, s, b]

        m.removeLast();
        System.out.println(m);// [b, z, s]

        LinkedList<Integer> r = new LinkedList<>();
        r.add(12);
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);
        System.out.println(r);// [12, 5, 14, 12, 1]

        //Removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        //cut+paste
        System.out.println(r.pop());//12
        System.out.println(r);// [5, 14, 12, 1]

        /*
            removeFirst() + pop()
            Removes and returns the first element from this list.
            Returns:the first element from this list
            Throws:NoSuchElementException – if this list is empty

            remove()
            Retrieves and removes the first element of this list.
            Returns:the first element of this list
            Throws:NoSuchElementException – if this list is empty

            As a result; removeFirst() and pop() and remove() do the same

            poll()
            Retrieves and removes the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

            peek()
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty

            element()
            Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list
            Throws:NoSuchElementException – if this list is empty
         */

        //Retrieves, but does not remove, the first element of this list.
        //copy+paste
        r.element();

        //Retrieves and removes the first element of this list.
        //cut+paste
        r.poll();

        //Retrieves, but does not remove, the head (first element) of this list.
        //copy+paste
        r.peek();

    }
}