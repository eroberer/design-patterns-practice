package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories;

import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.AMD;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.CPU;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Motherboard;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Msi;

public class ConcreteAMDMsiFactory implements AbstractFactory {

    @Override
    public CPU createCPU() {
        return new AMD();
    }

    @Override
    public Motherboard createMotherboard() {
        return new Msi();
    }
}
