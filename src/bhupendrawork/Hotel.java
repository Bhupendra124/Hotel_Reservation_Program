package bhupendrawork;

public class Hotel {
    public String hotelName;
    public int weekdayRate;String asString = Integer.toString(weekdayRate);
    public int weekendRate;
    public int rating;


    //String asString = Integer.toString(Integer.parseInt(weekdayRate));
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate() {
        this.weekdayRate = weekdayRate;
    }

    public int getWeekendRate() {
        return weekendRate;
    }

    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }
    public  int getRating(){
        return rating;
    }
    public  void setRating(){
        this.rating=rating;
    }

    public Hotel(String name, int weekdayRate, int weekendRate, int rating) {
        this.hotelName = name;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
        this.rating=rating;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRate=" + weekdayRate +
                ", weekendRate=" + weekendRate +
                "rating="+rating+
                '}';
    }

}