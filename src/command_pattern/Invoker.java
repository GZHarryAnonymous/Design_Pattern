package command_pattern;

public class Invoker {
    private Command command;//It can gather a set of commands to execute together
    //through using ArrayList<T>.
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executedCommand() {
        command.executed();
    }
}
