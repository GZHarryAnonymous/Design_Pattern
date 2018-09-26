package abstract_factory_pattern;

public interface IUser {
    //If we use:protected void insert(User user);
    //Illegal modifier for the interface method insert;
    //only public, abstract, default, static and strictfp are permitted
    void insert(User user);
    User getUser(int id);
}
