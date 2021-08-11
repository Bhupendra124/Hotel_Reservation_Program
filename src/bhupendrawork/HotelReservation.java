package bhupendrawork;

import java.util.*;



public class HotelReservation {

    public static void main(String[] args) {
        Main main = new Main();
        HotelReservation hotelReservation = new HotelReservation();



        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. show hotel");
            System.out.println("2. view cheapest according to weekday");
            System.out.println("3. view cheapest according to weekend");
            System.out.println("4. sorting hotel according to rating  ");
            System.out.println("5. ");
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


            }
        }


    }

}



