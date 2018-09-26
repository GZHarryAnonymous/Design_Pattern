package iterator_pattern;

public class ConcreteIterator extends Iterator{
    private ConcreteAggregate aggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.getCount() - 1;//descend
    }
    @Override
    public Object first() {
        // TODO Auto-generated method stub
        // return aggregate.getItem(0);
        return aggregate.getItem(aggregate.getCount() - 1);
    }
    @Override
    public Object next() {
        // TODO Auto-generated method stub
        Object tmp = null;
        // current++;
        current--;
        //if(current<aggregate.getCount()) {
        if(current >= 0) {
            tmp = aggregate.getItem(current);
        }
        return tmp;
    }
    @Override
    public boolean isDone() {
        // TODO Auto-generated method stub
        // return current>=aggregate.getCount() ? true:false;
        return current < 0 ? true:false;
    }
    @Override
    public Object currentItem() {
        // TODO Auto-generated method stub
        return aggregate.getItem(current);
    }
}
