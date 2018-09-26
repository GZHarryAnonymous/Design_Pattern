package bridge_pattern;

public class Main {
    public static void main(String args[]) {
        Abstraction ab =new RefinedAbstractionA();
        //Abstraction ab =new RefinedAbstractionB();
        ab.SetImplementor(new ConcreteImplementorA());
        ab.Operation();
        ab.SetImplementor(new ConcreteImplementorB());
        ab.Operation();
    }
}
/*
 * Composition is stronger than Aggregation.
 * Swallow composite Wing.
 * GooseGroup aggregate Swallow.
 * The different is life cycle.
 * The composition at the level of abstraction decouple the system
 * and makes it more flexible.
 */