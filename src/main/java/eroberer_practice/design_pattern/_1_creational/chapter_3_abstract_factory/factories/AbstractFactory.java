package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories;

import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.CPU;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Motherboard;

public interface AbstractFactory {

    CPU createCPU();

    Motherboard createMotherboard();
}
