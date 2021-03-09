package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories;

import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.CPU;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.Intel;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Asus;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Motherboard;

public class ConcreteIntelAsusFactory implements AbstractFactory {

    @Override
    public CPU createCPU() {
        return new Intel();
    }

    @Override
    public Motherboard createMotherboard() {
        return new Asus();
    }
}
