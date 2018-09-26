package command_pattern;

public class Main {
    public static void main(String args[]) {
        Receiver r = new Receiver();
        Command c = new ConcreteCommand(r);//Map the command and receiver together.
        Invoker i = new Invoker();
        i.setCommand(c);//Invoker composites the command so as to invoke different
        //command.The super class command composite the receiver so as to send the
        //command to the related receiver.
        i.executedCommand();
    }
}
