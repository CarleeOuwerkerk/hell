/**
 * Created by Carlee on 2016-09-20.
 */

import java.util.Map;
import java.util.HashMap;

public class JavaCollectionsMap {

        public static void createMap() {

                //Creates a new map object called map
                Map<String, Integer> map = new HashMap<String, Integer>();


                //HAPPY PATH

                //sets how many there are of each book  -  map.put(key, value)
                map.put("Harry Potter", 2);
                map.put("Lord of The Rings", 7);
                map.put("Pride & Prejudice", 4);

                //map.size() finds how many items are in map
                System.out.println("There are " + map.size() + " books in total.");

                //sets key variable
                String key = "Harry Potter";

                //gets number of Harry Potter books
                System.out.println("There are " + map.get(key) + " " + key + " books.");

                //checks whether it contains a key named Harry Potter (boolean)
                if (map.containsKey(key)){
                        System.out.println(key + " is a key in this map.");
                } else{
                        System.out.println(key + " is not a key in this map.");
                }

                //checks whether there is a value of 3 in the map somewhere (boolean)
                if (map.containsValue(3)){
                    System.out.println("3 is a value in this map.");
                } else{
                    System.out.println("3 is not a value in this map.");
                }

                //checks whether the map is empty
                if (map.isEmpty()){
                    System.out.println("This map is empty.");
                } else{
                    System.out.println("This map is not empty.");
                }

                //removes the Harry Potter
                map.remove("Harry Potter");

                //checks again how many there are in the map
                System.out.println("There are " + map.size() + " books in total.");

                //clears all values in map
                map.clear();

                //check again how many there are in the map
                System.out.println("There are " + map.size() + " books in total.");



                //NASTY PATH

                //could call one that doesn't exist?
                //could add value that has a decimal


            //maps will map a key to a value
            //no duplicate elements
            //creates a map that will tell me how many there are of each object

            //hashmap = order doesn't matter, sort doesn't matter, random,
            //eliminates duplicates
            //hashtable = synchronized (hashmap + synchronization)
            //linkedhashmap = insertion order is maintained, not sorted order
            //treemap = sorted (if enter b, a, d will store a, b, d), no insertion
            // and eliminates duplicates order
        }
}
