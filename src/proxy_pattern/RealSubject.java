package proxy_pattern;

public class RealSubject implements Subject {
    @Override
    public void Request() {
        System.out.println("This is the realRequest!");
    }
}
