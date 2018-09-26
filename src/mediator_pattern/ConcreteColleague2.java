package mediator_pattern;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message, this);
    }
    public void notify(String message) {
        System.out.println("The colleague2 has the message:"+message);
    }
}
