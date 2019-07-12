public class Person /*implements Comparable<Person>*/ {
    private String firstName;
    private String lastName;
    private int age;
    private Hobbies hobbies;

    public Person() {
    }

    ;

    public Person(String firstName, String lastName, int age, Hobbies hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hobbies getHobbies() {
        return hobbies;
    }

    public void setHobbies(Hobbies hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + age + " years old";
    }

    /*@Override
    public int compareTo(Person o) {
        return lastName.compareTo(o.getLastName());
    }*/
}
