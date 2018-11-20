package abstract_factory_pattern;

public class Main {
    public static void main(String args[]) {
    	System.out.println("abstract pattern!");
        User user = new User();
        Department dept = new Department();
        //IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();
        
        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);
        
        IDepartment id = factory.createDepartment();
        id.insert(dept);
        id.getDepartment(1);
        System.out.println();
        //Use reflection.
        IUser iuNew = DataAccess.CreateUser();
        iuNew.insert(user);
        
    }
}
/* The factory_pattern focus on the specific type of product.
 * By comparison:
 * The abstract_factory_pattern focus on multiple types of product.
 * Such as:
 * The department and user are different series of product.
 * This is good.But from the other side,if we want to add a new type like salary,
 * we have to add these class:ISalary,AccessSalary,SqlServerSalary and ISalary createSalary().
 * We need to revise all the factory's class.
 * So,we should to give a idea to avoid it.
 * We can remove abstract factory.
 * The premier code is compiled statically.
 * We can use reflection so as to let the object constructed dynamically.
 * The "Spring" uses "Dependency Injection" and configuration file.
 */