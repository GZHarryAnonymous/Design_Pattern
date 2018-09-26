package simple_factory_pattern;

public class Add extends Operation {
    public double getResult() {
        return super.getA() + super.getB();
    }
}
