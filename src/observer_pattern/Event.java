package observer_pattern;

import java.lang.reflect.Method;

public class Event {
    private Object object;

    private String methodName;

    private Object[] params;

    @SuppressWarnings("rawtypes")
    private Class[] paramTypes;

    /*
     * java.lang.Class Instances of the class Class represent classes and interfaces
     * in a running Java application. An enum is a kind of class and an annotation
     * is a kind of interface. Every array also belongs to a class that is reflected
     * as a Class object that is shared by all arrays with the same element type and
     * number of dimensions. The primitive Java types (boolean, byte, char, short,
     * int, long, float, and double), and the keyword void are also represented as
     * Class objects. Class has no public constructor. Instead Class objects are
     * constructed automatically by the Java Virtual Machine as classes are loaded
     * and by calls to the define Class method in the class loader.
     */
    public Event(Object object, String method, Object... args) {
        this.object = object;
        this.methodName = method;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        // Let's see if this function exists.
        if (null == method) {
            return;
        }
        method.invoke(this.object, this.params);// Use reflection to call functions.
    }
}
