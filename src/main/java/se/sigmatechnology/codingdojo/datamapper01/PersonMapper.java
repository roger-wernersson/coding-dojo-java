package se.sigmatechnology.codingdojo.datamapper01;

public class PersonMapper {

    private final PersonMap map = new PersonMap();
    private final Storage storage;

    public PersonMapper(Storage storage) {
        this.storage = storage;
    }

    public Person find(int id) {
        Person old = map.find(id);
        if (old != null) return old;
        return loadPerson(id);
    }

    private Person loadPerson(int id) {
        FieldPack fields = storage.load(RepoName.PERSON);
        // load from storage
        return new Person(fields);
    }

    public void update(Person person) {

        FieldPack fields = new FieldPack(RepoName.PERSON);
        person.addFieldsTo(fields);
        storage.store(fields);
    }
}
