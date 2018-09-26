package facade_pattern;

public class Main {
    public static void main(String args[]) {
        Facade facade = new Facade();
        facade.MethodA();
        facade.MethodB();
    }
}
/*
 *The facade_pattern likes a facade that is used to communicate with outside.
 *Through this method we can provide the simple interface for those complicated
 *subsystem so as to reduce coupling.This is also a client's simplification.
 *The other situation using facade_pattern is when we have to reserve the old
 *and disordered system's functions for constructing new system,which can be 
 *seen as the new facade for interacting.
 */