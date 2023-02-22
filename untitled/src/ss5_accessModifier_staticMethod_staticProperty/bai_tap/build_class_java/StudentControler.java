package ss5_accessModifier_staticMethod_staticProperty.bai_tap.build_class_java;

public class StudentControler {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu2.setName("Duc");
        stu2.setClases("C1222G1");
        Student stu3 = new Student();
        stu3.setName("Hạnh");
        stu3.setClases("C1222G1");
        Student stu4 = new Student();
        stu4.setName("Hoàng");
        stu4.setClases("C1222G1");
        Student stu5 = new Student();
        stu5.setName("Hưng");
        stu5.setClases("C1222G1");
        System.out.println(stu1.toString());
        System.out.println(stu2.toString());
        System.out.println(stu3.toString());
        System.out.println(stu4.toString());
        System.out.println(stu5.toString());
    }
}
