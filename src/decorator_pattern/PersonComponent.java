package decorator_pattern;

enum CharacterType {// default is permitted to use in the whole package.
    introverted, extraverted
}

public abstract class PersonComponent {
    protected String name;// the default value is empty.
    protected CharacterType character;

    public PersonComponent(String name, CharacterType character) {
        this.name = name;
        this.character = character;
    }

    public abstract void show();
}
