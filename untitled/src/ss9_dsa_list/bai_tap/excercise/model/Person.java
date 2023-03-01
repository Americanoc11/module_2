package ss9_dsa_list.bai_tap.excercise.model;

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
        this.gender = Boolean.valueOf(String.valueOf(gender));
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", name='" + name + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", gender=" + gender;
    }
}
