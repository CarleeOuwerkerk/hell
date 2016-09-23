/**
 * Created by Carlee on 2016-09-20.
 */

import java.util.ArrayList;

public class JavaCollectionsList {

    public static void createList() {

        //Creates a new ArrayList object called list
        ArrayList<String> list = new ArrayList<String>();


        //HAPPY PATH

        //adds these to the list
        list.add("Harry Potter");
        list.add("Lord of The Rings");
        list.add("Pride & Prejudice");

        //returns number of elements in list
        System.out.println("There are " + list.size() + " books in the list.");

        //finds the element that's in index 0
        System.out.println("The first element in the list is " + list.get(0) + ".");

        String value = "Lord of The Rings";

        //checks if an element is in the list (boolean)
        if (list.contains(value)){
            System.out.println(value + " is an element in this list.");
        } else{
            System.out.println(value + " is not an element in this list.");
        }

        //returns element from specified position
        System.out.println(list.get(1) + " is in the second position of this list.");

        //returns the index of first occurrence of specified element
        System.out.println("The first occurrence of Pride & Prejudice in the list is in the position of index "
                + list.indexOf("Pride & Prejudice") + ".");

        //iterator - gets each element in the list
        for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
        }

        //check whether the list is empty (boolean)
        if (list.isEmpty()){
            System.out.println("This list is empty.");
        } else{
            System.out.println("This list is not empty.");
        }

        //to remove from list - can reference object or index
        list.remove("Pride & Prejudice");

        //returns number of elements in list
        System.out.println("There are " + list.size() + " books in the list.");

        //clears all elements from the list
        list.clear();

        //check whether the list is empty (boolean)
        if (list.isEmpty()){
            System.out.println("This list is empty.");
        } else{
            System.out.println("This list is not empty.");
        }

        /*
        //while loop that goes through each object
        //iterates over each element in proper sequence
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
        }

        //another way to iterate
        for (Object next : list) {
            System.out.println(next);
        }

        //another way - slow for linkedlists
        for (int i = 0; i < list.size(); i++) {
            Object next = list.get(i);
        }
        */

    }
}

    //This line will only allow a certain type into the list
    //        List<String> list = new List<String>();
    //This would cause an error if a non-String type was added
    //wouoldn't need to cast in this case

    //sometimes called a sequence
    //may contain duplicate elements
    //ordered list

    //arrayList = list of objects, references stored in array, may not know how
    //many will be in list - can't change size once created, fastest to use

    //linkList = list elements that point to each other, to expand - create
    //new element - add point from previous to current, slow to access elements
    // because to access 3 - has to access, 1, follow reference, then 2, follow

    //vector = not very common, similar to array, but all methods are synced

    //stack = a little different


