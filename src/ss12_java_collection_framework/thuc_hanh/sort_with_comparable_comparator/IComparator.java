package ss12_java_collection_framework.thuc_hanh.sort_with_comparable_comparator;

import java.util.List;

public interface IComparator<S> {
    int compare(Student o1, Student o2);

    void sort(List<Student> studentList, AgeComparator ageComparator);
}
