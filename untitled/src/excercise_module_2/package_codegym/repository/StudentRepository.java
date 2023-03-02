package excercise_module_2.package_codegym.repository;

import excercise_module_2.package_codegym.modal.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private List<Student> studentList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void displayStudent() {
        if (studentList.size() == 0) {
            System.out.println("Danh sách hiện đang trống");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void addNewStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học viên");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender = input.nextLine();
        Boolean gender;
        System.out.println("Nhập lớp học viên");
        String classes = input.nextLine();
        System.out.println("Nhập điểm số");
        double score = Double.parseDouble(input.nextLine());
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        Student newStudent = new Student(id, name, dateOfBirth, gender, classes, score);
        studentList.add(newStudent);
        System.out.println("--Thêm học viên thành công--");
    }

    @Override
    public void deletedStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("--Để xóa học viên--" + "\n" + "1. Xóa" + "\n" + "2. Hủy");
                int choice = Integer.parseInt(input.nextLine());
                if (choice == 1) {
                    System.out.println("--Bạn đã xóa thành công--");
                    studentList.remove(i);
                    break;
                } else {
                    System.out.println("--Bạn đã hủy xóa--");
                }
            }
        }
    }


}
