import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: lambert
 * Date: 7/1/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReservationSystem {

    private List<Reservation> reservationList = new ArrayList<Reservation>();

    public void listReservation(){

        Collections.sort(reservationList);

         for(Reservation reservation:reservationList){
           System.out.println(reservation);
         }
     }


    public void addReservation(Reservation reservation){

        reservationList.add(reservation);
    }




}
