package main;

import java.util.Scanner;

public class GetDataFromUser {
    //get String from user (e. g. name)
    public static String getString() {
        Scanner scan = new Scanner(System.in);
        final String GETSTRINGFROMUSERERROR = "GetStringFromUserError...";
        String text = GETSTRINGFROMUSERERROR;

        do {
            try {
                text = scan.nextLine();
            } catch (Exception e) {
                System.err.println("ERROR WHILE READING STRING FROM USER!");
                System.err.println(e.toString());System.out.println("Please write proper text and click ENTER:");
                System.out.println("Please write proper text and click ENTER:");
                scan.nextLine();
            }
        } while (text == GETSTRINGFROMUSERERROR);
        return text;
    }


    //get int from user from 0 to max
    public static int getInt(int max) {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        do {
            try {
                number = scan.nextInt();
            } catch (Exception e) {
                System.err.println("ERROR WHILE READING INT FROM USER!");
                System.err.println(e.toString());
                scan.nextLine();
            }
            if (!((number > 0) && (number <= max)))
                System.out.println("Please write proper number from 1 to " + max + " and click ENTER:");
        } while (!((number > 0) && (number <= max)));
        return number;
    }


    //get only ENTER from user;) e. g. to start test.
    public static void getENTER() {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }


}
