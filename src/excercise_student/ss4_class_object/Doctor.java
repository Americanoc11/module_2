package excercise_student.ss4_class_object;

public class Doctor extends Person {
    private String name;
    private int age;
    private String andress;
    private String email;
    private String phone;
    private String work;
    public Doctor(){}

    @Override
    public void jobWoking() {
        System.out.println("Doctor");
    }

    public Doctor(String name, int age, String andress, String email, String phone, String work) {
        this.name = name;
        this.age = age;
        this.andress = andress;
        this.email = email;
        this.phone = phone;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", andress='" + andress + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
