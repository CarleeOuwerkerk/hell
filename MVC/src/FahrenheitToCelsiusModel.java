// /**
// * Created by Carlee on 2016-10-08.
// */
//The model is the data, a representation of
//the data, and code that hides how the data is accessed and stored.

public class FahrenheitToCelsiusModel {

    private static FahrenheitToCelsiusView view;
    private static FahrenheitToCelsiusController controller;

    //should not be main class
    public static void main(String[] args){


        controller = new FahrenheitToCelsiusController();
        view = new FahrenheitToCelsiusView();

        //lets view know when controller's state changes
        controller.addObserver(view);

        //should be in controller
        //creates and sets listeners to the view
        view.addButtonListener(new Runnable(){
            public void run(){
                controller.setConvertToCelsius(view.getFNumber());
            }
        });
    }}


//get historical temperatures, add them to set of data.
//add to that in c to f
//can convert outside of model (in controller) to get temp in either f or c