package iterator_pattern;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate{
    private ArrayList<Object> items = new ArrayList<Object>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    public int getCount() {
        return items.size();
    }
    public Object getItem(int index) {//The basic method:get
        return items.get(index);
    }
    public void setItem(int index,Object value) {//The basic method:set
        items.add(index, value);
    }
}
