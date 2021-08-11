package bhupendrawork;

import java.util.*;



public class HotelReservation {
    public static   ArrayList<Hotel> hotelList = new ArrayList<>();
    public static void main(String[] args) {
        Methods main = new Methods();
        HotelReservation hotelReservation = new HotelReservation();



        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. show hotel");
            System.out.println("2. view cheapest according to weekday");
            System.out.println("3. view cheapest according to weekend");
            System.out.println("4. sorting hotel according to rating  ");
            System.out.println("5. cheapest rate on this dated ");
            System.out.println("6. Exit");
            System.out.print("Enter Your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("List of Hotels  :");
                    main.displayMenu();
                    main.showHotel(main.hotelList);
                    break;
                case 2:
                    System.out.println("Cheapest according to weekday  ");
                    main.displayMenu();
                    main.findCheapest_According_Weekday();
                    break;
                case 3:
                    System.out.println("Cheapest according to Weekend ");
                    main.displayMenu();
                    main.findCheapest_According_Weekend();
                    break;
                case 4:
                    System.out.println("lowest rate hotel  ");
                    main.displayMenu();
                    main.sorting_Hotel_On_rating();
                    break;
                case 5:


                    System.out.println("\"11-09-2020\", \"12-09-2020\" ");
                    try {
                        main.editList();
                        System.out.println(hotelList);
                    }catch (Exception e){
                        System.out.println("Invalid");
                    }



//                    if (!HotelList.contains(current)) {
//                    return false;
//                }
//                     HotelList.remove(current);
//                      HotelList.add(editedContact);
//                    return true;
//            }
                    //day.diffDays("11-09-2020", "12-09-2020");
                   // day.calcWeekend("11-01-2020","12-09-2020");
                    System.out.println();
                   case 6:
                       System.exit(10);


            }
        }


    }}














