package proxy_pattern;

public class Proxy implements Subject {
    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.Request();
    }
}
