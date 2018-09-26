package abstract_factory_pattern;

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}
