package decorator_pattern;

public class Tom extends PersonComponent {
    public Tom(String name, CharacterType character) {
        super(name, character);
        // TODO Auto-generated constructor stub
    }

    public void show() {
        System.out.println("Hello everyone,my name is " + super.name);
        System.out.println("and my character is " + super.character);
    }
}
