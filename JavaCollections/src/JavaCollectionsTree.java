//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Iterator;
import java.util.TreeSet;

public class JavaCollectionsTree {
    public JavaCollectionsTree() {
    }

    public static void createTree() {

    //creates a new treeSet called set
    TreeSet treeSet = new TreeSet();


    //HAPPY PATH

    //this will create the treeSet
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(11);

    //returns the least element larger than this given element
        System.out.println(treeSet.ceiling(8));

    Integer value = 11;

    //checks whether item is in set
        if (treeSet.contains(value)){
        System.out.println(value + " is in this TreeSet.");
    } else{
        System.out.println(value + " is not in this TreeSet.");
    }

    //returns descending order of all elements
         System.out.println(treeSet.descendingSet());

    //returns size
        System.out.println("This TreeSet has " + treeSet.size() + " elements in it.");

    //clears all elements from set
        treeSet.clear();

        TreeSet treeSetTwo = new TreeSet();

        treeSetTwo = (TreeSet)treeSet.clone();

        Iterator iterator;

        iterator = treeSetTwo.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        if(treeSet.isEmpty()) {
            System.out.println("This set is empty.");
        } else {
            System.out.println("This set is not empty.");
        }

        treeSet.remove(9);


        treeSet.clear();




        //NASTY PATH

        //this is a double, but should be in integer
        //returns null
        System.out.println(treeSet.ceiling(8.5));



        //NOTES

        //treeSet orders by value, no duplicate elements
        //hashSet is faster than treeSet
        //it's usually faster to create a hashSet first, then convert it to a treeSet
    }

}