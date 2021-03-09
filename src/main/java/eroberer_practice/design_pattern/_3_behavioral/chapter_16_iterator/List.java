package eroberer_practice.design_pattern._3_behavioral.chapter_16_iterator;

public interface List {

    Iterator getIterator();

    void add(String value);
}
