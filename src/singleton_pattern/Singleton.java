package singleton_pattern;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}//Make sure it cann't be invoked.
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/*You should know these:
 *Lazy Singleton,Eager Singleton and Double Locked.
 *More details please see:
 *https://blog.csdn.net/GZHarryAnonymous/article/details/81567214
 */