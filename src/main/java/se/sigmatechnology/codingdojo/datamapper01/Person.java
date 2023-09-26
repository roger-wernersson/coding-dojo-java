package se.sigmatechnology.codingdojo.datamapper01;

import java.util.List;

public class Person {
    private final Field idField;
    private final Field nameField;

    public Person(int id, String name) {
        this.idField = new Field("id", 0);
        this.nameField = new Field("name", "");
    }

    public Person(Field idField, Field nameField) {
        this.idField = new Field("id", idField.getAsInteger());
        this.nameField = new Field("name", nameField.getAsText());
    }

    public int getId() {
        return idField.getAsInteger();
    }

    public void addFieldsTo(List<Field> list) {
        list.add(idField);
        list.add(nameField);
    }
}
