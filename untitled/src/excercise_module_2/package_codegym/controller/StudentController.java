package excercise_module_2.package_codegym.controller;

import excercise_module_2.package_codegym.modal.CodeGym;
import excercise_module_2.package_codegym.modal.StudentCodeGym;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        StudentCodeGym studen = new StudentCodeGym("0111", "Duc", "01/01/00", "Male", "C1222G1", "Score B");
        StudentCodeGym studen1 = new StudentCodeGym("0111", "Duc1", "01/01/00", "Male", "C1222G1", "Score B");
        StudentCodeGym studen2 = new StudentCodeGym("0111", "Duc2", "01/01/00", "Male", "C1222G1", "Score B");
        CodeGym[] studenCod = new CodeGym[3];
        CodeGym[] addStudent = Arrays.copyOf(studenCod, studenCod.length + 1);
        do {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-");
            System.out.println("Chọn chức năng theo số( để tiếp tục");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(input.nextLine());
            if (choice==0) {
                System.out.println("Chức năng này không có");
            }
        } while (choice < 4);
    }
}
