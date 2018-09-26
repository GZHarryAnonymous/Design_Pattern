package simple_factory_pattern;

public abstract class Operation {
    protected double A;
    protected double B;

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public abstract double getResult();
}
