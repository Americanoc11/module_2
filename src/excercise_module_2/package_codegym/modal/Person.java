package excercise_module_2.package_codegym.modal;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private Boolean gender;

    public Person() {

    }

    public Person(int id, String name, String dateOfBirth, Boolean gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                ", id=" + id +
                        ", name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", gender=" + gender;
    }

    public int getId() {
        return id;
    }
}
