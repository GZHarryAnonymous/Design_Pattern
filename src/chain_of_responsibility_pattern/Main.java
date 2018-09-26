package chain_of_responsibility_pattern;

public class Main {
    public static void main(String args[]) {
        CommonManager manager = new CommonManager("Tom");
        Majordomo majordomo = new Majordomo("Sam");
        GeneralManager general = new GeneralManager("Harry");
        manager.setSuperior(majordomo);
        majordomo.setSuperior(general);
        
        Request request = new Request();
        request.setRequestType("Ask for leave.");
        request.setNumber(1);
        request.setRequestContent("Lisa wants to leave just one day.");
        manager.requestApplication(request);
        
        Request request2 = new Request();
        request2.setRequestType("Ask for leave.");
        request2.setNumber(4);
        request2.setRequestContent("Lisa wants to leave a few days.");
        manager.requestApplication(request2);
        
        Request request3 = new Request();
        request3.setRequestType("Wage hike.");
        request3.setNumber(300);
        request3.setRequestContent("Lisa wants to raise little money.");
        manager.requestApplication(request3);
        
        Request request4 = new Request();
        request4.setRequestType("Wage hike.");
        request4.setNumber(800);
        request4.setRequestContent("Lisa wants to raise much money.");
        manager.requestApplication(request4);
    }
}
