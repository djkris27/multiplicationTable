interface EverythingTest<T>{
    boolean test(T a, T b);

    default void showHelloWorld(){
        System.out.println("HELLO WORLD:)");
    }
}

public class LambdaTestDemo {
    public static void main(String[] args) {
        System.out.println("This is TESTER - application to test everything you want:)");
        EverythingTest<String> equalTest = (String a, String b) -> {
            boolean result = false;
            if (a.contains(b) && b.contains(a))
                result = true;
            return result;
        };
        System.out.println("Wyrazy okno i okno są identyczne: " + (equalTest.test("okno", "okno") ? "TAK" : "NIE"));
        System.out.println("Wyrazy okno i pralka są identyczne: " + (equalTest.test("okno", "pralka") ? "TAK" : "NIE"));

        var equalTestInfo = new ClassInfo<EverythingTest<String>>(equalTest);
        equalTestInfo.readClassInfo();
        equalTestInfo.readClassMethods();
        var stringInfo = new ClassInfo<String>("test");
        stringInfo.readClassInfo();
        stringInfo.readClassMethods();
    }
}