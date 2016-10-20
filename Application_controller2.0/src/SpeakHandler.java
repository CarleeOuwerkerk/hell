
import java.util.HashMap;


public class SpeakHandler implements Handler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        try{
            System.out.println("just sent "+dataMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}