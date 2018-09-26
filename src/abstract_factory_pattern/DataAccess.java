package abstract_factory_pattern;
public class DataAccess {
    private static final String AssemblyName = "abstract_factory_pattern";
    private static final String db = "Access";
    //private static final String db = "SqlServer";//Changed part easily.
    public static IUser CreateUser() {
        String className = AssemblyName + "." + db + "User";
        IUser user = null;
        try {
            user = (IUser)Class.forName(className).newInstance();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
