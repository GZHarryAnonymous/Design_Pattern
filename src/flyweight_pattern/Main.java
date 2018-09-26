package flyweight_pattern;

public class Main {
    public static void main(String args[]) {
        WebsiteFactory f = new WebsiteFactory();
        User tom = new User("Tom");
        User sam = new User("Sam");
        
        Website fx = f.getWebsiteCategory("essay");
        fx.use(tom);
        Website fy = f.getWebsiteCategory("essay");
        fy.use(sam);
        Website fz = f.getWebsiteCategory("ppt");
        fz.use(tom);
        Website ft = f.getWebsiteCategory("presentation");
        ft.use(sam);
        Website fr = f.getWebsiteCategory("presentation");
        fr.use(tom);
        System.out.println(f.getWebsiteCount());
    }
}
