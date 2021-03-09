package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Bread;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.CompoundItem;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Item;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Milk;

import java.math.BigDecimal;

public interface Visitor {

    BigDecimal accept(Milk milk);

    BigDecimal accept(Bread bread);

    BigDecimal accept(CompoundItem compoundItem);
}
