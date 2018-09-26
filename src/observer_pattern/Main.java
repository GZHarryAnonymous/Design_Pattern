package observer_pattern;

public class Main {
    public static void main(String args[]) {
        ConcreteSubject s = new ConcreteSubject();
        s.attach(new ConcreteObserver(s,"X"));
        s.attach(new ConcreteObserver(s,"Y"));
        s.attach(new ConcreteObserver(s,"Z"));
        s.setSubjectState("ABC");
        s.Notify();
        /***This is used for processing the "OldConcreteObserver."***/
        s.addEvent(new OldConcreteObserver(s,"W"), "oldUpdate", "happy");
        s.NotifyAll();
    }
}
/*
 * The observer_pattern is also called Publish/Subscribe pattern,which is also
 * known as notifier/observer.
 */