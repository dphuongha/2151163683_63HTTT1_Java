import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeList list = new EmployeeList();
        int select = 0;

        do {
            System.out.println("----- Vui lòng chọn chức năng ");
            System.out.println(
                    " 1. Thêm nhân viên vào danh sách. \n"
                            + " 2. In danh sách nhân viên ra màn hình. \n"
                            + " 3. Xóa 1 nhân viên ra khỏi danh sách theo id nhân viên.\n"
                            + " 0. Thoát chương trình"
            );

            select = sc.nextInt();
            sc.nextLine();

            if (select == 1) {
//				1. Thêm nhân viên vào danh sách
                System.out.print("Nhập id: "); String id = sc.nextLine();
                System.out.print("Nhập tên: "); String name = sc.nextLine();
                System.out.print("Nhập tuổi: "); int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Nhập phòng ban: "); String department = sc.nextLine();
                System.out.print("Nhập code: "); String code = sc.nextLine();
                System.out.print("Nhập lương: "); Double salaryRate = sc.nextDouble();

                Employee employee = new Employee(id, name, department, code, age, salaryRate);
                list.add(employee);
                System.out.println();

            }else if (select == 2) {
//				2. In danh sách nhân viên ra màn hình
                list.show();
                System.out.println();

            }else if (select == 3) {
//				3. Xóa 1 nhân viên ra khỏi danh sách theo id nhân viên
                System.out.print("Nhập mã nhân viên (id): ");
                String id = sc.nextLine();
                Employee employee = new Employee(id);
                System.out.print("Xóa nhân viên trong danh sách: " + list.remove(employee));
                System.out.println();System.out.println();
            }
        } while(select != 0);

    }
}
