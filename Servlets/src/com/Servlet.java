package com;

import org.quickconnectfamily.json.JSONInputStream;
import org.quickconnectfamily.json.JSONOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;


/**
 * Created by Carlee on 2016-10-20.
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/test"})
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HashMap map = new HashMap();

        map.put("Canada", "2");
        map.put("USA", "8");
        map.put("Mexico", "1");


//        JSONObject jsonObject = new JSONObject(map);


        File fileOne = new File("fileOne.txt");

        FileInputStream fileIn = new FileInputStream(fileOne);
        FileOutputStream fileOut = new FileOutputStream(fileOne);

        JSONInputStream inFromClient = new JSONInputStream(fileIn);
        JSONOutputStream outToClient = new JSONOutputStream(fileOut);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("<h1>Test</h1>");
//        out.flush();

    }
}