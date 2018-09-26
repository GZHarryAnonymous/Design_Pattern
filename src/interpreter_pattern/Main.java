package interpreter_pattern;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        Context c = new Context();
        ArrayList<AbstractExpression>list=new ArrayList<AbstractExpression>();
        //The orders has meaning that is called language_regular_tree.
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        for(AbstractExpression exp : list) {
            exp.interpret(c);
        }
    }
}
