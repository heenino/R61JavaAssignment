package entity;

public class Student01<N extends Number > {
    private N id;
    private String name;

    public Student01(N id, String name) {
        this.id = id;
        this.name = name;
    }

    public N getId() {
        return id;
    }

    public void setId(N id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
