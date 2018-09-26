package decorator_pattern;

public abstract class FineryDecorator extends PersonComponent {
    protected PersonComponent person;

    // prohibit construct outside.
    // keep decorator acting on concrete person all the time.
    // but if we use private,the subclass won't be permitted.
    // and the abstract class cann't construct concrete object naturally.
    protected FineryDecorator(String name, CharacterType character) {
        super(name, character);
        // TODO Auto-generated constructor stub
    }

    public void SetPerson(PersonComponent person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }

}
