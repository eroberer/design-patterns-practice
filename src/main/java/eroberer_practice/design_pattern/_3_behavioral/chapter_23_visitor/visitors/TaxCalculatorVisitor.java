package eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.visitors;

import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Bread;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.CompoundItem;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Item;
import eroberer_practice.design_pattern._3_behavioral.chapter_23_visitor.items.Milk;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculatorVisitor implements Visitor {

    @Override
    public BigDecimal accept(Milk milk) {
        BigDecimal milkAmount = new BigDecimal("1.35");
        BigDecimal milkTaxAmount = milkAmount.multiply(new BigDecimal("0.22"));
        return milkAmount.add(milkTaxAmount).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal accept(Bread bread) {
        BigDecimal breadAmount = new BigDecimal("0.75");
        BigDecimal breadTaxAmount = breadAmount.multiply(new BigDecimal("0.1"));
        return breadAmount.add(breadTaxAmount).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal accept(CompoundItem compoundItem) {
        BigDecimal compoundItemTotalAmount = BigDecimal.ZERO;


        for (Item item : compoundItem.getItems()) {
            compoundItemTotalAmount = compoundItemTotalAmount.add(item.accept(this));
        }

        return compoundItemTotalAmount.setScale(2, RoundingMode.HALF_UP);
    }
}
