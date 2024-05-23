package se.sigmatechnology.codingdojo.ddd02.rentalservice;

import se.sigmatechnology.codingdojo.ddd02.Car;

public class RentalService {
    public AutoFacade facade;
    public AutoFromCarAdapter adapter;

    public  void sendOffer(Car car) {

        Auto auto = adapter.autoFromCar(car);

        facade.lookAtThisAuto(auto);
    }
}
