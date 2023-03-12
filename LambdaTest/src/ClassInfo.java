import java.lang.reflect.Method;

public class ClassInfo<T> {
    T myClass;
    ClassInfo(T myClassT){
        myClass = myClassT;
    }

    public void readClassInfo(){
        System.out.println(myClass.getClass().getCanonicalName());
        System.out.println("Dziedziczy po: " + myClass.getClass().getSuperclass());
    }

    public void readClassMethods(){
        System.out.println("Metody w klasie " + myClass.getClass().getName() + ":");
        for (Method m : myClass.getClass().getDeclaredMethods()){
            System.out.println(m.getName());
        }
    }
}
