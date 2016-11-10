import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;


/**
 * Created by Carlee on 2016-10-27.
 */
public class HTTPConnection {

    public static void main(String[] args) throws IOException{


        //HAPPY PATH

        //opens a connection to web address and prints html
        URL pinterest = new URL("https://www.pinterest.com/");
        URLConnection connection = pinterest.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String string = reader.readLine();
        while (string != null){
            System.out.println(string);
            string = reader.readLine();
        }



        //NASTY PATH

        //Invalid web address
        try{
            URL youtube = new URL("https://www.youtube.net/");
            URLConnection connection2 = youtube.openConnection();
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(connection2.getInputStream()));

        } catch (Exception e){
        System.out.println("Invalid web address");
        }



        //NASTY PATH

        //nothing is printed because there is no loop to read the entire thing
        URL bonIver = new URL("http://www.boniver.org/");
        URLConnection connection3 = bonIver.openConnection();
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(connection3.getInputStream()));
        String string3 = reader3.readLine();
        System.out.println(string3);



        //NASTY PATH

        //bad extension
        try {
            URL bonIver2 = new URL("http://www.boniver.org/badextension/");
            URLConnection connection4 = bonIver2.openConnection();
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(connection4.getInputStream()));
        } catch (Exception e){
            System.out.println("Bad extension");
        }



        //NASTY PATH

        //null as website
        try {
            URL nullURL = new URL(null);
            URLConnection connection4 = nullURL.openConnection();
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(connection4.getInputStream()));
            String string4 = reader4.readLine();
            System.out.println(string4);

        } catch (Exception e){
            System.out.println("Null was entered.");
        }
}}
//null as website

