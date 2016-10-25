// /**
// * Created by Carlee on 2016-10-08.
// */
//The model is the data, a representation of
//the data, and code that hides how the data is accessed and stored.

import java.util.HashMap;


public class FahrenheitToCelsiusModel {

//    private static FahrenheitToCelsiusView view;
//    private static FahrenheitToCelsiusController controller;
//
//    //should not be main class
//    public static void main(String[] args){
//
//
//        controller = new FahrenheitToCelsiusController();
//        view = new FahrenheitToCelsiusView();
//
//        //lets view know when controller's state changes
//        controller.addObserver(view);
//
//        //should be in controller
//        //creates and sets listeners to the view
//        view.addButtonListener(new Runnable(){
//            public void run(){
//                controller.setConvertToCelsius(view.getFNumber());
//            }
//        });
//    }

    HashMap historicAveTemps = new HashMap();
    private String year;
    private Double temperature;

    public void createMap() {


        historicAveTemps.put(2000, 15);
        historicAveTemps.put(2001, 17);
        historicAveTemps.put(2002, 12);
        historicAveTemps.put(2003, 18);
        historicAveTemps.put(2004, 12);
        historicAveTemps.put(2005, 16);
        historicAveTemps.put(2006, 15);
        historicAveTemps.put(2007, 15);
        historicAveTemps.put(2008, 13);
        historicAveTemps.put(2009, 16);
        historicAveTemps.put(2010, 14);
        historicAveTemps.put(2011, 14);
        historicAveTemps.put(2012, 12);
        historicAveTemps.put(2013, 15);
        historicAveTemps.put(2014, 14);
        historicAveTemps.put(2015, 12);

    }

    public void putInMap() {

        historicAveTemps.put(year, temperature);

    }

    public void getFromMap() {

        if (historicAveTemps.containsKey(year)) {

            //this should be sent to view
            historicAveTemps.get(year);

        } else {

            //this should happen in the view
            System.out.println("There is no record of temperatures for this year.");
        }

    }
}


//get historical temperatures, add them to set of data.
//add to that in c to f
//can convert outside of model (in controller) to get temp in either f or c