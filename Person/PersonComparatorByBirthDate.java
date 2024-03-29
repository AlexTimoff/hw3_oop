package Person;

import Person.Person;

import java.util.Comparator;


public class PersonComparatorByBirthDate implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
