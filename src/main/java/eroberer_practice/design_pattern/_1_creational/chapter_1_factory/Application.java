package eroberer_practice.design_pattern._1_creational.chapter_1_factory;

import eroberer_practice.design_pattern._1_creational.chapter_1_factory.cars.Car;
import eroberer_practice.design_pattern._1_creational.chapter_1_factory.factories.AudiFactory;
import eroberer_practice.design_pattern._1_creational.chapter_1_factory.factories.CarFactory;

public class Application {

    public static void main(String[] args) {
        CarFactory carFactory = new AudiFactory();

        for (Car car : carFactory.getCarList()) {
            System.out.println(car);
        }
    }
}
