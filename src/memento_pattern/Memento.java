package memento_pattern;

public class Memento {
    private String state;//Record the origiantor's state.
    public Memento(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}
