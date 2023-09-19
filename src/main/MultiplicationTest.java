package main;

/***********************************************************************************************
 * TO DO:
 * - change, when score and another elements are couted (maybe add countAllScoreNow() method??)
 *
 * ************************************************************************************************/

public class MultiplicationTest{
    private String name;
    private int quantity;
    private Multiplication[] multiplicatioinTable;
    private int [] multiplicationTableAnswer;
    private int ratingScore, score;
    private float percentScore;
    private long timeStart = 0, timeStop = 0;



    MultiplicationTest(String getName, int maxNumber, int maxResult, int getQuantity){
        name = getName;
        quantity = getQuantity;
        multiplicatioinTable = MultiplicationGenerator.generateMultiplication(maxNumber, maxResult, quantity);
        multiplicationTableAnswer = new int[quantity];
    }

    public String showMultiplicationOperation(int index){
        return multiplicatioinTable[index].toString();
    }

    public void putMultiplicationOperationAnswer(int index, int result){
        multiplicationTableAnswer[index] = result;
    }

    public void showMistakes(){
        for (int i = 0; i < multiplicatioinTable.length; i++)
            if (!multiplicatioinTable[i].isGoodResult(multiplicationTableAnswer[i]))
                System.out.println("Wynik działania " + multiplicatioinTable[i].getNumber1() + " * " + multiplicatioinTable[i].getNumber2() + " = " + multiplicatioinTable[i].getResult() + ", a nie " + multiplicationTableAnswer[i]);
    }

    public float getPercentScore(){
        countScore();
        return percentScore;
    }

    public int getRatingScore(){
        countScore();
        return ratingScore;
    }

    private void countScore(){
        score = 0;
        for (int i = 0; i < multiplicatioinTable.length; i++){
            if (multiplicatioinTable[i].isGoodResult(multiplicationTableAnswer[i]))
                score++;
        }
        percentScore = (float)score / (float)quantity;
        if (percentScore > 0.86)
            ratingScore = 5;
        else if ((percentScore <= 0.86) && (percentScore > 0.7))
            ratingScore = 4;
        else if ((percentScore <= 0.7) && (percentScore > 0.55))
            ratingScore  = 3;
        else if ((percentScore <= 0.55) && (percentScore > 0.4))
            ratingScore = 2;
        else
            ratingScore = 1;
    }

    public int getScore(){
        return score;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getName(){
        return name;
    }

    public void timeStart(){
        timeStart = System.currentTimeMillis();
    }

    public void timeStop(){
        timeStop = System.currentTimeMillis();
    }

    public int getTestTime(){
        if ((timeStart != 0) && (timeStop != 0))
            return (int)((timeStop - timeStart)/1000);
        else
            return -1;
    }

}