public class TrafficLightSimulator implements Runnable{
    public TrafficColors tc;
    public boolean stop;
    public boolean change;
    private static int changes = 10;

    public TrafficLightSimulator(){
        tc = TrafficColors.RED;
        stop = false;
        change = false;
    }

    public TrafficLightSimulator(TrafficColors setTC){
        tc = setTC;
        stop = false;
        change = false;
    }

    @Override
    public void run() {
        while (!stop){
            try {
                Thread.sleep(tc.getChangeTime());
            } catch (InterruptedException e){
                System.err.println(e);
            }
            changeColor();
        }
    }

    public synchronized void changeColor(){
        if (changes > 0){
            tc = tc.whatNext();
            System.out.println("Kolor: " + tc);
            changes--;
            if (changes <= 0)
                cancel();
        }
    }


    public static Thread createAndStart(){
        TrafficLightSimulator tls = new TrafficLightSimulator();
        Thread th = new Thread(tls);
        th.start();
        return th;
    }

    synchronized void cancel(){
        stop = true;
    }
}
