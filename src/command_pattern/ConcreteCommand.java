package command_pattern;

public class ConcreteCommand extends Command{
    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }
    @Override
    public void executed() {
        receiver.action();//Give the command to receiver.
    }
}
