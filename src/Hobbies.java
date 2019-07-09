public class Hobbies {
    private String nameOfHobby;
    private String frequencyOfHobby;
    private String adressOfHobby;

    public Hobbies(){

    }
    public Hobbies(String nameOfHobby, String frequencyOfHobby, String adressOfHobby){
        this.nameOfHobby=nameOfHobby;
        this.frequencyOfHobby=frequencyOfHobby;
        this.adressOfHobby=adressOfHobby;
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

    public String getAdressOfHobby() {
        return adressOfHobby;
    }

    public void setAdressOfHobby(String adressOfHobby) {
        this.adressOfHobby = adressOfHobby;
    }
}
