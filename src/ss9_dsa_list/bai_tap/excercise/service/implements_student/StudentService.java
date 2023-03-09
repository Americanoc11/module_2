package ss9_dsa_list.bai_tap.excercise.service.implements_student;

import ss9_dsa_list.bai_tap.excercise.model.Student;
import ss9_dsa_list.bai_tap.excercise.repository.implements_student.IStudentRepository;
import ss9_dsa_list.bai_tap.excercise.repository.implements_student.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService{
    private IStudentRepository iStudentRepository= new StudentRepository();
    Scanner input= new Scanner(System.in);
    @Override
    public void displayStu() {
        iStudentRepository.displayStu();
    }

    @Override
    public void deleted() {
        System.out.println("Nhập id muốn xóa");
        int id=Integer.parseInt(input.nextLine());
        iStudentRepository.deleted(id);
    }

    @Override
    public void add() {
        System.out.println("Nhập id học viên");
        int id =Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học viên");
        String name=input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth=input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender=input.nextLine();
        Boolean gender;
        System.out.println("Nhập lớp học viên");
        String classes= input.nextLine();
        System.out.println("Nhập điểm của học viên");
        int score=Integer.parseInt(input.nextLine());
        if (tempGender=="Nam"||tempGender=="nam"){
            gender= true;
        } else if (tempGender=="Nữ"||tempGender=="nữ"){
            gender= false;
        } else {
            gender= null;
        }
        Student student= new Student(id,name,dateOfBirth,gender,classes,score);
        iStudentRepository.add(student);
    }
}
