package test;

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


/*
import java.util.*;

public class MultiplicationTest {
    private String name;
    private int repeat, maxMultiplicationAnswer;
    private Multiplication multiplicationTable[];
    private long timeStop;
    private long multiplicationTime;

    MultiplicationTest(String aname, int arepeat, int amaxMultiplicationAnswer){
        name = aname;
        repeat = arepeat;
        maxMultiplicationAnswer = amaxMultiplicationAnswer;
        multiplicationTime = 5*repeat*1000; //5 second for one multiply. Result in seconds.

        multiplicationTable = new Multiplication[repeat];
        for (int i = 0; i < repeat; i++){
            multiplicationTable[i] = new Multiplication(maxMultiplicationAnswer);
        }
    }

    public String getName(){
        return name;
    }

    public int getRepeat(){
        return repeat;
    }

    public int getMaxMultiplicationAnswer(){
        return maxMultiplicationAnswer;
    }

    public void run(){
        timeStop = System.currentTimeMillis() + multiplicationTime;
        Scanner scan = new Scanner(System.in);
//        for (Multiplication multiplication : multiplicationTable){
        for( int i = 0; i < multiplicationTable.length; i++){
            System.out.println("Pozostało " + (timeStop-System.currentTimeMillis())/1000 + " sekund. Pytanie " + (i+1) + "/" + repeat + ":");
            System.out.println(multiplicationTable[i].getNumber1() + " * " + multiplicationTable[i].getNumber2() + " = ");
            while(true) {
                try {
                    multiplicationTable[i].putAnswer(scan.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Niepoprawna odpowiedź = podaj liczbę całkowitą: ");
                    scan.nextLine();
                }
            }
//            System.out.println("Pozostało " + (timeStop-System.currentTimeMillis())/1000 + " sekund.");
            if (timeStop < System.currentTimeMillis()){
                System.out.println("KONIEC CZASU!");
                break;
            }
        }
        scan.close();
        int goodAnswers = 0;
        for (Multiplication multiplication : multiplicationTable){
            if (multiplication.isGoodAnswer())
                goodAnswers++;
        }
        System.out.println("Odpowiedziałeś poprawnie na " + goodAnswers + " z " + repeat + " pytań. Jest to " + ((float)goodAnswers/(float)repeat)*100 + "%");
        if (goodAnswers < repeat) {
            System.out.println("Źle rozwiązane zadania to: ");
            for (Multiplication multiplication : multiplicationTable) {
                if (!multiplication.isGoodAnswer())
                    System.out.println(multiplication.getNumber1() + " * " + multiplication.getNumber2() + " = " + multiplication.getNumber1() * multiplication.getNumber2() + ", a nie " + multiplication.getAnswer());
            }
        }
        System.out.println("Twoja ocena to: ");

        if (((float)goodAnswers/(float)repeat) >= 0.86)
            System.out.print("5 - BRAWO:).");
        else if ((((float)goodAnswers/(float)repeat) < 0.86) & (((float)goodAnswers/(float)repeat) >= 0.70))
            System.out.print("4 - blisko...");
        else if ((((float)goodAnswers/(float)repeat) < 0.70) & (((float)goodAnswers/(float)repeat) >= 0.55))
            System.out.print("3.");
        else if ((((float)goodAnswers/(float)repeat) < 0.55) & (((float)goodAnswers/(float)repeat) >= 0.40))
            System.out.print("2 - trenuj więcej.");
        else if (((float)goodAnswers/(float)repeat) < 0.40)
            System.out.print("1 - dużo pracy przed Tobą. Zacznij się więc uczyć od razu:)");
        System.out.println();
        //        for(Multiplication a : multiplicationTable)
//            a.putAnswer(24);
//        for (Multiplication a : multiplicationTable)
//            System.out.println("Rozwiązanie: " + a.getNumber1() + " * " + a.getNumber2() + " " + (a.isGoodAnswer() ? "= " : "=/= ") + a.getAnswer());

    }

}


 */