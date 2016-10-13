// /**
// * Created by Carlee on 2016-10-08.
// */
//The model is the data, a representation of
//the data, and code that hides how the data is accessed and stored.

public class FahrenheitToCelsiusModel {

    private static FahrenheitToCelsiusView view;
    private static FahrenheitToCelsiusController controller;

    public static void main(String[] args){


        controller = new FahrenheitToCelsiusController();
        view = new FahrenheitToCelsiusView();

        //lets view know when controller's state changes
        controller.addObserver(view);

        //creates and sets listeners to the view
        view.addButtonListener(new Runnable(){
            public void run(){
                controller.setConvertToCelsius(view.getFNumber());
            }
        });
    }}
