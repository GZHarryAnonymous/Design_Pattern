package visitor_pattern;

public class ConcreteElementA extends Element{
    @Override
    public void accept(Visitor v) {
        v.VisitConcreteElement(this);
    }
}
