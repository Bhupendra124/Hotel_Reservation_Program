package bhupendrawork;

public class Hotel {
    public String hotelName;
    public int weekdayRate;String asString = Integer.toString(weekdayRate);
    public int weekendRate;
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

    public Hotel(String name, int weekdayRate, int weekendRate) {
        this.hotelName = name;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", weekdayRate=" + weekdayRate +
                ", weekendRate=" + weekendRate +
                '}';
    }

}