import java.util.HashMap;

/**
 * Created by Carlee on 2016-11-05.
 */
public class Controller{

    public Model model = new Model();
    String fruit;
    Integer newFruitNumber;

    public void findFruit(Integer input){

        switch (input) {

            case (1):
                fruit = "Papaya";
                break;
            case (2):
                fruit = "Peach";
                break;
            case (3):
                fruit = "Mango";
                break;
        }
    }

    public HashMap getFruitMap(){
        return model.getMap();
    }

    public void findFruitToAdd(Integer input3) {

        newFruitNumber = model.getAmount(fruit) + input3;
        model.putInMap(fruit, newFruitNumber);
    }

    public void findFruitToDiscard(Integer input5) {

        newFruitNumber = model.getAmount(fruit) - input5;
        model.putInMap(fruit, newFruitNumber);
    }
}