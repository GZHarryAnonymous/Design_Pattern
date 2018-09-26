package simple_factory_pattern;

public class Minus extends Operation {
    public double getResult() {
        return super.getA() - super.getB();
    }
}
