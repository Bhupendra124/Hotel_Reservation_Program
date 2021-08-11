package bhupendrawork;
import java.util.*;
import java.util.stream.Collectors;

public class Methods {


  public static   ArrayList<Hotel> hotelList = new ArrayList<>();
    public static Map<String, Hotel> nameHashMap = new HashMap<String, Hotel>();
    //public static Map<String, Hotel> weekend = new HashMap<String, Contacts>();
               static Day day=new Day();

    public static Map<String, Hotel> getNameHashMap() {
        return nameHashMap;
    }

    void displayMenu() {
        System.out.println("------------Welcome to Hotel Reservation System-------------------- ");

    }

    //show hotel method
    public void showHotel(ArrayList<Hotel> hotel) {

        Hotel hotel1 = new Hotel("Royal Palace", 2000, 1000,3);
        Hotel hotel2 = new Hotel("Taz Hotel", 3000, 2000,4);
        Hotel hotel3=  new Hotel("BridgeWood",2000,4000,5);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);
//        nameHashMap.put(hotel1.hotelName, hotelList.get(0));
//        System.out.println(nameHashMap);

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
        System.out.println("Best cheap hotel offer on this weekday ___________");
        System.out.println(hotelList.get(0));
        return ;

    }
//method for sorting hotel on basis of weekend price/rate
    public  void  findCheapest_According_Weekend(){

        ArrayList<Hotel> sortedList = (ArrayList<Hotel>) hotelList.stream()

                .sorted(Comparator.comparingInt(Hotel::getWeekendRate))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);
        System.out.println("Weekend offer best cheapHotel_______");
        System.out.println(hotelList.get(0));
    }
    //sorting on the basis of rating given by user
      public  void sorting_Hotel_On_rating(){
    ArrayList<Hotel> sortedList = (ArrayList<Hotel>) hotelList.stream()

            .sorted(Comparator.comparingInt(Hotel::getRating))
            .collect(Collectors.toList());
             sortedList.forEach(System.out::println);
          System.out.println("Max Rating__________ ");
             System.out.println(hotelList.get(0));
}

    //sorting by given date
    public void editList() {


        if (day.equals(day.diffDays("11-09-2020", "12-09-2020"))) ;{
        System.out.println("Hotel rate on this day  reduce to ");
        hotelList.remove(hotelList);
        List<Hotel> hotel4= (List<Hotel>) new Hotel("Royal palace ",1000,1000,3);
        hotelList.add((Hotel) hotel4);
            System.out.println(hotelList);
    }

    }

    }

