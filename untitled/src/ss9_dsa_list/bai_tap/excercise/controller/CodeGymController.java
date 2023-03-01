package ss9_dsa_list.bai_tap.excercise.controller;

import ss9_dsa_list.bai_tap.excercise.service.implements_intructor.IIntructorService;
import ss9_dsa_list.bai_tap.excercise.service.implements_student.IStudentService;
import ss9_dsa_list.bai_tap.excercise.service.implements_intructor.IntructorService;
import ss9_dsa_list.bai_tap.excercise.service.implements_student.StudentService;

import java.util.Scanner;

public class CodeGymController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IStudentService iStudentService = new StudentService();
        int choice;
        IIntructorService iIntructorService = new IntructorService();

        do {
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-");
            System.out.println("Chọn chức năng theo số( để tiếp tục");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm học viên" + "\n" + "2. Thêm giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    do {
                        switch (choice) {
                            case 1:
                                iStudentService.addNewStudent();
                                break;
                            case 2:
                                iIntructorService.addNewIntructor();
                                break;
                        }
                    } while (choice != 1 || choice != 2);
                    break;
                case 2:
                    System.out.println("1. Xóa học viên" + "\n" + "2. Xóa giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập id học viên bạn muốn xóa");
                            int id = Integer.parseInt(input.nextLine());
                            iStudentService.deletedStudent(id);
                            break;
                        case 2:
                            System.out.println("Nhập id học viên bạn muốn xóa");
                            int id1 = Integer.parseInt(input.nextLine());
                            iIntructorService.deletedIntructor(id1);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Hiện danh sách  học viên" + "\n" + "2. Hiện danh sách giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            iStudentService.display();
                            break;
                        case 2:
                            iIntructorService.displayIntructor();
                            break;
                    }
                    break;
            }
        } while (choice < 4);
    }
}
