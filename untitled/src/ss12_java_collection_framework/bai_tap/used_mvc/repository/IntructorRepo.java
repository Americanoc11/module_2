package ss12_java_collection_framework.bai_tap.used_mvc.repository;

import ss9_dsa_list.bai_tap.excercise.model.Intructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntructorRepo implements IIntructorRepo{
    static List<Intructor> intructorList= new ArrayList<>();
    Scanner input= new Scanner(System.in);
    @Override
    public void deleted(int id) {
        for (int i = 0; i < intructorList.size(); i++) {
            if (intructorList.get(i).getId()==id){
                System.out.println("1. Xóa "+"\n"+"2. Hủy");
                int choice=Integer.parseInt(input.nextLine());
                if (choice==1){
                    System.out.println("Xóa thành công");
                    intructorList.remove(i);
                } else if (choice==2) {
                    System.out.println("Đã hủy xóa");
                } else {
                    System.out.println("Xin mời chọn lại");
                }
            }
        }
    }

    @Override
    public void display() {
        for (Intructor i: intructorList){
            System.out.println(i);
        }
    }

    @Override
    public void add(Intructor intructor) {
        intructorList.add(intructor);
    }
}
