package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu;

public class AMD extends CPU {

    @Override
    public Integer coreSize() {
        return 6;
    }

    @Override
    public String name() {
        return "AMD A6 2021";
    }
}
