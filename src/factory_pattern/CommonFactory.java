package factory_pattern;

public class CommonFactory implements IFactory {
    public Worker CreateWorker() {
        return new CommonWorker();
    }
}
