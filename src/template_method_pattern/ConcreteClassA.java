package template_method_pattern;

public class ConcreteClassA extends AbstractClass{
    @Override
    public void PrimitiveOperation1(){
        System.out.println("This is the concrete method:A1");
    }
    @Override
    public void PrimitiveOperation2(){
        System.out.println("This is the concrete method:A2");
    }
}
