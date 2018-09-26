package decorator_pattern;

public class Harry extends PersonComponent {
    public Harry(String name, CharacterType character) {
        super(name, character);
        // TODO Auto-generated constructor stub
    }

    public void show() {
        System.out.println("Hello everyone,my name is " + super.name);
        System.out.println("and my character is " + super.character);
    }
}
