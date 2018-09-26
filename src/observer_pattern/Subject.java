package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    //@Override:if we use notify as the method's name,the question will
    //be:Cannot override the final method from Object.
    public void Notify() {
        for(Observer o : observers){
            o.update();//Not good enough for its narrow limitation.
        }
    }
    /***This is used for processing the "OldConcreteObserver."***/
    //List is a interface and ArrayList is the class that implements it. 
    private List<Event> objects = new ArrayList<Event>();

    public void addEvent(Object object,String methodName,Object...args) {
        objects.add(new Event(object,methodName,args));
    }
    
    public void NotifyAll() throws Exception{
        for(Event e:objects) {
            e.invoke();//It's better than "o.update()",which improved the universality.
        }
    }
}
