package simple_factory_pattern;

public class Divided extends Operation {
    public double getResult() {
        try {
            if (super.getB() == 0)
                throw new Exception("Wrong with B equals zero!");
        } catch (Exception e) {
            e.printStackTrace();
        } // finally {
          // return super.getA()/super.getB();
          // If the sentence above exists,the previous sentence will be covered.
          // Because the sentences which contained in the clause of "finally"
          // must be executed in final.
          // }
        return super.getA() / super.getB();

    }
}
/***
 * "throws" is used to illustrate these possible Exceptions in the current
 * function.But the process of it is executed by the caller.So we can just sees
 * them as the symbol of exceptions which may be threw. By comparison,"throw" is
 * a active behavior which produce the exception that contains the specific
 * meaning.
 */