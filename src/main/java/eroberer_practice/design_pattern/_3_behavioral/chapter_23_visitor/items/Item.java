package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors.Visitor;

import java.math.BigDecimal;

public interface Item {

    void printName();

    BigDecimal accept(Visitor visitor);
}
