package visitor_pattern;

public class ConcreteVisitor2 extends Visitor{
    public void VisitConcreteElement(Element e) {
        //e.operation(this);
        System.out.println(this.getClass().getName()+" visit "+e.getClass().getName());
    }
}
