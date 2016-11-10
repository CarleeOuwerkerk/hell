import org.quickconnectfamily.json.*;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by foxma on 11/3/2016.
 */
@WebServlet(name = "Servlet", urlPatterns = {"/matt"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            String path = "C:\\Users\\foxma\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            JSONInputStream mattIn = new JSONInputStream(fileIn);

            Wood theWood= new Wood(1,"matt","fun");
            mattout.writeObject(theWood);
            mattout.close();
            JSONOutputStream outToWeb =  new JSONOutputStream(response.getOutputStream());
            outToWeb.writeObject(theWood);

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
