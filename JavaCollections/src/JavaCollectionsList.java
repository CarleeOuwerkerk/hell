//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;

public class JavaCollectionsList {
    public JavaCollectionsList() {
    }

    public static void createList() {
        ArrayList list = new ArrayList();
        list.add("Harry Potter");
        list.add("Lord of The Rings");
        list.add("Pride & Prejudice");
        System.out.println("There are " + list.size() + " books in the list.");
        System.out.println("The first element in the list is " + (String)list.get(0) + ".");
        String value = "Lord of The Rings";
        if(list.contains(value)) {
            System.out.println(value + " is an element in this list.");
        } else {
            System.out.println(value + " is not an element in this list.");
        }

        System.out.println((String)list.get(1) + " is in the second position of this list.");
        System.out.println("The first occurrence of Pride & Prejudice in the list is in the position of index " + list.indexOf("Pride & Prejudice") + ".");

        for(int i = 0; i < list.size(); ++i) {
            System.out.println((String)list.get(i));
        }

        if(list.isEmpty()) {
            System.out.println("This list is empty.");
        } else {
            System.out.println("This list is not empty.");
        }

        list.remove("Pride & Prejudice");
        System.out.println("There are " + list.size() + " books in the list.");
        list.clear();
        if(list.isEmpty()) {
            System.out.println("This list is empty.");
        } else {
            System.out.println("This list is not empty.");
        }

    }
}
