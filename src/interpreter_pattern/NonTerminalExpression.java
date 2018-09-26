package interpreter_pattern;

public class NonTerminalExpression extends AbstractExpression{
    @Override
    public void interpret(Context context) {
        System.out.println("NonTerminal Expression");
    }
}
