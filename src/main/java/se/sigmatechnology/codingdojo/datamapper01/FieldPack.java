package se.sigmatechnology.codingdojo.datamapper01;

public class FieldPack {

    private final RepoName name;

    public FieldPack(RepoName name) {
        this.name = name;
    }

    public Field getByName(String name) {
        return null;
    }

    enum ValueType {
        Integer, Text, Boolean;
    }

    void add(Field list) {
        // add field
    }
}
