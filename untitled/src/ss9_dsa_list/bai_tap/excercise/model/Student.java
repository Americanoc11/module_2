package ss9_dsa_list.bai_tap.excercise.model;

public class Student extends Person {
    private String classes;
    private double score;

    public Student() {

    }

    public Student(int id, String name, String dateOfBirth
            , Boolean gender, String classes, int score) {
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
