import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader fileIn = new BufferedReader(new FileReader("plikTestowy2.txt"))){
            System.out.println("Zawartość pliku to: ");
            String temp = null;
            do {
                temp = fileIn.readLine();
                if (temp == null)
                    break;
                System.out.println(temp);
                Scanner scan = new Scanner(temp);
                while (scan.hasNextInt()){
                    System.out.println("UWAGA! W tej linii występuje także liczba " + scan.nextInt());
                }
//
            } while (temp != null);
        } catch (Exception e){
            System.err.println("Wystąpił błąd pliku.");
            System.err.println(e);
        }

//        try (FileWriter fileW = new FileWriter("plikTestowy2.txt"); FileReader fileR = new FileReader("plikTestowy2.txt")){
//            fileW.write("Siemaneczko świecie! Wreszcie coś zapisuję do pliku, co nie jest tylko numerem;)");
//
//        } catch (Exception e){
//            System.err.println("Wystąpił jakiś błąd!");
//            System.err.println(e);
//        }

//        try (FileOutputStream file = new FileOutputStream("plikTestowy1.txt", false)) {
//            file.write(125);
//            System.out.println(file.hashCode());
//        } catch (FileNotFoundException e) {
//            System.err.println("Błąd otwarcia pliku do zapisu.");
//        } catch (IOException e) {
//            System.err.println("Błąd zapisu pliku.");
//        }
//        FileOutputStream file = null;
//        try {
//            file = new FileOutputStream("plikTestowy.txt", false);
//            file.write((char)'d');
//        } catch (FileNotFoundException e) {
//            System.err.println("Błąd otwarcia pliku do zapisu");
//        } catch (IOException e) {
//            System.err.println("Błąd zapisu pliku.");
//        }
//        finally {
//            try {
//                if (file != null)
//                    file.close();
//            } catch (IOException e) {
//                System.err.println("Błąd zamykania pliku.");
//            }
//
//        }

    }
}