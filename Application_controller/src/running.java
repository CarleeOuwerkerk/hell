/**
 * Created by foxma on 9/20/2016.
 */

import java.util.Scanner;

public class running {
    public static void main(String[] args) {
        for (boolean i = true; i == true; ) {
            Scanner reader = new Scanner(System.in);
            System.out.println("\n\n\nwhat do you want to run? \n 1. working \n 2. school \n 0. EXIT");
            int n = reader.nextInt();
            PageOne pageone = new PageOne();
            switch (n) {
                case (1):
                    pageone.dispatchRequest("HOME");
                    pageone.dispatchRequest("STUDENT");
                    break;
                case (2):
                    Matts matts = new Matts();
                    matts.dispatchRequest("SCHOOL");
                    break;
                case (3):
                    pageone.dispatchRequest("");
                default:
                    i=false;
                    break;
            }
        }
    }
}
