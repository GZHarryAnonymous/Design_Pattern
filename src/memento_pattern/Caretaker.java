package memento_pattern;

public class Caretaker {
    private Memento memento;//Composite the memo so that we can recovery.

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
    
}
