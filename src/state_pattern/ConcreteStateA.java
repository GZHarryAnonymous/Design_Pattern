package state_pattern;

public class ConcreteStateA extends State{
    @Override
    public void Handle(Context context) {//It implements the logic between related state.
        context.setState(new ConcreteStateB());//The current state decide the next state.
    }
}