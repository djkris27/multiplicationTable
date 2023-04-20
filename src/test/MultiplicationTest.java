//This version of Multiplication Test is for using with Swing

package test;

public class MultiplicationTest {
    private String name;
    private int quantity;
    private Multiplication[] multiplicatioinTable;
    private int [] multiplicationTableAnswer;
    private int ratingScore, score;
    private float percentScore;
    private long timeStart = 0, timeStop = 0;
    boolean alreadyCounting = false;



    public MultiplicationTest(String getName, int maxNumber, int maxResult, int getQuantity){
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

//    public void showMistakes(){
//    //TO DO...
//    }

    public float getPercentScore(){
        if (!alreadyCounting)
            countScore();
        return percentScore;
    }

    public int getRatingScore(){
        if (!alreadyCounting)
            countScore();
        return ratingScore;
    }

    //Count score of all test and set ratingScore (Mark)
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
        alreadyCounting = true;
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

    public Multiplication[] getMultiplicationTable(){
        return multiplicatioinTable;
    }

}