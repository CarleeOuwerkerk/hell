//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.HashSet;
import java.util.Iterator;

public class JavaCollectionsSet {
    public JavaCollectionsSet() {
    }

    public static void createSet() {
        HashSet set = new HashSet();
        set.add("Harry Potter");
        set.add("Lord of The Rings");
        set.add("Pride & Prejudice");
        System.out.println("This set has " + set.size() + " elements in it.");
        String value = "Pride & Prejudice";
        if(set.contains(value)) {
            System.out.println(value + " is in this set.");
        } else {
            System.out.println(value + " is not in this set.");
        }

        Iterator var2 = set.iterator();

        while(var2.hasNext()) {
            String element = (String)var2.next();
            System.out.println(element);
        }

        if(set.isEmpty()) {
            System.out.println("This set is empty.");
        } else {
            System.out.println("This set is not empty.");
        }

        set.remove("Harry Potter");
        System.out.println("This set has " + set.size() + " elements in it.");
        set.clear();
        if(set.isEmpty()) {
            System.out.println("This set is empty.");
        } else {
            System.out.println("This set is not empty.");
        }

    }
}
