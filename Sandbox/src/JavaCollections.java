/**
 * Created by Carlee on 2016-09-20.
 */
import java.util.Scanner;


public class JavaCollections {

    public static void main(String[] args) {

        //creates new scanner
        Scanner scanner = new Scanner(System.in);

        //Prompts user for input
        System.out.println("Select one of the following to create it. \n1 = Map \n2 = List \n3 = Set \n4 = Tree");

        //saves user input
        Integer input = scanner.nextInt();

        switch (input) {
            case 1:
                JavaCollectionsMap.createMap() ;
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
                break;
        }

        //List in Java provides ordered and indexed collection which may contain duplicates
        //Set provides an un-ordered collection of unique objects, doesn't allow duplicates
        //Map provides a data structure based on key value pair and hashing
        // All three are interfaces in Java

    }
}
