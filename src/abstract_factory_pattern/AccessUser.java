package abstract_factory_pattern;

public class AccessUser implements IUser{
    public void insert(User user) {
        System.out.println("Add a user in Access.");
    }
    public User getUser(int id) {
        System.out.println("Get a user through id in Access.");
        return null;
    }
}
