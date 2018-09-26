package bridge_pattern;

public class RefinedAbstractionA extends Abstraction{
    @Override
    public void Operation() {
        System.out.println("The current class is A.");
        implementor.Operation();
    }
}
