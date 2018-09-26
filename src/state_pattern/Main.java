package state_pattern;

public class Main {
    public static void main(String args[]) {
        Context c =  new Context(new ConcreteStateA());       
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
/*
 * The current object's behavior is related to its state during the runtime.
 */