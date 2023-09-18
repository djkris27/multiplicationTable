package main;

import java.util.Scanner;

public class QuickTest {
    public QuickTest(){
        final int MAXNUMBER = 10;
        final int MAXRESULT = 100;
        final int QUANTITY = 10;


        MultiplicationTest multiplicationTest = new MultiplicationTest("TEST", MAXNUMBER, MAXRESULT, QUANTITY);
        System.out.println("You have 1 minute to answer 10 questions. Click ENTER to start. Good luck:)");

        Scanner scan = new Scanner(System.in);
        int result = 0;
        scan.nextLine();
        multiplicationTest.timeStart();

        for (int i = 0; i < QUANTITY; i++){
            System.out.println(multiplicationTest.showMultiplicationOperation(i));
            result = 0;
            do {
                try {
                    result = scan.nextInt();
                    if (!((result > 0) && (result <= MAXRESULT))) {
                        System.out.println("Something wrong - please answer again. You can put numbers from 1 to " + MAXRESULT);
                    }
                    else {
                        multiplicationTest.putMultiplicationOperationAnswer(i, result);
                    }
                } catch (Exception e){
                    System.out.println("Something wrong - please answer again. You can put numbers from 1 to " + MAXRESULT);
                    scan.nextLine();
                }
            } while (!((result > 0) && (result <= MAXRESULT)));
        }

        multiplicationTest.timeStop();
        System.out.println("You answer <x> question out of 10. <y> answers was good. Your correctness is " + multiplicationTest.getPercentScore()*100 + "%.");
        System.out.print("Your grade is " + multiplicationTest.getRatingScore());
        System.out.println((multiplicationTest.getRatingScore() > 4) ? " - good job!" : " - practice some more...");
        System.out.println("Click ENTER to back to main screen.");


    }
}
