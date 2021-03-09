package eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter;

public abstract class BaseExpression {

    protected Integer leftValue;
    protected Integer rightValue;

    public BaseExpression(String value) {
        String[] values = value.split(getProcess());
        this.leftValue = Integer.valueOf(values[0].trim());
        this.rightValue = Integer.valueOf(values[1].trim());
    }

    protected abstract String getProcess();
}
