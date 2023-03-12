package case_study.service.facillity.implement_house;

import case_study.model.Facillity.House;
import case_study.repository.facility.implement_house.HouseRepo;
import case_study.repository.facility.implement_house.IhouseRepo;

import java.util.Scanner;

public class HouseService implements IHouseService{
    IhouseRepo ihouseRepo= new HouseRepo();
    Scanner input= new Scanner(System.in);
    @Override
    public void display() {
        ihouseRepo.display();
    }

    @Override
    public void addHouse() {
        System.out.println("Nhập tên dịch vụ");
        String serviceName=input.nextLine();
        System.out.println("Diện tích sử dụng");
        String usableArea=input.nextLine();
        System.out.println("Chi phí thuê");
        String rentalCost=input.nextLine();
        System.out.println("Nhập sức chứa");
        String maxNumberPerson=input.nextLine();
        System.out.println("Kiểu cho thuê");
        String rentalType=input.nextLine();
        System.out.println("Tiêu chuẩn phòng");
        String roomStandards=input.nextLine();
        System.out.println("Số tầng");
        String floors=input.nextLine();
        House house= new House(serviceName,usableArea,rentalCost,maxNumberPerson
        ,rentalType,roomStandards,floors);
        ihouseRepo.addHouse(house);

    }
}
