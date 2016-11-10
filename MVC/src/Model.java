import java.util.HashMap;

/**
 * Created by Carlee on 2016-11-05.
 */
public class Model {

    private HashMap<String, Integer> fruitMap = new HashMap<String, Integer>();

    public Model(){

        fruitMap.put("Papaya", 0);
        fruitMap.put("Peach", 0);
        fruitMap.put("Mango", 0);
    }

    public void putInMap(String fruit, Integer number){

        fruitMap.replace(fruit, number);
    }

    public Integer getAmount(String fruit){

        Integer fruitNumber = fruitMap.get(fruit);
        return fruitNumber;
    }

    public HashMap getMap(){
        return fruitMap;
    }
}