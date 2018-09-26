package factory_pattern;

public class SuperFactory implements IFactory {
    public Worker CreateWorker() {
        return new SuperWorker();
    }
}
