package se.sigmatechnology.codingdojo.ddd02;

public class Car {
    public int id;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }
}
