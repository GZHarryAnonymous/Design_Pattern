package visitor_pattern;

public abstract class Element{
    public abstract void accept(Visitor v);
    //public abstract void operation(Visitor v);
}
