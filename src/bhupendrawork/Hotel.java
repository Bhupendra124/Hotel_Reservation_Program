package bhupendrawork;

public class Hotel {
    public String hotelName;
    public int weekdayRate;
    public int weekendRate;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekdayRate() {
        return weekdayRate;
    }

    public void setWeekdayRate(int weekdayRate) {
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