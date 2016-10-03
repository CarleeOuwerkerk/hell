//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.HashMap;

public class JavaCollectionsMap {
    public JavaCollectionsMap() {
    }

    public static void createMap() {
        HashMap map = new HashMap();
        map.put("Harry Potter", Integer.valueOf(2));
        map.put("Lord of The Rings", Integer.valueOf(7));
        map.put("Pride & Prejudice", Integer.valueOf(4));
        System.out.println("There are " + map.size() + " books in total.");
        String key = "Harry Potter";
        System.out.println("There are " + map.get(key) + " " + key + " books.");
        if(map.containsKey(key)) {
            System.out.println(key + " is a key in this map.");
        } else {
            System.out.println(key + " is not a key in this map.");
        }

        if(map.containsValue(Integer.valueOf(3))) {
            System.out.println("3 is a value in this map.");
        } else {
            System.out.println("3 is not a value in this map.");
        }

        if(map.isEmpty()) {
            System.out.println("This map is empty.");
        } else {
            System.out.println("This map is not empty.");
        }

        map.remove("Harry Potter");
        System.out.println("There are " + map.size() + " books in total.");
        map.clear();
        System.out.println("There are " + map.size() + " books in total.");
    }
}
