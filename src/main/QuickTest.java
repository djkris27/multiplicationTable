package main;

/***********************************************************************************************
 * TO DO:
 * - add stopwatch to this test (60 seconds).
 *
 * ************************************************************************************************/

public class QuickTest {
    public QuickTest(){
        final int MAXNUMBER = 10;
        final int MAXRESULT = 100;
        final int QUANTITY = 10;
        int result = 0;

        //PREPARATION
        MultiplicationTest multiplicationTest = new MultiplicationTest("TEST", MAXNUMBER, MAXRESULT, QUANTITY);
        System.out.println("You have 1 minute to answer 10 questions. Click ENTER to start. Good luck:)");
        GetDataFromUser.getENTER();


        //TEST
        multiplicationTest.timeStart();
        for (int i = 0; i < QUANTITY; i++){
            System.out.println(multiplicationTest.showMultiplicationOperation(i));
            result = 0;
            result = GetDataFromUser.getInt(MAXRESULT);
            multiplicationTest.putMultiplicationOperationAnswer(i, result);
        }
        multiplicationTest.timeStop();


        //SUMMARY
        multiplicationTest.getRatingScore();
        System.out.println("You answer <x> question out of 10. " + multiplicationTest.getScore() + " answers was good. Your correctness is " + multiplicationTest.getPercentScore()*100 + "%.");
        System.out.print("Your grade is " + multiplicationTest.getRatingScore());
        System.out.println((multiplicationTest.getRatingScore() > 4) ? " - good job!" : " - practice some more...");
        System.out.println("Click ENTER to back to main screen.");
        GetDataFromUser.getENTER();
    }
}
