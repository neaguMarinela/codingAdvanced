package serializationAndDeserialization;

public class Address {

    private String city;

    private String country;

    private String houseNumber;

    private String lga;

    private String state;

    private String streetName;

    private String village;

    private String ward;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }


    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", country=" + country
                + ", houseNumber=" + houseNumber + ", lga=" + lga + ", state="
                + state + ", streetName=" + streetName + ", village=" + village
                + ", ward=" + ward + "]";
    }
}
