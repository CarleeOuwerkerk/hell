import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import json.*;

/**
 * Created by Carlee on 2016-11-12.
 */
@WebServlet(name = "Servlet", urlPatterns = "/t")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendError(408, "Your request timed out.");

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }
}

//NASTY PATH

//use http and json in and out stream
//application controller to fake no connection
//exit weirdly - mimics bad connection



//NASTY PATH

//use http and json in and out stream
//application controller to fake no connection
//don't wait for response, exits before server can respond