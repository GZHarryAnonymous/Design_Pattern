package simple_factory_pattern;

public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation oper = null;
        switch (operate) {
        case "+":
            oper = new Add();
            break;
        case "-":
            oper = new Minus();
            break;
        case "*":
            oper = new Multiple();
            break;
        case "/":
            oper = new Divided();
            break;
        default:
            System.out.println("The operator is wrong!");
            break;
        }
        return oper;
    }
}
