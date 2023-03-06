package ss9_dsa_list.bai_tap.excercise.repository.implements_student;

import ss9_dsa_list.bai_tap.excercise.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList= new ArrayList<>();
    static {
        studentList.add(new Student(1,"Duc","01/01",true,"C12",1));
        studentList.add(new Student(2,"Duc1","02/01",true,"C12",2));
        studentList.add(new Student(3,"Duc2","03/01",true,"C12",3));
    }
    Scanner input= new Scanner(System.in);
    @Override
    public void displayStu() {
        for (Student s: studentList){
            System.out.println(s);
        }
    }

    @Override
    public void deleted(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id){
                System.out.println("1. Xóa "+"\n"+"2. Hủy");
                int choice=Integer.parseInt(input.nextLine());
                if (choice==1){
                    System.out.println("Xóa thành công");
                    studentList.remove(i);
                } else if (choice==2) {
                    System.out.println("Đã hủy xóa");
                } else {
                    System.out.println("Xin mời chọn lại");
                }
            }
        }
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }
}
