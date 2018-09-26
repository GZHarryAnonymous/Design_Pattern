package visitor_pattern;

public class ConcreteElementB extends Element{
    @Override
    public void accept(Visitor v) {
        v.VisitConcreteElementB(this);
    }
    public void operationB() {
    }
}