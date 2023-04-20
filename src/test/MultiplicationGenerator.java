//Version 3.0 (start typing: 2023-02-26)
//MultiplicationGenerator generate one or several Multiplications

package test;

public class MultiplicationGenerator {
    public static Multiplication generateMultiplication(int maxNumber, int maxResult){
        return new Multiplication(maxNumber, maxResult);
    }

    //this generator generate table containt differents Multiplications - without repeating.
    //TO DO: change method to catch exception, when it has no chance to no repeating.
    public static Multiplication[] generateMultiplication(int maxNumber, int maxResult, int quantity){
        Multiplication[] table = new Multiplication[quantity];
        table[0] = new Multiplication(maxNumber, maxResult);
        for (int i = 1; i < table.length; i++){
            boolean repeat = false;
            table[i] = new Multiplication(maxNumber, maxResult);
            for (int j = i-1; j >= 0; j--){
                if (table[i].isEqual(table[j]))
                    repeat = true;
            }
            if (repeat)
                i--;

        }
        return table;
    }
}
