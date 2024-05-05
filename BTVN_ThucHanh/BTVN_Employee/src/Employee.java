import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private String department;
    private int code;
    private double salary_rate;

    //Constructor: Khoi tao

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, int age, String department, int code, double salary_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary_rate = salary_rate;
    }

    //get, set

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSalary_rate() {
        return salary_rate;
    }

    public void setSalary_rate(double salary_rate) {
        this.salary_rate = salary_rate;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + age + "\t" + department + "\t" +  code + "\t" + salary_rate ;
    }


        @Override
    public int compareTo(Employee o) {
        //Sap xep theo gia
        if(this.salary_rate > o.salary_rate ){
            return  -1;
        }
        if (this.salary_rate < o.salary_rate) {
            return  1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, age, department, code, salary_rate);
//    }
}
