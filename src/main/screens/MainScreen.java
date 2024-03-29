package main.screens;
//Version 3.1 (start typing: 2023-09-16)

import main.*;

public class MainScreen {
    private static void clearScreen(){
        for (int i = 0; i < 300; i++) System.out.println();
        System.out.print("\033[H\033[2J");
    }


    public static void main(String [] args){
        final int EXIT = 4;
        int choice = 0;
        String name;

        System.out.println("Hello! I am Multiplication Table Test Program! Would you play with me?");
        System.out.println("Please tell me Your name: ");
        name = GetDataFromUser.getString();
        System.out.println("Hello " + name + "! What you want to do?");
        do {
            clearScreen();
            System.out.println("1. Quick multiplication test (1 minute, 10 answers, max result 100)."); //quickTest
            System.out.println("2. Multiplication timed test (you configure parameters and time)."); //basicTest
            System.out.println("3. Check how fast you are (you configure parameters)."); //howFastTest
            System.out.println("4. Its enough for today - EXIT APP.");

            choice = GetDataFromUser.getInt(4);

            if (choice == 1){
                clearScreen();
                new QuickTest();
            }
            else if (choice == 2){
                clearScreen();
                new BasicTest();
            }
            else if (choice == 3){
                clearScreen();
                new HowFastTest();
            }
            else if (choice == 4){
                clearScreen();
                System.out.println("Bye bye...");
            }
        } while (choice != EXIT);
    }
}
