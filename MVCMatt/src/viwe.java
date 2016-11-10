import java.util.Scanner;

/**
 * Created by foxma on 11/9/2016.
 */
public class viwe {
    public static void main(String[] args){
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        for (boolean i = true; i; ){
            System.out.println("\n what sex do you want?" +
                    "\n1 = add" +
                    "\n2 = sub" +
                    "\n3 = show sex" +
                    "\n4 = exit\n");
            int input = scanner.nextInt();

            switch (input){
                case (3):
                    System.out.println(controller.getMap());
                    break;
                case (1):
                    System.out.println("\nwhat do you want to add one to:" +
                            "\n 1 = man" +
                            "\n 2 = woman");
                    int input2 = scanner.nextInt();
                    controller.findSex(input2);
                    controller.addSex();
                    break;
                case (2):
                    System.out.println("\nwhat do you want to sub one to:" +
                            "\n 1 = man" +
                            "\n 2 = woman");
                    int input3 = scanner.nextInt();
                    controller.findSex(input3);
                    controller.subSex();
                    break;
                default:
                    i = false;
                    break;
            }
        }
    }
}
