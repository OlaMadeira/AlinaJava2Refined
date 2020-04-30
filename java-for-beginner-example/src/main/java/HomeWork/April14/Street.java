package HomeWork.April14;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(name, street.name) &&
                Objects.equals(description, street.description) &&
                Objects.equals(key, street.key);
    }

}
