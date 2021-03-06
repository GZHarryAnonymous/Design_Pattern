package chain_of_responsibility_pattern;

public class Majordomo extends Manager{
    public Majordomo(String name) {
        super(name);
    }
    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType().equals("Ask for leave.") && request.getNumber()<=5) {
            System.out.println("The days:"+request.getNumber());
            System.out.println("The contents:"+request.getRequestContent());
            System.out.println("Permitted by:" + name);
        }else {
            if(superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
