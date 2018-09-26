package interpreter_pattern;

public class TerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("Terminal Expression");
    }
}
