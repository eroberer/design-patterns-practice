package eroberer_practice.design_pattern._1_creational.chapter_1_factory.factories;

import eroberer_practice.design_pattern._1_creational.chapter_1_factory.cars.AudiA4;
import eroberer_practice.design_pattern._1_creational.chapter_1_factory.cars.AudiA5;

public class AudiFactory extends CarFactory {

    @Override
    public void createCar() {
        getCarList().add(new AudiA4());
        getCarList().add(new AudiA5());
    }
}
