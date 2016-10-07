/**
 * Created by Carlee on 2016-09-27.
 */
//The model is the data, a representation of
//the data, and code that hides how the data is accessed and stored.

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
