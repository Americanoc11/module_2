package ss9_dsa_list.bai_tap.excercise.repository.implements_intructor;

import ss9_dsa_list.bai_tap.excercise.model.Intructor;
import ss9_dsa_list.bai_tap.excercise.repository.implements_intructor.IIntructorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntructorRepository implements IIntructorRepository {
    static List<Intructor> intructorList = new ArrayList<>();

    static {
        intructorList.add(new Intructor(001, "TrungMini", "01/01", true, "Giảng viên Module 1"));
        intructorList.add(new Intructor(002, "CongNT", "01/02", true, "Giảng viên Module 2"));
        intructorList.add(new Intructor(003, "HaiTT", "01/03", true, "Giảng viên Module 4"));
        intructorList.add(new Intructor(004, "TrungDC", "01/04", true, "Giảng viên Module 2"));
    }

    @Override
    public void addNewIntructor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên giảng viên");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender = input.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Nhập chuyên ngành");
        String subject = input.nextLine();
        Intructor newIntructor = new Intructor(id, name, dateOfBirth, gender, subject);
        System.out.println("Thêm giảng viên thành công`");
    }

    @Override
    public void deletedIntructor(int id) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < intructorList.size(); i++) {
            if (intructorList.get(i).getId() == id) {
                System.out.println("Ok: để xóa giảng viên" + "\n" + "Cancel: Để hủy");
                String choice = input.nextLine();
                if (choice.equals("OK") || choice.equals("Ok")
                        || choice.equals("ok") || choice.equals("oK")) {
                    intructorList.remove(i);
                    System.out.println("Xóa thành công");
                    break;
                }
            }
        }
    }

    @Override
    public void displayIntructor() {
        if (intructorList.size() == 0) {
            System.out.println("Không có giảng viên nào");
        } else {
            for (Intructor intructors : intructorList) {
                System.out.println(intructors);
            }
        }
    }
}
