package main.screens;

import main.*;

/***********************************************************************************************
 * TO DO:
 * -
 *
 * ************************************************************************************************/

public class BasicTest {
    public BasicTest(){
        final int MAXNUMBER;
        final int MAXRESULT;
        final int QUANTITY;
        final int TIME;
        int result = 0;

        //PREPARATION
        System.out.println("Please enter time of test in seconds (max 5 minute):");
        TIME = GetDataFromUser.getInt(5*60);
        System.out.println("Please enter multiplication quantity (max 100):");
        QUANTITY = GetDataFromUser.getInt(100);
        System.out.println("Please enter max multiplicatioin component: (max 20)");
        MAXNUMBER = GetDataFromUser.getInt(20);
        System.out.println("Please enter max result (max 400):");
        MAXRESULT = GetDataFromUser.getInt(400);

        MultiplicationTest multiplicationTest = new MultiplicationTest("TEST", MAXNUMBER, MAXRESULT, QUANTITY);
        System.out.println("You have " + TIME + " seconds to answer " + QUANTITY + " questions. Click ENTER to start. Good luck:)");
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
        System.out.println("You answer <x> question out of 10. " + multiplicationTest.getScore() + " answers was good. Your correctness is " + multiplicationTest.getPercentScore()*100 + "%.");
        System.out.print("Your grade is " + multiplicationTest.getRatingScore());
        System.out.println((multiplicationTest.getRatingScore() > 4) ? " - good job!" : " - practice some more...");
        System.out.println("Incorrect answers:");
        multiplicationTest.showMistakes();
        System.out.println("Click ENTER to back to main screen.");
        GetDataFromUser.getENTER();
    }
}
