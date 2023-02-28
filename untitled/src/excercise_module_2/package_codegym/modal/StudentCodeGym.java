package excercise_module_2.package_codegym.modal;

public class StudentCodeGym extends CodeGym {
    private String codeStudent;
    private String name;
    private String dateOfBirth;
    private String gender;




    private String classes;
    private String score;

    public StudentCodeGym() {

    }

    public StudentCodeGym(String codeStudent, String name, String dateOfBirth, String gender, String classes, String score) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.classes = classes;
        this.score = score;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentCodeGym{" +
                "codeStudent='" + codeStudent + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", classes='" + classes + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
