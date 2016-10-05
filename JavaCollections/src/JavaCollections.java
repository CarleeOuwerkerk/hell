//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class JavaCollections {
    public JavaCollections() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select one of the following. \n1 = Map \n2 = List \n3 = Set \n4 = Tree");
        Integer input = Integer.valueOf(scanner.nextInt());
        switch(input.intValue()) {
            case 1:
                JavaCollectionsMap.createMap();
                break;
            case 2:
                JavaCollectionsList.createList();
                break;
            case 3:
                JavaCollectionsSet.createSet();
                break;
            case 4:
                JavaCollectionsTree.createTree();
                break;
            default:
                System.out.println("Enter a valid option.");
        }

    }
}
