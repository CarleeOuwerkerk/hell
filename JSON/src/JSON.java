import org.quickconnectfamily.json.JSONOutputStream;
import org.quickconnectfamily.json.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

/**
 * Created by Carlee on 2016-10-29.
 */
public class JSON {

    public static void main(String[] args) {



        //HAPPY PATH

        //this parses a JSON string
        try {
            //this is a string in the necessary json formatting
            String jsonString = "{\"Country\":\"Continent\"}";

            //this parses it, here I specified it to be a hashMap
            HashMap countryMap = (HashMap) JSONUtilities.parse(jsonString);
            System.out.println(countryMap);

        } catch (Exception e) {

            e.printStackTrace();
        }


        //NASTY PATH

        //this is a string in the incorrect format
        try {
            String jsonString = "Country : Continent";

            //this parses it, here I specified it to be a hashMap
            HashMap countryMap = (HashMap) JSONUtilities.parse(jsonString);
            System.out.println(countryMap);

        } catch (Exception e) {

            System.out.println("Incorrect string format.");
        }


        //NASTY PATH

        //null string
        try {
            String jsonString = null;

            //this parses it, here I specified it to be a hashMap
            HashMap countryMap = (HashMap) JSONUtilities.parse(jsonString);
            System.out.println(countryMap);

        } catch (Exception e) {

            System.out.println("Null was entered.");
        }


        //HAPPY PATH

        //create and write to file using an output stream
        try {
            String jsonString = "{\"Country\":\"Continent\"}";
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\jsonTest.txt";

            //file input and output streams must be created before json input and output streams
            FileOutputStream out = new FileOutputStream(filePath);

            JSONOutputStream jsonOut = new JSONOutputStream(out);


            //writes to file
            jsonOut.writeObject(jsonString);
            jsonOut.close();

        } catch (Exception e) {
            e.printStackTrace();

        }


        //NASTY PATH

        //read only file
        try {
            String jsonString = "{\"Country\":\"Continent\"}";
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\jsonTestReadOnly.txt";

            //file input and output streams must be created before json input and output streams
            FileOutputStream out = new FileOutputStream(filePath);

            JSONOutputStream jsonOut = new JSONOutputStream(out);


            //writes to file
            jsonOut.writeObject(jsonString);
            jsonOut.close();

        } catch (Exception e) {
            System.out.println("Read only file.");

        }


        //NASTY PATH

        //null file
        try {
            String jsonString = null;
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\jsonTest.txt";

            //file input and output streams must be created before json input and output streams
            FileOutputStream out = new FileOutputStream(filePath);

            JSONOutputStream jsonOut = new JSONOutputStream(out);


            //writes to file
            jsonOut.writeObject(jsonString);
            jsonOut.close();

        } catch (Exception e) {
            e.printStackTrace();

        }


        //HAPPY PATH

        //stringify an object
        try {
            Country country = new Country("Iceland", "Europe", 12);
            String countryString = JSONUtilities.stringify(country);
            System.out.println(countryString);

        } catch (Exception e) {
            e.printStackTrace();
        }


        //NASTY PATH

        //stringifies regular string
        try {
            String country = "String";
            String countryString = JSONUtilities.stringify(country);
            System.out.println(countryString);

        } catch (Exception e) {
            e.printStackTrace();
        }


        //NASTY PATH

        //stringifies empty string
        try {
            String country = "";
            String countryString = JSONUtilities.stringify(country);
            System.out.println(countryString);

        } catch (Exception e) {
            e.printStackTrace();
        }


        //HAPPY PATH

        //create and write to file using an output stream, then reads it
        try {
            String jsonString = "{\"Country\":\"Continent\"}";
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\jsonTest.txt";

            //file input and output streams must be created before json input and output streams
            FileOutputStream out = new FileOutputStream(filePath);
            FileInputStream in = new FileInputStream(filePath);

            JSONInputStream jsonIn = new JSONInputStream(in);
            JSONOutputStream jsonOut = new JSONOutputStream(out);


            //writes to file
            jsonOut.writeObject(jsonString);
            jsonOut.close();

            //reads from file
            System.out.println(jsonIn.readObject());
            jsonIn.close();


        } catch (Exception e) {
            e.printStackTrace();

        }




        //NASTY PATH

        //no read permission
        try {
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\jsonNoPermission.txt";

            FileInputStream in = new FileInputStream(filePath);

            JSONInputStream jsonIn = new JSONInputStream(in);

            //reads from file
            System.out.println(jsonIn.readObject());
            jsonIn.close();


        } catch (Exception e) {
            System.out.println("You do not have permission to read this file.");

        }



        //NASTY PATH

        //not a json file (image)
        try {
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\picture.jpg";

            FileInputStream in = new FileInputStream(filePath);

            JSONInputStream jsonIn = new JSONInputStream(in);

            //reads from file
            System.out.println(jsonIn.readObject());
            jsonIn.close();


        } catch (Exception e) {
            System.out.println("This is a picture.");

        }



        //NASTY PATH

        //file that doesn't exist
        try {
            String filePath = "C:\\Users\\Carlee\\Documents\\Projects360\\JSON\\doesNotExist.txt";

            FileInputStream in = new FileInputStream(filePath);

            JSONInputStream jsonIn = new JSONInputStream(in);

            //reads from file
            System.out.println(jsonIn.readObject());
            jsonIn.close();


        } catch (Exception e) {
            System.out.println("This file does not exist.");

        }

    }

}