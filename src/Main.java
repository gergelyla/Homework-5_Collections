import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        Person p1=new Employed("Ion","Creanga",31);
        Person p2=new Unemployed("Ioana","Popescu",22);
        Person p3=new Student("Raul","Rosu",12);

        Set<Person> person=new TreeSet<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);

        System.out.println(person);



    }
}
