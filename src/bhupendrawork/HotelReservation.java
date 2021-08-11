package bhupendrawork;

import java.util.*;



public class HotelReservation {

    public static void main(String[] args) {
        Main main = new Main();
        HotelReservation hotelReservation = new HotelReservation();



        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. show hotel");
            System.out.println("2. search for cheapest");
            System.out.println("3. Delete Address Book");
            System.out.println("4. Search Contact Data");
            System.out.println("5. View Contact Data");
            System.out.println("6. Exit");
            System.out.print("Enter Your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    main.displayMenu();
                    main.showHotel(main.hotelList);
                    break;
                case 2:
                    main.displayMenu();
                    main.findCheapest();
                    break;


            }
        }


    }

}



