import java.util.HashMap;

/**
 * Created by foxma on 10/24/2016.
 */
public class runner {
    public static void main(String[] args){
        ApplicationController applicationController = new ApplicationController();
        HashMap hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"matt");
        hashMap.put(1,"fox");
        hashMap.put(23,"the");

        applicationController.handleRequest("put" , hashMap );

    }
}
