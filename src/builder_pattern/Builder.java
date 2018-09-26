package builder_pattern;

public abstract class Builder {//The abstraction of concreted method.
    //These methods' concreted content are always changed in the future.
    //But the methods' name will be not changed.
    public abstract void BuilderPartA();
    public abstract void BuilderPartB();
    public abstract Product GetResult();
}
