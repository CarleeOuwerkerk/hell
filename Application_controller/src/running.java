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
            Matts matts = new Matts();
            switch (n) {
                case (1):
                    matts.dispatchRequest("HOME");
                    matts.dispatchRequest("STUDENT");
                    break;
                case (2):
                    matts.dispatchRequest("SCHOOL");
                    break;
                case (3):
                    matts.dispatchRequest("");
                    break;
                default:
                    i=false;
                    break;
            }
        }
    }
}
