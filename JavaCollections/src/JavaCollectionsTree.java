//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.TreeSet;

public class JavaCollectionsTree {
    public JavaCollectionsTree() {
    }

    public static void createTree() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(Integer.valueOf(4));
        treeSet.add(Integer.valueOf(9));
        treeSet.add(Integer.valueOf(11));
        treeSet.ceiling(Integer.valueOf(9));
        Integer value = Integer.valueOf(11);
        if(treeSet.contains(value)) {
            System.out.println(value + " is in this TreeSet.");
        } else {
            System.out.println(value + " is not in this TreeSet.");
        }

        TreeSet descendingTree = (TreeSet)treeSet.descendingSet();
        treeSet.clear();
    }
}
