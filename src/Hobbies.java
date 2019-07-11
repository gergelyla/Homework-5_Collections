import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hobbies {
    private String nameOfHobby;
    private String frequencyOfHobby;
    private List<Address> address = new ArrayList<Address>();

    public Hobbies() {

    }

    public Hobbies(String nameOfHobby, String frequencyOfHobby, List address) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyOfHobby = frequencyOfHobby;
        this.address = address;
    }

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public String getFrequencyOfHobby() {
        return frequencyOfHobby;
    }

    public void setFrequencyOfHobby(String frequencyOfHobby) {
        this.frequencyOfHobby = frequencyOfHobby;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return nameOfHobby +
                ", frequency: " + frequencyOfHobby + ", address:" + address + "|";
    }
}
