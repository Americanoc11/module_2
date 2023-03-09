package excercise_module_2.package_codegym.modal;

public class Student extends Person {
    private String classes;
    private double score;

    public Student() {

    }

    public Student(int id, String name, String dateOfBirth, Boolean gender, String classes, double score) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
