package eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter;

public class OrExpression extends BaseExpression implements Expression {

    public OrExpression(String value) {
        super(value);
    }

    @Override
    public String interpret() {
        return String.valueOf(leftValue | rightValue);
    }

    @Override
    protected String getProcess() {
        return "OR";
    }
}
