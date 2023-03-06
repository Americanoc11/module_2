package ss9_dsa_list.bai_tap.excercise.repository.implements_student;

import ss9_dsa_list.bai_tap.excercise.model.Student;

public interface IStudentRepository {
    void displayStu();

    void deleted(int id);

    void add(Student student);
}
