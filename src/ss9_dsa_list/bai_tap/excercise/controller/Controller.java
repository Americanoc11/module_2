package ss9_dsa_list.bai_tap.excercise.controller;

import ss12_java_collection_framework.bai_tap.used_mvc.service.IIntructorService;
import ss12_java_collection_framework.bai_tap.used_mvc.service.IntructorService;
import ss9_dsa_list.bai_tap.excercise.service.implements_student.IStudentService;
import ss9_dsa_list.bai_tap.excercise.service.implements_student.StudentService;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IStudentService iStudentService = new StudentService();
        IIntructorService iIntructorService = new IntructorService();
        int choice;
        do {
            System.out.println("------------------------------------------");
            System.out.println("-CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-");
            System.out.println("Chọn chức năng theo số( để tiếp tục");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            System.out.println("\n" + "------------------------------------------");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm học viên" + "\n" + "2. Thêm giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            iStudentService.add();
                            break;
                        case 2:
                            iIntructorService.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Xóa học viên" + "\n" + "2. Xóa giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            iStudentService.deleted();
                            break;
                        case 2:
                            iIntructorService.deleted();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Hiện danh sách  học viên" + "\n" + "2. Hiện danh sách giảng viên");
                    choice = Integer.parseInt(input.nextLine());
                    switch (choice) {
                        case 1:
                            iStudentService.displayStu();
                            break;
                        case 2:
                            iIntructorService.display();
                            break;
                    }
                    break;
            }
        } while (choice < 4);
    }
}
