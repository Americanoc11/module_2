package case_study.model.Person;

public class Employee extends Person {
    private String qualifications;
    private String position;
    private String salary;



    public Employee(int id, String name, String dateofBirth, Boolean gender, String identity, String phone, String email, String qualifications, String position, String salary) {
        super(id, name, dateofBirth, gender, identity, phone, email);
        this.qualifications = qualifications;
        this.position = position;
        this.salary = salary;
    }

    public String getQualifications() {
        return qualifications;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", qualifications='" + qualifications + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public String writeToCsv() {
        return super.writeToCsv() + "," + qualifications + "," + position + "," + salary;
    }
     /*
    id
    name
    date
    gender
    identity: can cuoc
    phone
    email
    qualification: trinh do
    position: vi tri
    salary
     */
}
