package main;

import java.util.Scanner;

public class MultiplicationTestDemo {
    public static void main(String [] args){
        UserData userData = new UserData();
        MultiplicationTest test = new MultiplicationTest(userData.getName(), userData.getMaxNumber(), userData.getMaxResult(), userData.getQuanity());

        test.timeStart();
        for (int i = 0; i < test.getQuantity(); i++){
            System.out.println(test.showMultiplicationOperation(i));
            Scanner scan = new Scanner(System.in);
            test.putMultiplicationOperationAnswer(i, scan.nextInt());
        }
        test.timeStop();
        System.out.println("Czas wykonania testu: " + test.getTestTime() + " sekund");
        System.out.println("Wynik procentowy: " + test.getPercentScore() + ", ocena: " + test.getRatingScore());
        test.showMistakes();

    }

}
