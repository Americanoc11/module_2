package excercise_student.ss5_access_modifier.test_static;

public class Person {
    public static String name;
    private String age;

    static {
        name = "Duc";
        System.out.println("Hello: " + name);
    }

    public static void doSth2() {
        System.out.println("test static");
    }

    public void doSth() {
        doSth2();
        System.out.println(" Đang làm gì đó");
    }

    public Person() {

    }

    public Person(String age) {
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + " name =" + name +
                ", age= '" + age + '\'' +
                '}';
    }
}
