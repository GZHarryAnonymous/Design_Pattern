package simple_factory_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String oper = sc.next();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Operation o = OperationFactory.createOperation(oper);
        o.setA(a);
        o.setB(b);
        System.out.println(o.getResult());
        sc.close();
    }
}
