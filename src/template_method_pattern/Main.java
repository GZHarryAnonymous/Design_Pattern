package template_method_pattern;

public class Main {
    public static void main(String args[]) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.TemplateMethod();
        c = new ConcreteClassB();
        c.TemplateMethod();
    }
}
/*
 * The core of the template method pattern is extract abstraction that move the
 * invariable part into abstract super class,which makes it easy for reuse.
 */