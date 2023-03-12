package main;
//Version 3.0 (start typing: 2023-02-26)

import java.util.Random;

public class Multiplication{
    private int number1, number2, result;

    //Max Number1 and Number2 = 10; MaxResult = 100
    Multiplication(int maxNumber, int maxResult){
        Random rand = new Random();
        while (true) {
            number1 = rand.nextInt(maxNumber)+1;
            number2 = rand.nextInt(maxNumber)+1;
            if ((number1*number2) <= maxResult)
                break;
        }
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

    public boolean isGoodResult(int checkResult){
        return (checkResult == result) ? true : false;
    }

    public boolean isEqual(int checkNumber1, int checkNumber2){
        return ((checkNumber1 == number1 && checkNumber2 == number2) || (checkNumber2 == number1 && checkNumber1 == number2))  ? true : false;
    }

    public boolean isEqual(Multiplication test){
        return (test.isEqual(number1, number2)) ? true : false;
    }

    @Override
    public String toString(){
        return number1 + " * " + number2 + " = ";
    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Version 2.0
/*
//package IdeaProjects.MultiplicationTable.src;
import java.util.Random;

public class Multiplication {
    private int number1, number2, answer = 0;

    Multiplication(int maxAnswer){
        Random rand = new Random();
        while (true) {
            number1 = rand.nextInt(10)+1;
            number2 = rand.nextInt(10)+1;
            if ((number1*number2) <= maxAnswer)
                break;
        }
    }

    Multiplication(int a, int b){
        number1 = a;
        number2 = b;
    }

    public int getAnswer() {
        return answer;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    void putAnswer(int a){
        answer = a;
    }

    boolean isGoodAnswer(){
        return (answer == number1 * number2) ? true : false;
    }
}
*/