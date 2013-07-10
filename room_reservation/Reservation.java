import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/1/13
 * Time: 7:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Reservation implements Comparable {

    int hourOfDay;
    String name;
    int numberOfPeople;


    public Reservation(int hourOfDay, String name, int numberOfPeople){

        this.hourOfDay = hourOfDay;
        this.name = name;
        this.numberOfPeople = numberOfPeople;

    }

    @Override
    public String toString() {

        return name +  " made a walk-in reservation at:" +hourOfDay + " for " + numberOfPeople;
    }

    @Override
    public int compareTo(Object o) {
        Reservation other = (Reservation)o;
        return (this.hourOfDay - other.hourOfDay);

    }
}
