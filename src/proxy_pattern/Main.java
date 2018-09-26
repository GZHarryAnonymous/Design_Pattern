package proxy_pattern;

public class Main {
    public static void main(String args[]) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }
}
/***
 * The proxy_pattern uses composite to invoke the real request indirectly.
 * In some degree,this way can be seen as a hide for the original object.
 * The proxy_class and original_class implement the same interface so as to
 * complete the action without the trace.
 * There are some application about the proxy_pattern:
 * The first is kind of Remote_Proxy,which means the proxy_object can represent
 * "a part" or "the whole" of the original_object with different address.
 * The second is Virtual_Proxy that create "huge" object temporarily,which can 
 * storage the "expensive" object in the aspect of initialization.Such as:Delayed page loading.
 * The third is Security_Proxy,which is used to control the original object's access authority.
 * The last is Intelligent_Guidance that processes the additional internal affairs.
 */
