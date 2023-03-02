package excercise_module_2.package_codegym.controller;

import excercise_module_2.package_codegym.service.StudentService;

import java.util.Scanner;

public class CodeGymController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService studentService = new StudentService();
        int choice;
        do {
            System.out.println("--Chương trình quản lý sinh viên--");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    studentService.addNewStudent();
                    break;
                case 2:
                    System.out.println("Nhập Id muốn xóa");
                    int id = Integer.parseInt(input.nextLine());
                    studentService.deletedStudent(id)
                    ;
                    break;
                case 3:
                    studentService.displayStudent();
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
