package abstract_factory_pattern;

public class AccessDepartment implements IDepartment{
    public void insert(Department department) {
        System.out.println("Add a department in Access.");
    }
    public Department getDepartment(int id) {
        System.out.println("Delete a department through id in Access");
        return null;
    }
}
