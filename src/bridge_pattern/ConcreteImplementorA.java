package bridge_pattern;

public class ConcreteImplementorA extends Implementor{
    @Override
    public void Operation() {
        System.out.println("THe concrete method A is executing.");
    }
}
