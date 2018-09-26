package composite_pattern;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Can not add to a leaf.");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Can not remove from a leaf.");
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
    }
}
