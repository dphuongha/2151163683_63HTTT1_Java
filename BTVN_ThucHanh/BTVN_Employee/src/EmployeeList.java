import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {
    private ArrayList<Employee> ds;

    //Khởi tạo
    public EmployeeList() {
        this.ds = new ArrayList<>();
        AddEmployee();
    }
    public EmployeeList(ArrayList<Employee> ds) {
        this.ds = ds;
    }
    private void AddEmployee() {
        Employee nv1 = new Employee(1,"Đoàn Phương Hà",20,"Phòng Nhân sự", 001,50);
        Employee nv2 = new Employee(2,"Tô Đoàn",30,"Phòng Kế toán", 002,20);
        Employee nv3 = new Employee(3,"Nguyễn Đăng Hoàng Giang",20,"Phòng Marketing", 003,30);
        Employee nv4 = new Employee(4,"Nguyễn Đăng Dũng",25,"Phòng Kế toán", 004,60);
        Employee nv5 = new Employee(5,"Hoàng Thủy Eco",30,"Phòng Marketing", 005,50);
        Employee nv6 = new Employee(6,"Đoàn Phương Thảo",20,"Phòng Nhân sự", 006,25);
        Employee nv7 = new Employee(7,"Bùi Mai Phương",40,"Phòng Marketing", 007,30);
        Employee nv8 = new Employee(8,"Nguyễn Quỳnh Trang",50,"Phòng Kế toán", 140,40);
        Employee nv9 = new Employee(9,"Bùi Mai Phương",36,"Phòng Marketing", 155,35);
        Employee nv10 = new Employee(10,"Nguyễn Phương Hà",30,"Phòng Nhân sự", 010,20);

        ds.add(nv1);
        ds.add(nv2);
        ds.add(nv3);
        ds.add(nv4);
        ds.add(nv5);
        ds.add(nv6);
        ds.add(nv7);
        ds.add(nv8);
        ds.add(nv9);
        ds.add(nv10);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : ds) {
            sb.append(employee.toString()).append("\n");
        }
        return sb.toString();
    }
    public void addEmployee(Employee e) {
        ds.add(e);
    }

    //Kiểm tra ds nhân viên có trống không
    public boolean checkList() {
        return this.ds.isEmpty();
    }

    //Số lượng nhân viên
    public int countEmployee() {
        return  this.ds.size();
    }

    //Xóa tất cả nhân viên trong danh sách
    public void doEmpty() {
        this.ds.removeAll(ds);
    }
    //6.Kiểm tra nhân viên có tồn tại trong ds hay không, dựa trên ID
    public boolean checkEmployee(Employee e) {
        return this.ds.contains(e);
    }
    //7.Xóa nhân viên dựa trên mã ID
    public boolean deleteEmployee(Employee e) {
        return this.ds.remove(e);
    }
    //8.Tìm kiếm tất cả nhân viên dựa trên tên được nhập từ bàn phím
    public void searchEmployee(String name) {
        for(Employee e : ds) {
            if(e.getName().indexOf(name) >= 0) {
                System.out.println(e);
            }
        }
    }
    //9.Xuất ra ds nhân viên có lương từ cao đến thấp
    public void sortEmpployee() {
        Collections.sort(ds);
        System.out.println("Danh sách sau sắp xếp là: ");
        for (Employee e : ds) {
            System.out.println(e);
        }
    }

}
