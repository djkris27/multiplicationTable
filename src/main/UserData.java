//2023-09-21 6:18 CHECK IF THIS CLASS IS NEEDED...
/*
package main;
import java.util.Scanner;

public class UserData {
    private String name;
    private int maxNumber, maxResult, quanity;

    UserData(String givenName, int givenMaxNumber, int givenMaxResult, int givenQuantity){
        name = new String(givenName);
        maxNumber = givenMaxNumber;
        maxResult = givenMaxResult;
        quanity = givenQuantity;
    }

    UserData(){
        maxNumber = 0;
        maxResult = 0;
        quanity = 0;

        askName();
        askMaxNumber();
        askMaxResult();
        askQuantity();
    }

    //Dodać wyjątki błędnej nazwy
    private void askName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać swoje imię: ");
        name = scan.nextLine();
    }

    //Dodać wyjątki błędnie wprowadzonej liczby
    private void askMaxNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać maksymalny czynnik iloczynu: ");
        maxNumber = scan.nextInt();
    }

    //Dodać wyjątki błędnie wprowadzonej liczby
    private void askMaxResult(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać maksymalny wynik: ");
        maxResult = scan.nextInt();
    }

    //Dodać wyjątki błędnie wprowadzonej liczby
    private void askQuantity(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podać liczbę działań: ");
        quanity = scan.nextInt();
    }

    public String getName(){
        return name;
    }

    public int getMaxNumber(){
        return maxNumber;
    }

    public int getMaxResult(){
        return maxResult;
    }

    public int getQuanity(){
        return quanity;
    }

}
*/