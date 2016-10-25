/**
 * Created by Carlee on 2016-10-08.
 */
//Any code that is used to
//communicate with the user OR ANY OTHER COMPUTING SYSTEM
//requesting or sending data

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class FahrenheitToCelsiusView {

//    //creates the different labels and boxes to enter number
//    private JTextField fNumber = new JTextField("");
//    private JButton button = new JButton("Calculate");
//    private JTextField cNumber = new JTextField(5);
//    private JFrame frame;
//
//    FahrenheitToCelsiusView() {
//
//        frame = new JFrame("MVC Pattern Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
//
//        //this creates and adds the different components that we've just created to the panel
//        JPanel panel = new JPanel();
//
//        //formats the panel
//        panel.setBorder(BorderFactory.createCompoundBorder(
//                BorderFactory.createLineBorder(Color.gray),
//                BorderFactory.createEmptyBorder(4,4,4,4)));
//        panel.setLayout(new GridLayout(10,1));
//
//        panel.add(new JLabel("Enter a number in Fahrenheit to convert it to Celsius."));
//        panel.add(new JLabel("Fahrenheit"));
//        panel.add(fNumber);
//        panel.add(button);
//        panel.add(new JLabel("Celsius"));
//        panel.add(cNumber);
//
//        //this adds the panel to the frame
//        frame.getContentPane().setLayout(new BorderLayout());
//        frame.getContentPane().add(panel,BorderLayout.WEST);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    public void addButtonListener(final Runnable response) {
//        //This adds an action listener to the calculate button
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e){
//                response.run();
//            }
//        });
//    }
//
//    //this gets the number the user entered
//    public Double getFNumber() {
//        double FNumber = Double.parseDouble(fNumber.getText());
//        fNumber.setText("");
//        return FNumber;
//    }
//
//    public void setCNumber(double result) {
//        cNumber.setText("" + result);
//    }
//
//    public void update(Observable t, Object o){
//        setCNumber(((FahrenheitToCelsiusController)t).getConvertToCelsius());
//    }




    //creates the different labels and boxes to enter number
    private JButton button = new JButton("Average in Celsius");
    private JButton buttonTwo = new JButton("Average in Fahrenheit");
    private JButton buttonThree = new JButton("Add");
    private JTextField year = new JTextField(4);
    private JTextField yearTwo = new JTextField(4);
    private JTextField temperature = new JTextField(3);
    private JTextField response = new JTextField("");
    private JTextField responseTwo = new JTextField("");
    private JFrame frame;

    FahrenheitToCelsiusView() {

        frame = new JFrame("Historical Average Temperatures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

        //this creates and adds the different components that we've just created to the panel
        JPanel panel = new JPanel();

        //formats the panel
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.gray),
                BorderFactory.createEmptyBorder(4,4,4,4)));
        panel.setLayout(new GridLayout(20,2));

        panel.add(new JLabel("Find a historical temperature"));
        panel.add(new JLabel("Year"));
        panel.add(year);
        panel.add(button);
        panel.add(buttonTwo);
        panel.add(response);
        panel.add(new JLabel(""));

        panel.add(new JLabel("Add new historical temperature                  "));
        panel.add(new JLabel("Year"));
        panel.add(yearTwo);
        panel.add(new JLabel("Temperature (Celsius)"));
        panel.add(temperature);
        panel.add(buttonThree);
        panel.add(responseTwo);


        //this adds the panel to the frame
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(panel,BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);

    }

        public void addButtonListener(final Runnable response) {

        //This adds an action listener to the calculate button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                response.run();
            }
        });

        buttonTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                response.run();
            }
        });

        buttonThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                response.run();
            }
        });
    }


    //this gets the number the user entered
    public Integer getYear() {
        Integer Year = Integer.parseInt(year.getText());
        year.setText("");
        return Year;
    }
    public Integer getYearTwo() {
        Integer YearTwo = Integer.parseInt(yearTwo.getText());
        yearTwo.setText("");
        return YearTwo;
    }
    public Double getTemperature() {
        double Temperature = Double.parseDouble(temperature.getText());
        temperature.setText("");
        return Temperature;
    }


    public void setResponse(String result) {
        response.setText("" + result);
    }


}