import java.util.HashMap;

/**
 * Created by Carlee on 2016-11-07.
 */
public class Person {

    String name;
    Boolean male = false;
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    public String addToMap;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isMaleNow(){
        male = true;
        return male;
    }

    public void throwException() throws RuntimeException{
        throw new RuntimeException("There was a runtime exception.");
    }

    public Boolean addToMap() {
        map.put("Something", 10);
        return map.isEmpty();
    }
}