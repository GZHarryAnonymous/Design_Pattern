package iterator_pattern;

public class Main {
    public static void main(String args[]) {
        ConcreteAggregate a = new ConcreteAggregate();
        a.setItem(0, "apple");
        a.setItem(1, "banana");
        a.setItem(2, "orange");
        a.setItem(3, "grape");
        a.setItem(4, "pear");
        a.setItem(5, "watermelon");
        Iterator i = new ConcreteIterator(a);
        Object item = i.first();
        System.out.println(item);
        while(!i.isDone()) {
            System.out.println(i.currentItem());
            i.next();
        }
    }
}
