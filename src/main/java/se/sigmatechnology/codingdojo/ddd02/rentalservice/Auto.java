package se.sigmatechnology.codingdojo.ddd02.rentalservice;

class Auto {
    public String id;
    public int size;
    private int myField;

    public Auto(int size) {
        this.size = size;
    }

    public void test(Auto other) {
        other.myField = 1;
    }
}
