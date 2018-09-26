package flyweight_pattern;

import java.util.Hashtable;

public class WebsiteFactory {
    private Hashtable<String, Website> flyweights = new Hashtable<String, Website>();
    public Website getWebsiteCategory(String key) {
        if(!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return (Website)flyweights.get(key);
    }
    public int getWebsiteCount() {
        return flyweights.size();
    }
}
