package ss9_dsa_list.bai_tap.excercise.modal;

public abstract class Person {
    private int id;
    private String name;
    private String dateOfBirth;
    private Boolean gender;
    public Person(){

    }

    public Person(int id, String name, String dateOfBirth, Boolean gender) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
}
