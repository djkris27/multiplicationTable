package main.screens;

import main.*;

/***********************************************************************************************
 * TO DO:
 * - ALL:-p
 *
 * ************************************************************************************************/

public class HowFastTest {
    public HowFastTest(){
        final int MAXNUMBER;
        final int MAXRESULT;
        final int QUANTITY = 50;
        final int TIME = 60;
        int result = 0;

        //PREPARATION
        System.out.println("Please enter max multiplicatioin component: (max 20)");
        MAXNUMBER = GetDataFromUser.getInt(20);
        System.out.println("Please enter max result (max 400):");
        MAXRESULT = GetDataFromUser.getInt(400);
        //set as many quantity as numbers and results allow - for very very fast people;)
        /************
         * CHANGE QUANTITY to check as many possibilities, as you can.


        if ((MAXNUMBER * MAXNUMBER) > MAXRESULT)
            QUANTITY = MAXRESULT;
        else
            QUANTITY = MAXNUMBER * MAXNUMBER;
         */
        MultiplicationTest multiplicationTest = new MultiplicationTest("TEST", MAXNUMBER, MAXRESULT, QUANTITY);
        System.out.println("You have got 1 minute for test. Calculate as many excercise as you can. Try not to make a mistake;) Good Luck!");
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
        /****************
         * Change count a grade and corectness - not for all quantity of questions, but by answered questions.
         */
        System.out.println("You answer <x> question. " + multiplicationTest.getScore() + " answers was good. Your correctness is " + multiplicationTest.getPercentScore()*100 + "%.");
        System.out.print("Your grade is " + multiplicationTest.getRatingScore());
        System.out.println((multiplicationTest.getRatingScore() > 4) ? " - good job!" : " - practice some more...");
        System.out.println("Incorrect answers:");
        multiplicationTest.showMistakes();
        System.out.println("Click ENTER to back to main screen.");
        GetDataFromUser.getENTER();
    }
}
