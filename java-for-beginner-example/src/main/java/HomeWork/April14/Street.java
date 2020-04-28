package HomeWork.April14;

public class Street extends Object{

    private String name;
    private String description;
    private String key;

    public Street(String name, String description, String key) {
        this.name = name;
        this.description = description;
        this.key = key;
    }

    public Street() {
    }

    public Street(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                '}';
    }
}
