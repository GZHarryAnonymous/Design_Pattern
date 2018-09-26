package decorator_pattern;

public class BigTrouser extends FineryDecorator {
    public BigTrouser(String name, CharacterType character) {
        super(name, character);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        super.show();
        System.out.println("This is my BigTrouser.");
    }
}
