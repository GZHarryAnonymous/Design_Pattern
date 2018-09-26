package abstract_factory_pattern;

public class SqlServerUser implements IUser{
    //private->default(friendly)->protected->public
    /* The scope:
     * private:class itself.
     * default:every class in the packet.
     * protected:every class in the packet and its subclass in the other packet.
     * public:every class no matter where it is.
     * In real using,when subclass override its superclass's methods,we need to 
     * keep the subclass's scope  bigger than superclass's scope.Otherwise,the error
     * will be as follows:
     *      - Cannot reduce the visibility of the inherited method from IUser. 
     * Meanwhile,the subclass can not throw "new" exceptions that its superclass haven't.
     * Why?
     * The answer is:Liskov Substitution Principle(LSP)
     */
    public void insert(User user) {//The superclass's scope is default,we can't use others
        //except "public".why?
        System.out.println("Add a user in sqlServer.");
    }
    public User getUser(int id) {
        System.out.println("Get user through id in sqlServer.");
        return null;
    }
}
