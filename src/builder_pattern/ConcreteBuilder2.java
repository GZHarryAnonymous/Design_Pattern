package builder_pattern;

public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();
    @Override
    public void BuilderPartA() {//The changing part.
        product.add("PartX");
    }
    @Override
    public void BuilderPartB() {//The changing part.
        product.add("PartY");
    }
    @Override
    public Product GetResult() {
        return product;
    }
}
