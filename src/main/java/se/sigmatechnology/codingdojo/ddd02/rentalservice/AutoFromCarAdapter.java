package se.sigmatechnology.codingdojo.ddd02.rentalservice;

import se.sigmatechnology.codingdojo.ddd02.Car;

class AutoFromCarAdapter {
    public SizeTranslator translator;

    public Auto autoFromCar(Car car) {
        int size = translator.sizeFromCar(car);
        return new Auto(size);
    }
}
