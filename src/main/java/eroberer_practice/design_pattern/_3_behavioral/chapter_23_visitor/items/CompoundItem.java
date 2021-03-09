package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors.Visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompoundItem implements Item {

    private List<Item> items = new ArrayList<>();

    @Override
    public void printName() {
        System.out.println("-- Compound Items --");
        for (Item item : items) {
            System.out.println(item.getClass().getSimpleName());
        }
        System.out.println("-- /Compound Items --");
    }

    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.accept(this);
    }

    public CompoundItem addItem(Item item) {
        items.add(item);
        return this;
    }

    public List<Item> getItems() {
        return items;
    }
}
