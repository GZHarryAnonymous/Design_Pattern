package adapter_pattern;

public class Main {
    public static void main(String args[]) {
        Target target = new Adapter();
        target.request();//It actually invokes the adaptee's specialRequest.
    }
}
