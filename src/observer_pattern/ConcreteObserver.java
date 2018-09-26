package observer_pattern;

public class ConcreteObserver implements Observer{
    private String name;
    private String observerState;
    private ConcreteSubject subject;//If one observer subscribe a lot of subjects,the 
    //type of "Subject" will be better,which is the superclass.
    public ConcreteObserver(ConcreteSubject subject,String name) {
        this.subject = subject;
        this.name = name;
    }
    public void update() {
        observerState = subject.getSubjectState();
        System.out.println("The" + name +"'s situation is " + observerState);
    }
    public ConcreteSubject getSubject() {
        return subject;
    }
    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }
    
}
