import org.quickconnectfamily.json.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

/**
 * Created by foxma on 11/1/2016.
 */
public class main {
    public static void main(String[] args){

        // parsing a string

        try {
            String name = "{\"this is\":\"Matt Fox\"}";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            String name = "this is:Matt Fox";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }


        try {
            String name = "";
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            String name = null;
            HashMap jsonList =(HashMap) JSONUtilities.parse(name);
            System.out.println(jsonList);
        } catch (Exception e){
            e.printStackTrace();
        }


        // writing to a file

        try{
            String name = "{\"this is\":\"Matt Fox\"}";
            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            String name = "{\"this is\":\"Matt Fox\"}";
            String path = "";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            String name = "";
            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            String name = null;
            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        try{
            String name = "{\"this is\":\"Matt Fox\"}";
            String path = null;
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            String name = "{\"this is\":\"Matt Fox\"}";
            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtestRead.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            mattout.writeObject(name);
            mattout.close();
        } catch (Exception e){
            e.printStackTrace();
        }

        try{
            String matttest = "";
            String name = "{\"this is\":\"Matt Fox\"}";
            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            JSONInputStream mattIn = new JSONInputStream(fileIn);
           // mattIn.toString(matttest);
            mattout.writeObject(name);
            mattout.close();
            System.out.print(matttest);
        } catch (Exception e){
            e.printStackTrace();
        }

        // reading from a file


        try {
            String path = "C:\\Users\\Nathan\\Documents\\CIT 360\\test.txt";

            FileInputStream fileInput = new FileInputStream(path);

            JSONInputStream jsonInputStream = new JSONInputStream(fileInput);
            String aString = (String)jsonInputStream.readObject();
            jsonInputStream.close();
            System.out.println(aString);
        }
        catch (Exception e) {
            e.printStackTrace();
        }



        // to stringafiy a java been

        try{
            Wood theWood= new Wood(1,"matt","fun");
            String wood = JSONUtilities.stringify(theWood);
            System.out.print(wood);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        try{
            String theWood= "1";
            String wood = JSONUtilities.stringify(theWood);
            System.out.print(wood);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            Wood theWood= new Wood(1,null,null);
            String wood = JSONUtilities.stringify(theWood);
            System.out.print(wood);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
