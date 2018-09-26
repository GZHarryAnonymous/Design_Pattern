package bridge_pattern;

public class Abstraction {
    protected Implementor implementor;
    public void SetImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
    public void Operation() {
        implementor.Operation();
    }
}
