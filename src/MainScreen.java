package main;
//Version 3.1 (start typing: 2023-09-16)

import java.util.InputMismatchException;
import java.util.Scanner;


public class MainScreen {


    private static void clearScreen(){
        for (int i = 0; i < 300; i++) System.out.println();
    }


    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String name;

        System.out.println("Hello! I am Multiplication Table Test Program! Would you play with me?");
        System.out.println("Please tell me Your name: ");
        name = scan.nextLine();
        System.out.println("Hello " + name + "! What you want to do?");
        System.out.println("1. Quick multiplication test (1 minute, 10 answers, max result 100)."); //quickTest
        System.out.println("2. Multiplication timed test (you configure parameters and time)."); //basicTest
        System.out.println("3. Check how fast you are (you configure parameters)."); //howFastTest
        System.out.println("4. Its enough for today - EXIT APP.");

        try {
            choice = scan.nextInt();
        } catch (InputMismatchException e){
            scan.nextLine();
        }
        while ((choice != 1) && (choice != 2) && (choice != 3) && (choice != 4)) {
//        while (choice != 1) {
            System.out.println("You write wrong answer - please choose correct choice, write its number and click ENTER (e. g. \"3\" + ENTER.");
            System.out.println(choice);
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e){
                scan.nextLine();
            }
        }

        if (choice == 1){
            clearScreen();
            new QuickTest();
        }
        else if (choice == 2){
            clearScreen();
            System.out.println("Basic test");
        }
        else if (choice == 3){
            clearScreen();
            System.out.println("How Fast Test");
        }
        else if (choice == 4){
            clearScreen();
            System.out.println("Bye bye...");
        }




    }
}
