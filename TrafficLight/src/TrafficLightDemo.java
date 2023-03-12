public class TrafficLightDemo {

    public static void main (String [] args){
        System.out.println("Mamy następujące wartości w typie wyliczeniowym TrafficColors:");
        for (TrafficColors t : TrafficColors.values()){
            System.out.println(t + ", prędkość zmiany światła: " +  t.getChangeTime());
        }
        System.out.println("A teraz pora na test tygnalizatora:");
        Thread test = TrafficLightSimulator.createAndStart();
        try {
            test.join();
        } catch (InterruptedException e){
            System.err.println(e);
        }
        System.out.println("KONIEC:)");

    }
}
