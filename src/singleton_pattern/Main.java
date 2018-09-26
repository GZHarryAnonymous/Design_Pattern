package singleton_pattern;

public class Main {
    public static void main(String args[]) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if(s1 == s2) {
            System.out.println("s1 is same with s2.");
        }else {
            System.out.println("s1 isn't same with s2.");
        }
    }
}
