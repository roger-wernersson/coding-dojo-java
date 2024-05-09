package se.sigmatechnology.codingdojo.ddd02.usecases;

import se.sigmatechnology.codingdojo.ddd02.Car;
import se.sigmatechnology.codingdojo.ddd02.r2operational.CustomerSpecification;

import java.util.List;

public class FindCar {

    public FindCar(String input) {
        // outside
        CustomerSpecification spec = specFromInput(input);
        // inside
    }

    // the barricade
    private CustomerSpecification specFromInput(String input) {
        return null;
    }

    public ListOfCars execute(ListOfCars allCars, CustomerSpecification spec) {
        assert spec != null;
        assert allCars != null;
        assert allCars.list.size() > 0;

        ListOfCars myCars = allCars.filterBy(spec);

        return myCars;
    }
}


// Pre-conditions
// Post-conditions
// Invariant
