package main.screens;

import main.*;

/***********************************************************************************************
 * TO DO:
 * -
 *
 * ************************************************************************************************/

public class QuickTest {
    public QuickTest(){
        final int MAXNUMBER = 10;
        final int MAXRESULT = 100;
        final int QUANTITY = 10;
        final int TIME = 60;
        int result = 0;

        //PREPARATION
        MultiplicationTest multiplicationTest = new MultiplicationTest("TEST", MAXNUMBER, MAXRESULT, QUANTITY);
        System.out.println("You have 1 minute to answer 10 questions. Click ENTER to start. Good luck:)");
        GetDataFromUser.getENTER();


        //TEST
        multiplicationTest.timeStart();
        for (int i = 0; i < QUANTITY; i++){
            try {
                if (multiplicationTest.getTestTime() > TIME) {
                    System.out.println("Sorry, you exceed test time (60 seconds). ");
                    break;
                }
            } catch (Exception e) {
                System.err.println("Exception - test timing error.");
                break;
            }
            System.out.println(multiplicationTest.showMultiplicationOperation(i));
            result = 0;
            result = GetDataFromUser.getInt(MAXRESULT);
            multiplicationTest.putMultiplicationOperationAnswer(i, result);
        }
        multiplicationTest.timeStop();


        try {
            System.out.println("Time: " + multiplicationTest.getTestTime() + " seconds...");
        } catch (Exception e){
            System.err.println("Exception: " + e.toString());
        }

        //SUMMARY
        multiplicationTest.getRatingScore();
        System.out.println("You answer to " + multiplicationTest.getAnsweredQuantity() + " question out of 10. " + multiplicationTest.getScore() + " answers was good. Your correctness is " + multiplicationTest.getPercentScore()*100 + "%.");
        System.out.print("Your grade is " + multiplicationTest.getRatingScore());
        System.out.println((multiplicationTest.getRatingScore() > 4) ? " - good job!" : " - practice some more...");
        System.out.println("Incorrect answers:");
        multiplicationTest.showMistakes();
        System.out.println("Click ENTER to back to main screen.");
        GetDataFromUser.getENTER();
    }
}
