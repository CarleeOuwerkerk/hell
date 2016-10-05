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
        TreeSet treeSet = new TreeSet();
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(11);


        System.out.println(treeSet.ceiling(8));

        Integer value = 11;
        if(treeSet.contains(value)) {
            System.out.println(value + " is in this TreeSet.");
        } else {
            System.out.println(value + " is not in this TreeSet.");
        }


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

        treeSet.add(9.1);



        System.out.println(treeSet.ceiling(8.5));
    }

}
