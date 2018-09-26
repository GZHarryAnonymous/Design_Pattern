package chain_of_responsibility_pattern;

public class GeneralManager extends Manager{
    public GeneralManager(String name) {
        super(name);
    }
    @Override
    public void requestApplication(Request request) {
        if(request.getRequestType().equals("Ask for leave.")) {
            System.out.println("The days:"+request.getNumber());
            System.out.println("The contents:"+request.getRequestContent());
            System.out.println("Permitted by:" + name);
        }else if(request.getRequestType().equals("Wage hike.")&&request.getNumber()<500){
            System.out.println("The money:"+request.getNumber());
            System.out.println("The contents:"+request.getRequestContent());
            System.out.println("Permitted by:" + name);
        }else {
            System.out.println("Let's talk about it later.");
        }
    }
}
