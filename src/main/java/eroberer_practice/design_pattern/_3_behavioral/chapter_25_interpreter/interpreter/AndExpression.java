package eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter;

public class AndExpression extends BaseExpression implements Expression {

    public AndExpression(String value) {
        super(value);
    }

    @Override
    public String interpret() {
        return String.valueOf(leftValue & rightValue);
    }

    @Override
    protected String getProcess() {
        return "AND";
    }
}
