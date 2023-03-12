public enum TrafficColors {
    RED(2000), ORANGE_RED(500), GREEN(3000), ORANGE(1000);

    private int change_time;

    TrafficColors(int time){
        change_time = time;
    }

    public int getChangeTime(){
        return change_time;
    }

    public TrafficColors whatNext(){
        switch (this){
            case RED:
                return ORANGE_RED;
//                break;
            case ORANGE_RED:
                return GREEN;
//                break;
            case GREEN:
                return ORANGE;
//                break;
            case ORANGE:
                return RED;
//                break;
            default: //Without this section compiler not acces - why?
                return RED;
        }
    }
}
