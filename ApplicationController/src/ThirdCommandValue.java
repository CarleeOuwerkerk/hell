import java.util.HashMap;

/**
 * Created by Carlee on 2016-10-29.
 */
public class ThirdCommandValue implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("The third command was called.");

    }
}