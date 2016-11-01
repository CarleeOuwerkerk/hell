/**
 * Created by foxma on 10/31/2016.
 */

import java.net.*;
import java.io.*;

public class Http {

        public static void main(String[] args) throws IOException {

            Http http =new Http();

            URL BYUI = new URL("http://www.byui.edu/");
            URLConnection conn = BYUI.openConnection();
            BufferedReader buf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String s = buf.readLine();
            while (s != null){
                System.out.println(s);
                s = buf.readLine();
            }

            try {
                URL BYUI2 = new URL("http://www.byui.edu/fasdfasfas.no");
                URLConnection conn2 = BYUI2.openConnection();
                BufferedReader buf2 = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
                String s2 = buf2.readLine();
                while (s2 != null) {
                    System.out.println(s2);
                    s2 = buf2.readLine();
                }
            }
            catch (Exception e){
                System.out.print("not this");
            }

            try {
                URL BYUI3 = new URL("http://www.byui.edu/");
                URLConnection conn3 = BYUI3.openConnection();
                BufferedReader buf3 = new BufferedReader(new InputStreamReader(conn3.getInputStream()));
                String s3 = buf3.readLine();
                System.out.println(s3);
            }
            catch (Exception e){
                System.out.print("there is no loop\n");
            }

            try {
                URL BYUI4 = new URL("123.123.123.1232");
                URLConnection conn4 = BYUI4.openConnection();
                BufferedReader buf4 = new BufferedReader(new InputStreamReader(conn4.getInputStream()));
                String s4 = buf4.readLine();
                while (s4 != null) {
                    System.out.println(s4);
                    s4 = buf4.readLine();
                }
            }
            catch (Exception e){
                System.out.print("incorect URL\n");
            }

            try {
                URL BYUI6 = new URL("www.why.com");
                URLConnection conn6 = BYUI6.openConnection();
                BufferedReader buf6 = new BufferedReader(new InputStreamReader(conn6.getInputStream()));
                String s6 = buf6.readLine();
                while (s6 != null) {
                    System.out.println(s6);
                    s6 = buf6.readLine();
                }
            }
            catch (Exception e){
                System.out.print("url is not reale\n");
            }


            try {
                URL BYUI5 = new URL("");
                URLConnection conn5 = BYUI5.openConnection();
                BufferedReader buf5 = new BufferedReader(new InputStreamReader(conn5.getInputStream()));
                String s5 = buf5.readLine();
                while (s5 != null) {
                    System.out.println(s5);
                    s5 = buf5.readLine();
                }
            }
            catch (Exception e){
                System.out.print("no URL\n");
            }




        }


}
