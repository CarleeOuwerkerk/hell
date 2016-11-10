import java.util.HashMap;

/**
 * Created by Carlee on 2016-10-27.
 */
public class FirstCommandValue implements Handler{


    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("The first command was called.");

    }
}
