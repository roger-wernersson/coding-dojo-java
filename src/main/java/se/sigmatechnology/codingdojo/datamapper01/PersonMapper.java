package se.sigmatechnology.codingdojo.datamapper01;

public class PersonMapper {

    private final PersonMap map = new PersonMap();

    public Person find(int id) {
        Person old = map.find(id);
        if (old != null) return old;
        return loadPerson(id);
    }

    private Person loadPerson(int id) {
        // load from storage
        return new Person(
                new Field("id", 0),
                new Field("name", "Batman")
        );
    }

    public void update(Person person) {

//        person.addFieldsTo(fields);
        // save to storage
    }
}
