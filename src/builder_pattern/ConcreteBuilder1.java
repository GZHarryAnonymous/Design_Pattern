package builder_pattern;

public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();
    @Override
    public void BuilderPartA() {//The changing part.
        product.add("PartA");
    }
    @Override
    public void BuilderPartB() {//The changing part.
        product.add("PartB");
    }
    @Override
    public Product GetResult() {
        return product;
    }
}
