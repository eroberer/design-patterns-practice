package eroberer_practice.design_pattern._1_creational.chapter_3_abstract_factory.motherboard;

public abstract class Motherboard {

    public abstract Integer bridgeSize();

    public abstract String name();

    @Override
    public String toString() {
        return "Motherboard{getBridgeSize=" + bridgeSize() + "; name=" + name() + "}";
    }
}
