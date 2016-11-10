import java.util.HashMap;

/**
 * Created by Carlee on 2016-10-27.
 */
public class SecondCommandValue implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("The second command was called.");

    }
}
