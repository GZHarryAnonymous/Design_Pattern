package prototype_pattern;

public class ConcretePrototype extends Prototype {
    @Override
    protected Object clone() {//This method process the possible exception.
        Prototype person = null;
        try {
            // The method of clone just copy the basic data type.
            person = (ConcretePrototype) super.clone();
            person.name = new String(super.name);// The current is deep copy,without this sentence is shallow copy.
            person.body = (Body) body.clone();// The reference type need deep copy.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
