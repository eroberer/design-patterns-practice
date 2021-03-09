package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.cpu;

public abstract class CPU {

    public abstract Integer coreSize();

    public abstract String name();

    @Override
    public String toString() {
        return "CPU{coreSize=" + coreSize() + "; name=" + name() + "}";
    }
}
