public class Address {
    private String cityName;
    private String streetName;
    private int streetNumber;

    public Address(String cityName, String streetName, int streetNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return cityName + ", " + streetName + ", " + streetNumber;
    }
}
