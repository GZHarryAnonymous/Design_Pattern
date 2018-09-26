package visitor_pattern;

public class ConcreteVisitor2 extends Visitor{
    public void VisitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(this.getClass().getName()+" visit "+concreteElementA.getClass().getName());
    }
    public void VisitConcreteElementB(ConcreteElementB concreteElementB){
        System.out.println(this.getClass().getName()+" visit "+concreteElementB.getClass().getName());
    }
}
