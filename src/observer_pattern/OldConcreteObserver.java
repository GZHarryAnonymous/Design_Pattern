package observer_pattern;

public class OldConcreteObserver {//Don't implement the interface of Subject.
    private String name;
    private ConcreteSubject sub;
    public OldConcreteObserver(ConcreteSubject sub,String name) {
        this.name = name;
        this.sub = sub;
    }
    public void oldUpdate(String feeling) {//The premier method's name is different to "update".
        System.out.println("The" + name +"'s situation is " + sub.getSubjectState());
        System.out.println("The feeling is "+feeling);
    }
}
