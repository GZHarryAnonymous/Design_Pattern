package observer_pattern;

public class ConcreteSubject extends Subject{
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
    
    /***This is used for processing the "OldConcreteObserver."***/

    @Override
    public void NotifyAll() {
        try {
            super.NotifyAll();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
