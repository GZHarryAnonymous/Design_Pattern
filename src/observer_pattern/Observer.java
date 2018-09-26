package observer_pattern;

public interface Observer {
    //We use interface just because there will always be great difference
    //among observers in practical use.
    public abstract void update();
    //The "interface" prescribe a limit to every single subclass that
    //implements it in some degree,which can be seen as handicap.
    //Furthermore,we can use reflection to avoid using interface.
}
