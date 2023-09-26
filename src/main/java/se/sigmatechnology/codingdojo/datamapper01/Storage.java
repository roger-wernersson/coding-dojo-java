package se.sigmatechnology.codingdojo.datamapper01;

public class Storage {

    public void store(FieldPack fields) {
        // persist
    }

    public FieldPack load(RepoName name) {
        return new FieldPack(name);
    }
}
