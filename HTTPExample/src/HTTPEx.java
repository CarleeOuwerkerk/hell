

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;
public class HTTPEx {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int user_input = input.nextInt();


        switch (user_input) {
            case 1:

                URL ESPN = new URL("http://www.espn.com/");
                URLConnection conn = ESPN.openConnection();
                BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String a = buf.readLine();
                while (a != null) {
                    System.out.println(a);
                    a = buf.readLine();

                }

                break;

            case 2:

                try {
                    URL Bad = new URL("http://www.espn/");
                    URLConnection badConn = Bad.openConnection();
                    BufferedReader buff = new BufferedReader(new InputStreamReader(badConn.getInputStream()));
                    String b = buff.readLine();
                    while (b != null) {
                        System.out.println(b);
                        b = buff.readLine();
                    }
                } catch (UnknownHostException badURL) {
                    badURL.printStackTrace(); // unknownhostexception
                }

            case 3:

                try {
                    URL Bad = new URL("http://www.espn.com/dsfsdfsfs.html");
                    URLConnection badConn = Bad.openConnection();
                    BufferedReader buff = new BufferedReader(new InputStreamReader(badConn.getInputStream()));
                    String b = buff.readLine();
                    while (b != null) {
                        System.out.println(b);
                        b = buff.readLine();
                    }
                } catch (FileNotFoundException nastyURL) {
                    nastyURL.printStackTrace(); // FileNotFoundexception
                }

            case 4:

                URL Bad = new URL("http://www.espn.com");
                URLConnection badConn = Bad.openConnection();
                BufferedReader buff = new BufferedReader(new InputStreamReader(badConn.getInputStream()));
                String b = buff.readLine();

                System.out.println(b);
                b = buff.readLine();


            case 5:


                URL gross = new URL("http://www.espn.com");
                URLConnection grossConn = gross.openConnection();
                BufferedReader buffing = new BufferedReader(new InputStreamReader(grossConn.getInputStream()));
                String c = buffing.readLine();
                while (c != null) {
                    System.out.println(c);
                    a = buffing.readLine();


                }

            case 6:

                URL ESPNs = new URL("https://www.espn.com/");
                URLConnection conns = ESPNs.openConnection();
                BufferedReader bufs = new BufferedReader(new InputStreamReader(conns.getInputStream()));
                String as = bufs.readLine();
                while (as != null) {
                    System.out.println(as);
                    as = bufs.readLine();

                }

        }
    }
}
