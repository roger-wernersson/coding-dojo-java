package se.sigmatechnology.codingdojo.ddd02;

import java.util.List;

// hard coded
public class UnderConstruction {

    public boolean test(Car car) {
        return false;
    }
}

// parameterized
public class FastCar {
    public FastCar(Engine.Speed minimumMaxSpeed) {
    }

    public boolean test(Car car) {
        return false;
    }
}

// composite
public class CustomerOrder {
    private List<Detail> list = null;

    public void addDetail(Detail detail) {
        list.add(detail);
    }

    public boolean test(Car car) {
        for (Detail detail : list) {
            if (!detail.test(car)) return false;
        }
        return true;
    }
}
