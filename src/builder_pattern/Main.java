package builder_pattern;

public class Main {
    public static void main(String args[]) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();
        director.Construct(b1);
        Product p1 = b1.GetResult();
        p1.show();
        director.Construct(b2);
        Product p2 = b2.GetResult();
        p2.show();
    }
}
/* The product is the product.
 * The director is responsible for the order of the whole product's 
 * construction,which is constant more often.
 * The Builder is responsible for constructing every part of a product's
 * implementation in detail,which always changed.
 * The concreted builder composites the product so as to implements the
 * production and definite every part's contents.
 */