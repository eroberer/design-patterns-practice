package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Bread;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.CompoundItem;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Item;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Milk;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors.TaxCalculatorVisitor;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors.Visitor;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Visitor visitor = new TaxCalculatorVisitor();

        Item milk = new Milk();
        milk.printName();
        BigDecimal milkTotalAmount = milk.accept(visitor);
        System.out.println("Milk Total Amount:" + milkTotalAmount);

        Item bread = new Bread();
        bread.printName();
        BigDecimal breadTotalAmount = bread.accept(visitor);
        System.out.println("Bread Total Amount:" + breadTotalAmount);

        CompoundItem compoundItem = new CompoundItem();
        compoundItem.addItem(new Bread()).addItem(new Bread()).addItem(new Milk());
        compoundItem.printName();
        BigDecimal compoundItemTotalAmount = compoundItem.accept(visitor);
        System.out.println("Compound Total Amount:" + compoundItemTotalAmount);
    }
}
