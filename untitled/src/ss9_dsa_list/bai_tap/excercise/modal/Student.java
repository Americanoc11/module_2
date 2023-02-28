package ss9_dsa_list.bai_tap.excercise.modal;

public class Student extends Person {
    private String classes;
    private int score;

    public Student() {

    }
    public Student(int id, String name, String dateOfBirth, Boolean gender, String classes, int score) {
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.score = score;
    }
}
