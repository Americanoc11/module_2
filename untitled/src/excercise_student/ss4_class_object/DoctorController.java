package excercise_student.ss4_class_object;

import javax.print.Doc;

public class DoctorController {
    public static void main(String[] args) {
        Doctor personOne = new Doctor("Đức", 22, "THD street", "hhd", "01122", "Da khoa hopital");
        Doctor personTwo = new Doctor("Hạnh", 22, "THD street", "hhd", "01122", "Hai Chau hopital");
        Doctor personThree = new Doctor("Hưng", 22, "THD street", "hhd", "01122", "Hoan my hopital");
        Doctor personFour = new Doctor("Hoàng", 22, "THD street", "hhd", "01122", "Tam tri hopital");
        Doctor personFive = new Doctor("Danh", 22, "THD street", "hhd", "01122", "600 hopital");
        Person[] persons = new Person[]{personOne, personTwo, personThree, personFour, personFive};
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
