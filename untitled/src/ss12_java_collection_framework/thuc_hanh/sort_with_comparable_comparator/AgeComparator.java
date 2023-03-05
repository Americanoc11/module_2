package ss12_java_collection_framework.thuc_hanh.sort_with_comparable_comparator;

import java.util.Comparator;
import java.util.List;

public class AgeComparator implements IComparator<Student>, Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public void sort(List<Student> studentList, AgeComparator ageComparator) {

    }

}
