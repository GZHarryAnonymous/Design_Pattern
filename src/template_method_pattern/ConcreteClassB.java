package template_method_pattern;

public class ConcreteClassB extends AbstractClass{
    @Override
    public void PrimitiveOperation1() {
        System.out.println("This is the concrete method:B1");
    }
    @Override
    public void PrimitiveOperation2() {
        System.out.println("This is the concrete method:B2");
    }
}
