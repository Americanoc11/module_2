package ss9_dsa_list.bai_tap.excercise.service.implements_student;

import ss9_dsa_list.bai_tap.excercise.repository.implements_student.IStudentRepository;
import ss9_dsa_list.bai_tap.excercise.repository.implements_student.StudentRepository;
import ss9_dsa_list.bai_tap.excercise.service.implements_student.IStudentService;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();


    @Override
    public void display() {
        studentRepository.display();
    }

    @Override
    public void addNewStudent() {
        studentRepository.addNewStudent();
    }

    @Override
    public void deletedStudent(int id) {studentRepository.deletedStudent(id);
    }
}
