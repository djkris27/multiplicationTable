//Version 3.0 (start typing: 2023-02-26).
//This class is One Multiplication Test - we can generate one operation and check, if our result is correct.

package test;
import java.util.Random;

public class Multiplication{
    private int number1, number2, result;

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

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getResult() {
        return result;
    }

    public boolean isGoodResult(int checkedResult){
        return (checkedResult == result) ? true : false;
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