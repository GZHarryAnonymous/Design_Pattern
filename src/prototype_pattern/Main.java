package prototype_pattern;

public class Main {
    public static void main(String args[]){
        Prototype person = new ConcretePrototype();
        person.setAge(11);
        person.setName("sam");
        Physique physique = new Physique();
        physique.setHealth(true);
        Body body = new Body();
        body.setPhysique(physique);
        body.setWeight(65.5);
        person.setBody(body);
        Prototype newPerson = null;
        try {
            newPerson = (ConcretePrototype)person.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(person.age == newPerson.age);
        System.out.println(person.name == newPerson.name);
        System.out.println(person.body == newPerson.body);
        System.out.println(person.body.getPhysique() == newPerson.body.getPhysique());
    }
}
