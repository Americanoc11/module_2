package case_study.service.facillity.implement_vila;

import case_study.model.Facillity.Vila;
import case_study.repository.facility.implement_villa.IVillaRepo;
import case_study.repository.facility.implement_villa.VillaRepo;

import java.util.Scanner;

public class VillaService implements IVillaService{
    IVillaRepo iVillaRepo= new VillaRepo();
    Scanner input= new Scanner(System.in);
    @Override
    public void display() {
        iVillaRepo.display();
    }

    @Override
    public void addVilla() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName=input.nextLine();
        System.out.println("Nhập diện tích sử dụng");
        String usableArea=input.nextLine();
        System.out.println("Chi phí thuê");
        String rentalCost=input.nextLine();
        System.out.println("Nhập sức chưá");
        String maxNumberPerson=input.nextLine();
        System.out.println("Kiểu cho thuê");
        String rentalType=input.nextLine();
        System.out.println("Tiêu chuẩn phòng");
        String roomStandards=input.nextLine();
        System.out.println("Diện tích hồ bơi");
        String poolArea=input.nextLine();
        System.out.println("Số tầng");
        String floors=input.nextLine();
        Vila vila= new Vila(serviceName,usableArea,rentalCost
                ,maxNumberPerson,rentalType,roomStandards,poolArea,floors);
        iVillaRepo.addVilla(vila);
    }
}
