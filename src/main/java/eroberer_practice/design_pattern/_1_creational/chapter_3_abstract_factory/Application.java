package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory;

import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu.CPU;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories.AbstractFactory;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories.ConcreteAMDMsiFactory;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.factories.ConcreteIntelAsusFactory;
import eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard.Motherboard;

public class Application {

    public static void main(String[] args) {
        // Asus Intel Factory
        AbstractFactory intelAsusFactory = new ConcreteIntelAsusFactory();
        CPU intelCPU = intelAsusFactory.createCPU();
        Motherboard asusMotherboard = intelAsusFactory.createMotherboard();

        System.out.println(intelCPU);
        System.out.println(asusMotherboard);

        // Msi AMD Factory
        AbstractFactory amdMsiFactory = new ConcreteAMDMsiFactory();
        CPU amdCPU = amdMsiFactory.createCPU();
        Motherboard msiMotherboard = amdMsiFactory.createMotherboard();

        System.out.println(amdCPU);
        System.out.println(msiMotherboard);
    }
}
