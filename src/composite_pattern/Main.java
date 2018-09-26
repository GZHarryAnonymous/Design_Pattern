package composite_pattern;

public class Main {
    public static void main(String args[]) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);
        root.display(1);
    }
}
/*
 * The composite_pattern is just like the structure of "Tree". The Component is
 * the abstraction of Leaf and Composite. The Composite can own its children but
 * the Leaf not.This is the "transparent mode".
 * But there is a question:why do we implement the methods of "add" and "remove" if
 * we actually don't need it in "Leaf" ?It's ridiculous!But on the other hand,it does
 * make the client more convenient so that they can omit the step of distinguishing
 * whether the current node is the leaf or not.
 * when we remove the method of "add" and "remove" in the Component,it is called
 * the "safe mode".How to choose them?It depends on the specific situation.
 * 
 */