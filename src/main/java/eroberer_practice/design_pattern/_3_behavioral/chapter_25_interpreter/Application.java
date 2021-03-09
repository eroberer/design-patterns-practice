package eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter;

import eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter.Expression;
import eroberer_practice.design_pattern._3_behavioral.chapter_25_interpreter.interpreter.ParseExpression;

public class Application {

    public static void main(String[] args) {
        // And Expression
        String andProcess = "111 AND 101";

        Expression expression = ParseExpression.getInstance().parse(andProcess);
        var result = expression.interpret();

        System.out.println(result);

        // Or Expression
        String orProcess = "110 OR 001";

        expression = ParseExpression.getInstance().parse(orProcess);
        result = expression.interpret();

        System.out.println(result);
    }
}
