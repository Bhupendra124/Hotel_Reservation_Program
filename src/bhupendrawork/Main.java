package bhupendrawork;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


  public static   ArrayList<Hotel> hotelList = new ArrayList<>();
    public static Map<String, Hotel> nameHashMap = new HashMap<String, Hotel>();
   // public static Map<String, Contacts> weekendHashMap = new HashMap<String, Contacts>();

    void displayMenu() {
        System.out.println("------------Welcome to Hotel Reservation System-------------------- ");

    }

    //show hotel method
    public void showHotel(ArrayList<Hotel> hotel) {

        Hotel hotel1 = new Hotel("Royal Palace", 2000, 1000,3);
        Hotel hotel2 = new Hotel("Taz Hotel", 3000, 2000,4);
        Hotel hotel3=new Hotel("BridgeWood",2000,4000,5);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
        //nameHashMap.put(hotel.getWeekdayRate(), hotel);
        Iterator itr = hotelList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
//sorting hotel price according weekday rate
    public void findCheapest_According_Weekday() {
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
//method for sorting hotel on basis of weekend price/rate
    public  void  findCheapest_According_Weekend(){

        ArrayList<Hotel> sortedList = (ArrayList<Hotel>) hotelList.stream()

                .sorted(Comparator.comparingInt(Hotel::getWeekendRate))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println(hotelList.get(0));
    }




    }