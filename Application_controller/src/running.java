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
            switch (n) {
                case (1):
                    page_one pageone = new page_one();
                    pageone.dispatchRequest("HOME");
                    pageone.dispatchRequest("STUDENT");
                    break;
                case (2):
                    Matts matts = new Matts();
                    matts.dispatchRequest("SCHOOL");
                    break;
                default:
                    i=false;
                    break;
                }
            }
        }
    }
