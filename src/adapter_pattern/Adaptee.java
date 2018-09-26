package adapter_pattern;

public class Adaptee {
    public void specificRequest() {// It is different to target's method.
        System.out.println("The special request.");
    }
}
