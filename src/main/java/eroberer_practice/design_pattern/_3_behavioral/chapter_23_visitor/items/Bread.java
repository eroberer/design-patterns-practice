package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors.Visitor;

import java.math.BigDecimal;

public class Bread implements Item {

    @Override
    public void printName() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public BigDecimal accept(Visitor visitor) {
        return visitor.accept(this);
    }
}
