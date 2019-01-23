package visitor_pattern;

public abstract class Visitor {
    //we actually can use overload directly.
    //public abstract void VisitConcreteElementA(ConcreteElementA concreteElementA);
    //public abstract void VisitConcreteElementB(ConcreteElementB concreteElementB);
    //public abstract void VisitConcreteElement(ConcreteElementA concreteElementA);
    //public abstract void VisitConcreteElement(ConcreteElementB concreteElementB);
    public abstract void VisitConcreteElement(Element e);
}
