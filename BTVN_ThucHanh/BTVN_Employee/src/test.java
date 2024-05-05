import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // tạo danh sách nhân vin
        EmployeeList listEmployee = new EmployeeList();
        Scanner sc = new Scanner(System.in);

        while(true) {
            int select;
            System.out.println("--------------------------------");
            System.out.println("Vui lòng chọn 1 trong những lựa chọn sau: \n" +
                    "1. Hiển thị danh sách nhân viên \n" +
                    "2. Thêm mới nhân viên \n" +
                    "3. Kiểm tra danh sách có rỗng hay không \n" +
                    "4. Lấy ra số lượng nhân viên trong danh sách \n" +
                    "5. Làm rỗng danh sách nhân viên \n" +
                    "6. Tìm kiếm nhân viên theo ID \n" +
                    "7.  Xóa nhân viên dựa trên ID \n" +
                    "8. Tìm kiếm tất cả nhân viên dựa trên Tên nhập từ bàn phím \n" +
                    "9. Hiển thị danh sách nhân viên có lương từ cao đến thấp \n" +
                    "10. Thoát \n");
            System.out.println("--------------------------------");
            select = sc.nextInt();
            sc.nextLine();
            try {
                if(select == 1) {
                    //1.Hiển thị danh sách 10 nhân viên này ra console
                    System.out.println(listEmployee);
                } else if (select == 2) {
                    //2.Chức năng thêm một nhân viên mới vào danh sách
                    System.out.println("Nhập ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Tên : ");
                    String name = sc.nextLine();
                    System.out.println("Nhập Tuổi  ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Phòng ban : ");
                    String department = new Scanner(System.in).nextLine();
                    System.out.println("Nhập Code: ");
                    int code = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập Lương: ");
                    double salary = sc.nextDouble();
                    sc.nextLine();
                    Employee e = new Employee(id, name, age, department, code, salary);
                    listEmployee.addEmployee(e);
                    System.out.println("Thêm nhân viên thành công!");;
                } else if (select == 3) {
                    //3.Kiểm tra ds có rỗng hay không
                    System.out.println("Danh sách rỗng: " + listEmployee.checkList());

                } else if (select == 4) {
                    //4.Lấy ra số lượng ds nhân viên
                    System.out.println("Số lượng nhân viên là: " + listEmployee.countEmployee());

                } else if (select == 5) {
                    //5.Làm rỗng ds nhân viên
                    listEmployee.doEmpty();
                    System.out.println("Danh sách nhân viên đã rỗng!");
                } else if (select == 6) {
                    //6.Kiểm tra nhân viên có tồn tại trong ds hay không, dựa trên ID
                    System.out.println("Nhập ID Nhân viên cần tìm kiếm");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Employee e = new Employee(id);
                    System.out.println(" Nhân viên tồn tại: " + listEmployee.checkEmployee(e));

                } else if (select == 7) {
                    //7.Xóa nhân viên dựa trên mã ID
                    System.out.println("Nhập ID Nhân viên cần xóa");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Employee e = new Employee(id);
                    System.out.println(" Xóa nhân viên: " + listEmployee.deleteEmployee(e));

                } else if (select == 8) {
                    //8.Tìm kiếm tất cả nhân viên dựa trên tên được nhập từ bàn phím
                    System.out.println("Nhập Tên : ");
                    String name = sc.nextLine();
                    System.out.println("Kết quả tìm kiếm: ");
                    listEmployee.searchEmployee(name);


                } else if (select == 9) {
                    //9.Xuất ra ds nhân viên có lương từ cao đến thấp
                    listEmployee.sortEmpployee();
                } else if (select == 10) {
                    System.out.println("Thoát chương trình");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Chỉ chọn lựa chọn bạn muốn!");
                sc.nextLine();
            }

        }
    }
}
