package se.sigmatechnology.codingdojo.ddd02.usecases;

import se.sigmatechnology.codingdojo.ddd02.Car;
import se.sigmatechnology.codingdojo.ddd02.rentalservice.RentalService;

public class OfferCarForRenting {
    public RentalService rental;

    public void execute(Car car) {
        rental.sendOffer(car);
    }
}
