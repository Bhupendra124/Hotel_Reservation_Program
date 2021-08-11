package bhupendrawork;


import java.util.*;
import java.util.stream.Collectors;

public class Main {


  public static   ArrayList<Hotel> hotelList = new ArrayList<>();
    public static Map<String, Hotel> nameHashMap = new HashMap<String, Hotel>();
   // public static Map<String, Contacts> weekendHashMap = new HashMap<String, Contacts>();

    void displayMenu() {
        System.out.println("Welcome to Hotel Reservation System ");
        System.out.println("1.Display hotel ");
        System.out.println();
    }

    //show hotel method
    public void showHotel(ArrayList<Hotel> hotel) {

        Hotel hotel1 = new Hotel("Royal Palace", 2000, 1000);
        Hotel hotel2 = new Hotel("Taz Hotel", 3000, 2000);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        //nameHashMap.put(hotel.getWeekdayRate(), hotel);
        Iterator itr = hotelList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void findCheapest() {
        try {
           ArrayList<Hotel> sortedList = (ArrayList<Hotel>) hotelList.stream()

                   .sorted(Comparator.comparingInt(Hotel::getWeekdayRate))
                   .collect(Collectors.toList());
               sortedList.forEach(System.out::println);
       }catch (Exception e){

         throw null ;
       }
        System.out.println(hotelList.get(0));

    }
}