import java.util.Scanner;

/**
 * Created by Carlee on 2016-11-05.
 */
public class View {

    public static void main(String[] args){

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        for (boolean i = true; i; ) {

            System.out.println(" \nWhat would you like to do? \n" +
                    "1 = See how much fruit you have. \n" +
                    "2 = Add more fruit. \n" +
                    "3 = Discard fruit. \n" +
                    "4 = Exit");

            Integer input = scanner.nextInt();

            switch (input){

                case (1):
                    //should print map that's in Model
                    System.out.println(controller.getFruitMap());
                    break;

                case (2):
                    //ask which fruit you would like to add
                    System.out.println(" \nWhat type of fruit would you like to add? \n" +
                            "1 = Papaya \n" +
                            "2 = Peach \n" +
                            "3 = Mango \n");

                    Integer input2 = scanner.nextInt();
                    controller.findFruit(input2);

                    //gets number user would like to add
                    System.out.println(" \nHow many would you like to add?");

                    Integer input3 = scanner.nextInt();

                    //should add number of fruit
                    controller.findFruitToAdd(input3);

                    System.out.println(" \nSuccessfully added " + input3 + ".");
                    break;

                case (3):
                    //ask which fruit you would like to discard
                    System.out.println(" \nWhat type of fruit would you like to discard? \n" +
                            "1 = Papaya \n" +
                            "2 = Peach \n" +
                            "3 = Mango \n");

                    Integer input4 = scanner.nextInt();
                    controller.findFruit(input4);

                    //gets number user would like to discard
                    System.out.println(" \nHow many would you like to discard?");

                    Integer input5 = scanner.nextInt();

                    //should discard number of fruit
                    controller.findFruitToDiscard(input5);

                    System.out.println(" \nSuccessfully discarded " + input4 + ".");
                    break;

                default:
                    i=false;
                    break;
            }
        }
    }}