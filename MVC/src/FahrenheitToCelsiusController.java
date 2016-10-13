import java.util.Observable;

/**
 * Created by Carlee on 2016-10-08.
 */
//Control code is the smarts of the application. If a decision is being
//made, it’s Control code. If data is being manipulated, stats calculated,
//strings assembled, etc., its Control code.

public class FahrenheitToCelsiusController extends Observable {

    private double CNumber;

    public double getConvertToCelsius() {

        return CNumber;
    }

    public void setConvertToCelsius(Double FNumber){

        CNumber = (FNumber - 32) * 1.8;
        setChanged();
        notifyObservers();
    }
}