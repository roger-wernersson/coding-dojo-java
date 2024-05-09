package se.sigmatechnology.codingdojo.ddd02;

public class CarFactory {

    Car createCar(int kph) {
        Engine.Speed maxSpeed = new Engine.Speed(kph);
        Engine engine = new Engine(maxSpeed);
        return new Car(engine);
    }

    Car createCar() {
        return new Car(Engine.NO_ENGINE);
    }
}
