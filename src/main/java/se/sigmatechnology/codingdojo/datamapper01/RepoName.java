package se.sigmatechnology.codingdojo.datamapper01;

public class RepoName {

    public static RepoName PERSON = new RepoName("person");
    private final String name;

    public RepoName(String name) {
        this.name = name;
    }
}
