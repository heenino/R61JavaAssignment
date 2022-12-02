import java.util.Objects;

public class Deparment {
    int id;
    String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deparment deparment = (Deparment) o;
        return name.equals(deparment.name);
    }

}
