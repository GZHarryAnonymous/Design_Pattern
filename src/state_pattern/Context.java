package state_pattern;

public class Context {
    private State state;
    public Context(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
        System.out.println("The current state is " + this.state.getClass().getName());
    }
    public void request() {
        state.Handle(this);//The current class object as the parameter communicate
        //with state.The dynamic binding instead of "switch-case".
    }
}
