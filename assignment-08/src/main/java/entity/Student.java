package entity;

public class Student {
    private static int count = 1;
    private int id;
    private String name;

    public Student( String name) {
        this.id = count;
        this.name = name;
        count ++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
