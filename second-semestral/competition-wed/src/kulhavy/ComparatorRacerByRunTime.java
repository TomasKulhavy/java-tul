package kulhavy;

import java.util.Comparator;

public class ComparatorRacerByRunTime implements Comparator<Racer> {

    @Override
    public int compare(Racer o1, Racer o2) {
        return Long.compare(o1.runTime(), o2.runTime());
        /*
        if (o1.runTime() > o2.runTime()) return 1;        
        else if (o1.runTime() < o2.runTime()) return -1;
        return 0;
        */
    }
    
}
