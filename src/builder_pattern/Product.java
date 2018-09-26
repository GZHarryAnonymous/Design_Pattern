package builder_pattern;

import java.util.ArrayList;

public class Product {
    ArrayList<String> parts = new ArrayList<String>();
    public void add(String part) {
        parts.add(part);
    }
    public void show() {
        System.out.println("The parts of product are:");
        for(String str:parts) {
            System.out.println(str);
        }
    }
}
