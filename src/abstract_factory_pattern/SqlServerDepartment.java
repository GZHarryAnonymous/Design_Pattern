package abstract_factory_pattern;

public class SqlServerDepartment implements IDepartment{
    public void insert(Department department) {
        System.out.println("Add a user in sqlServer.");
    }
    public Department getDepartment(int id) {
        System.out.println("Delete a user through id in sqlServer");
        return null;
    }
}
