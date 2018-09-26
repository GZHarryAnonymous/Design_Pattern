package flyweight_pattern;

public class ConcreteWebsite extends Website{
    private String name = "";
    public ConcreteWebsite(String name) {
        this.name = name;
    }
    @Override
    public void use(User user) {
        System.out.println("The type of website is " + name);
        System.out.println("The reader is " + user.getName());
    }
}
