package adapter_pattern;

public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {//It is the same comparing with target's interface now.
        adaptee.specificRequest();
    }
}
