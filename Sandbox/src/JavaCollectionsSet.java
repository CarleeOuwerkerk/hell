/**
 * Created by Carlee on 2016-09-20.
 */

import java.util.HashSet;


public class JavaCollectionsSet {

    public static void createSet(){

        //creates a new set called set
        HashSet<String> set = new HashSet<String>();


        //HAPPY PATH

        //This adds to the set (does not retain order)
        set.add("Harry Potter");
        set.add("Lord of The Rings");
        set.add("Pride & Prejudice");

        //returns size of set
        System.out.println("This set has " + set.size() + " elements in it.");

        String value = "Pride & Prejudice";

        //checks whether item is in set
        if (set.contains(value)){
            System.out.println(value + " is in this set.");
        } else{
            System.out.println(value + " is not in this set.");
        }

        //iterates through set
        for (String element: set){
            System.out.println(element);
        }

        //checks whether set is empty
        if (set.isEmpty()){
            System.out.println("This set is empty.");
        } else{
            System.out.println("This set is not empty.");
        }

        //removes element from set
        set.remove("Harry Potter");

        //returns size of set
        System.out.println("This set has " + set.size() + " elements in it.");

        //clears all from set
        set.clear();

        //checks whether set is empty
        if (set.isEmpty()){
            System.out.println("This set is empty.");
        } else{
            System.out.println("This set is not empty.");
        }



        //NASTY PATH


    }

    //stores only unique elements, only one null at a time

    //hashset = stores in hashtable, most common, guarantees no order
    //treeset = value-ordered,
    //linkedhashset = hash table with a linked list running through it, insertion-ordered iteration


}
