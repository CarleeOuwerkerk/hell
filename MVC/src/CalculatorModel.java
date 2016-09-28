/**
 * Created by Carlee on 2016-09-27.
 */
//the model performs all the calculations needed.  That's it.
//It doesn't know that the view exists.

public class CalculatorModel {

    //holds the value of the sum of the numbers entered in the view

    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){

        calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue(){
        return calculationValue;
    }

}
