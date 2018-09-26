package strategy_pattern;

public class Main {
    public static void main(String args[]) {
        Context c = new Context();
        c.setStrategy("A");
        c.ContextInterfece();
        c.setStrategy("B");
        c.ContextInterfece();
    }
}
