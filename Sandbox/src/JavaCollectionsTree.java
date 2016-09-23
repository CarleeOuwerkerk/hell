import java.util.TreeSet;

/**
 * Created by Carlee on 2016-09-20.
 */
public class JavaCollectionsTree {

    public static void createTree(){

        //creates a new treeSet called set
        TreeSet treeSet = new TreeSet();



        //HAPPY PATH

        //this will create the treeSet
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(11);

        //returns the least element larger than this given element
        treeSet.ceiling(9);






        Integer value = 11;

        //checks whether item is in set
        if (treeSet.contains(value)){
            System.out.println(value + " is in this TreeSet.");
        } else{
            System.out.println(value + " is not in this TreeSet.");
        }

        //returns descending order of all elements
        Object descendingTree = (TreeSet)treeSet.descendingSet();





        //clears all elements from set
        treeSet.clear();







    //treeSet orders by value, no duplicate elements
    //hashSet is faster than treeSet
    //it's usually faster to create a hashSet first, then convert it to a treeSet
    }
}