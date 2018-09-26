package composite_pattern;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void setStructure(char tag, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(tag);
        }
    }

    @Override
    public void display(int depth) {
        setStructure('-', depth);
        System.out.println(name);
        for (Component c : children) {
            c.display(depth + 2);
        }
    }
}
