package IoC;

public class UserImpl implements User {

    String name;

    public UserImpl(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {
        System.out.println(name);
    }
}
