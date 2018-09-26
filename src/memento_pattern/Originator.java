package memento_pattern;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public Memento createMemento() {//Create the memo.
        return new Memento(state);
    }
    
    public void setMemento(Memento memento) {//Set the memo.
        state = memento.getState();
    }
    
    public void show() {//Show the current state.
        System.out.println("State = " + state);
    }
}
