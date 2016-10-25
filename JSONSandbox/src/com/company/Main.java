
import org.quickconnectfamily.json.JSONException;
import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.JSONUtilities;

import java.io.*;
import java.util.HashMap;

/*
 * Created by landonwright on 10/18/16.
 */

public class Main {


    //Creating a JSON object
    public static void main(String[] args) {
        HashMap theMap = new HashMap();

        theMap.put("name", "John Stockton");
        theMap.put("number", 12);
        theMap.put("team", "Utah Jazz");
        theMap.put("date drafted", 1987);
        theMap.put("date retired", 2001);
        theMap.put("hall of fame", true);


        //Stringify JSON
        try {
            String JSONString = JSONUtilities.stringify(theMap);
            System.out.println(JSONString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Parse JSON String
        try {
            String jsonString = "{\"name\":\"John Stockton\",\"number\":\"12\",\"team\":\"Utah Jazz\",\"date drafted\":\"1987\",\"date retired\":\"2001\",\"hall of fame\":\"true\"}";
            HashMap playerInfo = (HashMap) JSONUtilities.parse(jsonString);
            System.out.println(playerInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // output stream
        try{
            //create a new file
            File newFile = new File("Json.txt");

            // create both a file input and output stream
            FileOutputStream output = new FileOutputStream(newFile);
            FileInputStream input = new FileInputStream(newFile);

            // create both a json input and output stream
            JSONOutputStream jsonoutput = new JSONOutputStream(output);
            JSONInputStream jsoninput = new JSONInputStream(input);

            //write new objects to the file
            jsonoutput.writeObject(John Stockton);
            jsonoutput.writeObject(Karl Malone);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}

