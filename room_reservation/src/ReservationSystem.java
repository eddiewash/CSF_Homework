import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
