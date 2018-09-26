package bridge_pattern;

public class RefinedAbstractionB extends Abstraction{
    @Override
    public void Operation() {
        System.out.println("The current class is B.");
        implementor.Operation();
    }
}
