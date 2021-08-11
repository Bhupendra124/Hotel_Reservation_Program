package bhupendrawork;

import java.util.*;



public class HotelReservation {

  public static void main(String[] args) {

      HotelReservation hotelReservation=new HotelReservation();
      Hotel hotel = new Hotel("Royal Palace", 2000, 1000);
      Hotel hotel1 = new Hotel("Taz Hotel", 3000, 2000);


      ArrayList<Hotel> hotelList = new ArrayList<>();
      hotelList.add(hotel);
      hotelList.add(hotel1);
       // HotelReservation.CheapHotel();


      Iterator itr = hotelList.iterator();
      while (itr.hasNext()) {
          System.out.println(itr.next());
      }


  }

}


