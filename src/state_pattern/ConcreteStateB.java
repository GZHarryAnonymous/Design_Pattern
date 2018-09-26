package state_pattern;

public class ConcreteStateB extends State{
    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}