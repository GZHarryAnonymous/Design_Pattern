package visitor_pattern;

public class ConcreteVisitor1 extends Visitor{
    public void VisitConcreteElement(Element e) {
        System.out.println(this.getClass().getName()+" visit "+e.getClass().getName());
    }
}
