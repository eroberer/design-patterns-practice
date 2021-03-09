package eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter;

public class ParseExpression {

    private static ParseExpression instance = new ParseExpression();

    private ParseExpression() {
    }

    public static ParseExpression getInstance() {
        return instance;
    }

    public Expression parse(String value) {
        if (value.contains("AND")) {
            return new AndExpression(value);
        } else {
            return new OrExpression(value);
        }
    }

}
