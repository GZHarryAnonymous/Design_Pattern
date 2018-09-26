package factory_pattern;

public class Main {
    public static void main(String args[]) {
        // IFactory factory = new CommonFactory();
        IFactory factory = new SuperFactory();
        Worker sam = factory.CreateWorker();
        sam.eat();
        sam.work();

    }
}
/***
 * If we want to understand the factory_pattern,we have to talk a lot
 * about the simple_factory_pattern so that realize the "no simple" of
 * the factory_pattern.
 * As we have known that the simple_factory encapsulates the sentence of
 * "switch-case",which works with object'polymorphisim,making the client
 * gets what they need through  giving the simple_factory different parameters.
 * By comparison,the factory_pattern gets further abstraction in the aspect of
 * different factory's implementation.The advantage is leave the "switch-case"
 * out.The only thing we need to do is to choice the different concrete factories
 * for changing different concrete objects.The relation between concrete factory
 * and concrete object is one-to-one,which also means there so many concrete 
 * factories we have to construct.So we can concluded the feature that 
 * factory_pattern is the factory'spolymorphism.
 */