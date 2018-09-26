package facade_pattern;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;
    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }
    public void MethodA() {
        System.out.println("The method A:");
        one.Method();
        two.Method();
        four.Method();
    }
    public void MethodB() {
        System.out.println("The method B:");
        one.Method();
        three.Method();
        four.Method();
    }
}
