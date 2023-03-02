package excercise_module_2.package_codegym.service;

import excercise_module_2.package_codegym.repository.StudentRepository;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository= new StudentRepository();
    public void displayStudent() {
        studentRepository.displayStudent();
    }

    @Override
    public void deletedStudent(int id) {
        studentRepository.deletedStudent(id);
    }

    @Override
    public void addNewStudent() {
        studentRepository.addNewStudent();
    }
}
