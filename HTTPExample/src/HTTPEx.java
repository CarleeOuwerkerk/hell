import java.net.*;
import java.io.*;

public class HTTPEx {
    public static void main(String[] args) throws IOException {

        URL ESPN = new URL("http://www.espn.com/");
        URLConnection conn = ESPN.openConnection();
        BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String s = buf.readLine();
        while (s != null){
            System.out.println(s);
            s = buf.readLine();

        }
    }
}