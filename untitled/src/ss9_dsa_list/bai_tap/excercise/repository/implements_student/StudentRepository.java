package ss9_dsa_list.bai_tap.excercise.repository.implements_student;

import ss9_dsa_list.bai_tap.excercise.model.Student;
import ss9_dsa_list.bai_tap.excercise.repository.implements_student.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(001, "Duc", "01/01/2000", true, "C1222G1", 5));
        studentList.add(new Student(002, "Hoang", "01/01/2000", true, "C1222G1", 5));
        studentList.add(new Student(003, "Hung", "01/01/2000", true, "C1222G1", 5));
        studentList.add(new Student(004, "Tri", "01/01/2000", true, "C1222G1", 5));
    }

    @Override
    public List<Student> display() {
        if (studentList.size() == 0) {
            System.out.println(" Không có học viên nào");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }

        return studentList;
    }

    @Override
    public List<Student> addNewStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã học viên");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học viên");
        String name = input.nextLine();
        System.out.println(" Nhập ngày sinh");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender = input.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Nhập lớp");
        String classes = input.nextLine();
        System.out.println("Nhập điểm");
        int score = Integer.parseInt(input.nextLine());
        Student newStudent = new Student(id, name, dateOfBirth, gender, classes, score);
        studentList.add(newStudent);
        System.out.println("Thêm thành công");
        return null;
    }


    @Override
    public void deletedStudent(int id) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                System.out.println("Ok: Để xóa" + "\n" + "Cancel: Để hủy");
                String choice = input.nextLine();
                if (choice.equals("Ok") || choice.equals("Ok")
                        || choice.equals("ok") || choice.equals("oK")) {
                    studentList.remove(i);
                    System.out.println("Bạn đã xóa học viên thành công");
                    break;
                }
            }
        }
    }
}
