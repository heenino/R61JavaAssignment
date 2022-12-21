package entity;

import java.util.Arrays;

public class Employee <E extends Number>{
    private int id;
    private String name;
    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
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

    public E[] getSalaries() {
        return salaries;
    }

    public void setSalaries(E[] salaries) {
        this.salaries = salaries;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaries=" + Arrays.toString(salaries) +
                '}';
    }

    public void lastOfsalaries(){
        E lastElement = salaries[salaries.length - 1];
        System.out.println("lastElement = " + lastElement);
    }

}
