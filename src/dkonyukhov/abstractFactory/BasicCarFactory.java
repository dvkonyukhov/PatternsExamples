package dkonyukhov.abstractFactory;

class BasicCarFactory extends CarFactory {
    public Car createCar() {
        return new BasicCar();
    }

}
