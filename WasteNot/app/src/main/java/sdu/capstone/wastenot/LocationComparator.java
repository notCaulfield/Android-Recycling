package sdu.capstone.wastenot;

import java.util.Comparator;

/**
 * Created by Holden on 7/31/2015.
 */
public class LocationComparator implements Comparator<Center> {


    @Override
    public int compare(Center c1, Center c2) {
        if(c1.getDistance() < c2.getDistance()) { //Closer
            return -1;
        } else if(c1.getDistance() > c2.getDistance()) { //Further
            return 1;
        } else { //Equidistant (odds are slim I expect)
            return 0;
        }
    }
}
