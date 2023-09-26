package se.sigmatechnology.codingdojo.datamapper01;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {

    private final Map<Integer, Person> map = new HashMap<>();

    public Person find(int id) {
        return map.get(id);
    }

    public void add(Person person) {
        map.put(person.getId(), person);
    }
}
