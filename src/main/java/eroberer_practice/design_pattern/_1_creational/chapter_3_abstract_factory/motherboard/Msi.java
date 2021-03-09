package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard;

public class Msi extends Motherboard {

    @Override
    public Integer bridgeSize() {
        return 2;
    }

    @Override
    public String name() {
        return "Msi Motherboard 2021";
    }
}
