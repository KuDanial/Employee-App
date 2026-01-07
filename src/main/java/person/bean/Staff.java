package person.bean;
import java.io.Serializable;

public class Staff implements Serializable {
    private int id;
    private String name;
    private double salary;
    private String designation;

    public Staff() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
}