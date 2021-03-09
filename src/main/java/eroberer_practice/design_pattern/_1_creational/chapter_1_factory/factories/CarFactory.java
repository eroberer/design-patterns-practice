package eroberer_practice.design_pattern._1_creational.chapter_1_factory.factories;

import eroberer_practice.design_pattern._1_creational.chapter_1_factory.cars.Car;

import java.util.ArrayList;
import java.util.List;

public abstract class CarFactory {

    private List<Car> carList = new ArrayList<>();

    public CarFactory() {
        createCar();
    }

    public abstract void createCar();

    public List<Car> getCarList() {
        return this.carList;
    }
}
