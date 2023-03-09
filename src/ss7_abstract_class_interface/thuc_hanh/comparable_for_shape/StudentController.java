package ss7_abstract_class_interface.thuc_hanh.comparable_for_shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    public static void main(String[] args) {
        List<Student> studentList= new ArrayList<>();
        studentList.add(new Student("Duc",23));
        studentList.add(new Student("Huy",19));
        studentList.add(new Student("An",40));
        System.out.println(studentList);
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println(studentList);
    }
}
