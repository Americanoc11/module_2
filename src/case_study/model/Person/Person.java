package case_study.model.Person;

public abstract class Person {
    private int id;
    private String name;
    private String dateofBirth;
    private Boolean gender;
    private String identity;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateofBirth, Boolean gender, String identity, String phone, String email) {
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.gender = gender;
        this.identity = identity;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public String getIdentity() {
        return identity;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DateofBirth='" + dateofBirth + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email;
    }

    public String writeToCsv() {
        return id + "," + name + "," + dateofBirth + "," + gender + "," + identity + "," + phone + "," + email;
    }
    /*
    id
    name
    date
    gender
    identity
    phone
    email
     */
}
