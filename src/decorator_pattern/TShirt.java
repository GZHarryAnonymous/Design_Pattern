package decorator_pattern;

public class TShirt extends FineryDecorator {
    public TShirt(String name, CharacterType character) {
        super(name, character);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void show() {
        super.show();
        System.out.println("This is my Tshirt.");
    }
}
