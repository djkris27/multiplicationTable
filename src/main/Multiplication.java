package main;
//Version 3.1 (start typing: 2023-02-26)

import java.util.Random;

public class Multiplication{
    private int number1, number2, result;

    //Max Number1 and Number2 ; MaxResult = 100
    Multiplication(int maxNumber, int maxResult){
        Random rand = new Random();
        do {
            number1 = rand.nextInt(maxNumber)+1;
            number2 = rand.nextInt(maxNumber)+1;
        } while ((number1*number2) > maxResult);
        result = number1 * number2;
    }

    public int getResult() {
        return result;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public boolean isGoodResult(int checkedResult){
        return (checkedResult == result) ? true : false;
    }

    public boolean isEqual(int checkedNumber1, int checkedNumber2){
        return ((checkedNumber1 == number1 && checkedNumber2 == number2) || (checkedNumber2 == number1 && checkedNumber1 == number2))  ? true : false;
    }

    public boolean isEqual(Multiplication checkedMultiplication){
        return (checkedMultiplication.isEqual(number1, number2)) ? true : false;
    }

    @Override
    public String toString(){
        return number1 + " * " + number2 + " = ";
    }
}