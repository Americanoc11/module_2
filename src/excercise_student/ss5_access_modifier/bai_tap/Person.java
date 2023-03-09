package excercise_student.ss5_access_modifier.bai_tap;

public class Person {
    private static String companyName;

    static {
        companyName = " Công ty thương mại ABC";
    }

    private String name;
    private String phone;
    private String position;

    public Person() {
    }

    public Person(String name, String phone, String position) {
        this.name = name;
        this.phone = phone;
        this.position = position;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Person.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                " name: '" + name + '\'' +
                ", phone: '" + phone + '\'' +
                ", position: '" + position + '\'' + ", Company: " + getCompanyName() +
                '}';
    }
}
