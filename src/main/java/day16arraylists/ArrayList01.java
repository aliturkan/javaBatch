package day16arraylists;

import java.util.ArrayList;

public class ArrayList01 {

        /*
            1)ArrayLists are for storing multiple data in the same data type.
            2)Arrays are fixed in length but ArrayLists are flexible in size.
            3)If Arrays are not good why did not Java remove Arrays from Java structure?
              Because Arrays use memory so less, and Arrays are so fast.
              If you are sure about the length use Array instead of ArrayList
            4)Arrays can store just "primitive data" and "references of non-primitive data" but
              ArrayLists can store just "non-primitive data"
            5)Arrays are poor in methods but ArrayLists are so rich in methods
         */

    public static void main(String[] args) {

        //How to create an ArrayList
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names);// [ ]

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("New York");

        //How to add elements into an ArrayList
        //add() method adds the elements into the List in insertion order.
        names.add("Tom");
        names.add("Mark");

        //add(index, element) puts the given element into the given index
        names.add(1, "Jim");

        //addAll() method is for adding a list into another list
        names.addAll(cities);

        //addAll() method is for adding a list into another list at the given index
        names.addAll(2, cities);

        System.out.println(names);// [Tom, Jim, Miami, New York, Mark, Miami, New York]

        //How to check if a List is empty or not
        ArrayList<String> countries = new ArrayList<>();
        countries.add("UK");
        countries.add("USA");

        //1.Way:
        //Get the number of elements in the list, if it is zero it means the list is empty
        if(countries.size()==0){// size() method gives you the number of elements in a list
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        //2.Way: Recommended
        if(countries.isEmpty()){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        //Example 1: Add "TR" to the list if it does not exist
        if(!countries.contains("TR")){
            countries.add("TR");
        }
        System.out.println(countries);// [ UK, USA, TR ]

        //Example 2: Change the second element to America
        countries.set(1, "America");
        System.out.println(countries);// [ UK, America, TR ]

        //Example 3: Remove elements if the length is 2

        //remove() method cannot be used in for-each loop
//        for(String w : countries){
//            if(w.length()==2){
//                countries.remove(w);
//            }
//        }
        for(int i=0; i<countries.size(); i++){// [ UK, America, TR ]
            if(countries.get(i).length()==2){
                countries.remove(i);
            }
        }
        System.out.println(countries);// [ America ]


        //Example 4: Create an Integer ArrayList and remove a specific element
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(5);
        ages.add(23);
        ages.add(19);
        System.out.println(ages);

        //If you use integer in remove() method parenthesis, Java will accept it as index.
        //If you want to make it Integer element, use auto boxing like (Integer)23
        ages.remove((Integer)23);
        System.out.println(ages);

        //Example 5: Create an Integer ArrayList and remove multiple elements
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(5);
        nums.add(23);
        nums.add(19);
        System.out.println(nums);

        ArrayList<Integer> heights = new ArrayList<>();
        heights.add(12);
        heights.add(23);

        nums.removeAll(heights);
        System.out.println(nums);// [ 5, 19 ]
    }
}