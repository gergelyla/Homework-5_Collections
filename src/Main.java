import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Person p1 = new Employed("Ion", "Creanga", 31);
        //Person p2 = new Unemployed("Ion", "Creanga", 22);
        //Person p3 = new Student("Raul", "Rosu", 30);
        Address address1 = new Address("Cluj-Napoca", "Piata Unirii", 10);
        Address address2 = new Address("Cavnic", "statiune montana", 3);
        Address address3 = new Address("Satu-Mare", "str. Eroilor", 9);
        Address address4 = new Address("Jibou", "str. Principala", 35);
        Address address5 = new Address("Brassov", "str. Brazilor", 23);
        Address address6 = new Address("Zalau", "str. Fabricii", 2);
        List<Address> skatingAdrress = new ArrayList<Address>();
        skatingAdrress.add(address2);
        skatingAdrress.add(address5);
        List<Address> skiingAddress = new ArrayList<Address>();
        skiingAddress.add(address2);
        skiingAddress.add(address6);
        List<Address> joggingAddress = new ArrayList<Address>();
        joggingAddress.add(address3);
        joggingAddress.add(address4);
        Hobbies hobby1 = new Hobbies("Skating", "in winters", skatingAdrress);
        Hobbies hobby2 = new Hobbies("Skiing", "in winters", skiingAddress);
        Hobbies hobby3 = new Hobbies("Jogging", "three times a week", joggingAddress);
        Person p1 = new Employed("Ion", "Creanga", 31, hobby1);
        Person p2 = new Unemployed("Ion", "Creanga", 22, hobby2);
        Person p3 = new Student("Raul", "Rosu", 30, hobby3);

        Set<Person> person1 = new TreeSet<>(new PersonLastNameComparator());                                                //Sortare pe baza de Nume de familie (in caz de nume de familie
        System.out.println(person1);                                                                                        //asemanator apare doar prima persoana cu acel nume)

        person1.add(p3);
        person1.add(p1);
        person1.add(p2);

        System.out.println(person1);


        Set<Person> person2 = new TreeSet<>(new PersonAgeComparator());                                                   //Sortare pe baza de Varsta (in caz de varsta asemanatoare
        System.out.println(person2);                                                                                      //apare doar prima persoana cu acea varsta)

        person2.add(p3);
        person2.add(p2);
        person2.add(p1);

        System.out.println(person2);


        Set<Person> person3 = new TreeSet<>(new PersonLastNameComparator().thenComparing(new PersonAgeComparator()));      //Sortare pe baza de Nume de familie si Varsta (apar toate persoanele
        System.out.println(person3);                                                                                       //daca macar una din criterii difera)

        person3.add(p1);
        person3.add(p2);
        person3.add(p3);

        System.out.println(person3);


        Map<Person, Hobbies> personsHobbies = new HashMap<Person, Hobbies>();                                                            //HashMap cu Persoane, Hobbyuri si locatiile posibile
        personsHobbies.put(p1, hobby1);
        personsHobbies.put(p2, hobby2);
        personsHobbies.put(p3, hobby3);

        System.out.println(" ");
        for (Person person : personsHobbies.keySet()) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " ("+person.getAge()+" years old) has the following hobby/s: " + personsHobbies.get(person));
        }
    }
}
