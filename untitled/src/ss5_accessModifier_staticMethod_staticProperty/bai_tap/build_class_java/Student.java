package ss5_accessModifier_staticMethod_staticProperty.bai_tap.build_class_java;

public class Student {
    private String name = " John";
    private String classes = "C02";

    public Student() {
    }

    String setName(String str) {
        return name = str;
    }

    String setClases(String mClass) {
        return classes = mClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
