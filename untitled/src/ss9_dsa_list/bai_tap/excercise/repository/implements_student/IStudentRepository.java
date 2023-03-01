package ss9_dsa_list.bai_tap.excercise.repository.implements_student;

import ss9_dsa_list.bai_tap.excercise.model.Student;

import java.util.List;

public interface IStudentRepository {

    List<Student> display();

    List<Student> addNewStudent( );


    void deletedStudent(int id);
}
