package builder_pattern;

public class Director {
    //The order of every concreted product's construction will be constant.
    public void Construct(Builder builder) {//Not changed.
        builder.BuilderPartA();
        builder.BuilderPartB();
    }
}
