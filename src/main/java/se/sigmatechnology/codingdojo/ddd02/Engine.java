package se.sigmatechnology.codingdojo.ddd02;

public class Engine {
    public static Engine NO_ENGINE = new Engine(Speed.ZERO);
    private Speed maxSpeed;
    private Temperature temperature = Temperature.ofCelsius(20);

    public Engine(Speed maxSpeed) {
        this.maxSpeed = maxSpeed;

        int celsius = 10;
        int kelvin = 10;
        int farenheit = farenheitFromCelsius(celsius);
    }

    private int farenheitFromCelsius(int celsius) {
        return 0;
    }

    public static class Speed {
        public static Speed ZERO = new Speed(0);
        public static Speed INVALID = new Speed(-1);
        private  int kph;

        public Speed(int kph) {
            assert kph >= 0;
            this.kph = kph;
        }

        // factory method
        public static Speed of(int kph) {
            if (kph < 0) return INVALID;
            return new Speed(kph);
        }
    }

    public static class Temperature {
        private int kelvin;

        public int inFahrenheit() {
            return fFromK(kelvin);
        }

        private int fFromK(int kelvin) {
            return 0;
        }

        public int inCelsius() {
            return  0;
        }

        public int inKelvin() {
            return  0;
        }

        static Temperature ofCelsius(int c) {
            return null;
        }

        static Temperature ofKelvin(int k) {
            return null;
        }

        static Temperature ofFahrenheit(int f) {
            return null;
        }
    }
}
