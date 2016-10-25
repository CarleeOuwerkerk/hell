import java.util.HashMap;

/**
 * Created by foxma on 10/24/2016.
 */
public class runner {
    public static void main(String[] args){
        ApplicationController applicationController = new ApplicationController();

        applicationController.mapCommand("the",new SpeakHandler());
        applicationController.mapCommand("tome",new SpeakHandler());

        String the = "the";

        HashMap data = new HashMap();
        data.put("matt","they");
        data.put("to","he");

        applicationController.handleRequest(the,data);
        applicationController.handleRequest("tome",data);
        applicationController.handleRequest("no",data);




    }
}
