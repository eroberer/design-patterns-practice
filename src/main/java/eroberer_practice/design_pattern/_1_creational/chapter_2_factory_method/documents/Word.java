package eroberer_practice.design_pattern._1_creational.chapter_2_factory_method.documents;

public class Word implements Document {

    @Override
    public String read() {
        return "Reading from Word File...";
    }
}
