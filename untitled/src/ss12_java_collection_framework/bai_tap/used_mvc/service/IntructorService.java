package ss12_java_collection_framework.bai_tap.used_mvc.service;

import ss12_java_collection_framework.bai_tap.used_mvc.repository.IIntructorRepo;
import ss12_java_collection_framework.bai_tap.used_mvc.repository.IntructorRepo;
import ss9_dsa_list.bai_tap.excercise.model.Intructor;

import java.util.Scanner;

public class IntructorService implements IIntructorService{
    private IIntructorRepo iIntructorRepo= new IntructorRepo();
    Scanner input= new Scanner(System.in);
    @Override
    public void deleted() {
        System.out.println("Nhập id muốn xóa");
        int id=Integer.parseInt(input.nextLine());
        iIntructorRepo.deleted(id);
    }

    @Override
    public void display() {
        iIntructorRepo.display();
    }

    @Override
    public void add() {
        System.out.println("Nhập id học viên");
        int id =Integer.parseInt(input.nextLine());
        System.out.println("Nhập tên học viên");
        String name=input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth=input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender=input.nextLine();
        Boolean gender;
        System.out.println("Nhập chuyên môn");
        String subject=input.nextLine();
        if (tempGender=="Nam"||tempGender=="nam"){
            gender= true;
        } else if (tempGender=="Nữ"||tempGender=="nữ"){
            gender= false;
        } else {
            gender= null;
        }
        Intructor intructor= new Intructor(id,name,dateOfBirth,gender,subject);
        iIntructorRepo.add(intructor);

    }
}
