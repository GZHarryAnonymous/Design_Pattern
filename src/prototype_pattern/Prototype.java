package prototype_pattern;

public abstract class Prototype implements Cloneable {
    protected String name;
    protected int age;
    protected Body body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // The method of clone just copy the basic data type.
        Prototype person = (Prototype) super.clone();
        return person;
    }
}
