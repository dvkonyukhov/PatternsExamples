package dkonyukhov.abstractFactory;

class LuxCarFactory extends CarFactory {
    public Car createCar() {
        return new LuxCar();
    }

}
