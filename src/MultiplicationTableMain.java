////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Version 2.0

/*

//na końcu imię dziecka, działania i wynik powinny być zapisywane do pliku.

import java.util.*;

//package IdeaProjects.ultiplicationTable.src;
class IncorrectRepeatException extends Exception{}
class IncorrectMultiplicationException extends Exception{}

public class MultiplicationTableMain {
    public static void main(String[] args) {
        System.out.println("Witaj w teście tabliczki mnożenia - wersja programu: 2. Aby rozpocząć poproszę o podanie kilku ważnych danych:");
        System.out.println("Podaj swoje imię: ");
        Scanner scan = new Scanner(System.in);
        int repeat = 0, maxMultiplication = 0;
        String name = scan.nextLine();
        System.out.println("Witaj " + name + " :)");

        System.out.println("Podaj ilość powtórzeń: ");

        while(true) {
            try {
                repeat = scan.nextInt();
                if ((repeat < 1) || (repeat > 100))
                    throw new IncorrectRepeatException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawna ilość powtórzeń - podaj poprawną ilość powtórzeń: ");
                scan.nextLine();
            } catch (IncorrectRepeatException e){
                System.out.println("Wartość powtórzeń jest nieporawna. Proszę podać liczbę powtórzeń większą od 0 i mniejszą niż 100.");
            }
        }

        System.out.println("Podaj maksymalny iloczyn (maksymalnie 100): ");
        while(true) {
            try {
                maxMultiplication = scan.nextInt();
                if ((maxMultiplication < 10) || (maxMultiplication > 1000) )
                    throw new IncorrectMultiplicationException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny maksymalny iloraz - podaj poprawny maksymalny iloraz w zakresie 10-1000: ");
                scan.nextLine();
            } catch (IncorrectMultiplicationException e) {
                System.out.println("Niepoprawny maksymalny iloraz - podaj poprawny maksymalny iloraz w zakresie 10-1000: ");
                scan.nextLine();
            }
        }

        MultiplicationTest test = new MultiplicationTest(name, repeat, maxMultiplication);
        System.out.println("Witaj: " + test.getName() + " :) Wybrana przez Ciebie liczba powtórzeń to: " + test.getRepeat() + ", a maksymalny iloraz: " + test.getMaxMultiplicationAnswer());
        System.out.println("Zaczynamy test!");
        test.run();


//        if (args.length<2) {
//            System.out.println("Użycie: java tabliczkaMnozenia liczba_maksymalna liczba_prób");
//            System.exit(0);
//        }
//        Scanner scan1 = new Scanner(args[0]);
//        int repeat = scan1.nextInt();
//        Scanner scan2 = new Scanner(args[1]);
//        int maxMultiplicationAnswer = scan2.nextInt();
//        scan1.close();
//        scan2.close();
    }
}

 */