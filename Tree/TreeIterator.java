package Tree;

import Person.Person;

import java.util.Iterator;
import java.util.List;


public class TreeIterator implements Iterator<Person> {
    private int index;
    private List<Person> allPersons;

    public TreeIterator(List<Person> allPersons) {

        this.allPersons = allPersons;
    }

    @Override
    public boolean hasNext() {

        return index < allPersons.size();
    }

    @Override
    public Person next() {

        return allPersons.get(index++);
    }


}
