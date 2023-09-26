package se.sigmatechnology.codingdojo.datamapper01;

public class Person {
    private final Field idField;
    private final Field nameField;

    public Person(int id, String name) {
        this.idField = new Field("id", 0);
        this.nameField = new Field("name", "");
    }

    public Person(FieldPack fields) {
        this.idField = fields.getByName("id");
        this.nameField = fields.getByName("name");
    }

    public int getId() {
        return idField.getAsInteger();
    }

    public void addFieldsTo(FieldPack fields) {
        fields.add(idField);
        fields.add(nameField);
    }
}
