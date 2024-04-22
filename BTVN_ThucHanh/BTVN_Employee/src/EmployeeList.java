import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list;

    public EmployeeList(ArrayList<Employee> list) {
        this.list = list;
    }

    public EmployeeList() {
        this.list = new ArrayList<Employee>();
    }

    // Them NV
    public void add(Employee employee) {
        this.list.add(employee);
    }

    // Hien thi DS
    public void show() {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    // Xoa NV
    public boolean remove(Employee employee) {
        return this.list.remove(employee);
    }

}
