package case_study.service.facillity.implement_room;

import case_study.model.Facillity.Room;
import case_study.repository.facility.implement_room.IRoomRepo;
import case_study.repository.facility.implement_room.RoomRepo;

import java.util.Scanner;

public class RoomService implements IRoomService{
    IRoomRepo iRoomRepo= new RoomRepo();
    Scanner input= new Scanner(System.in);
    @Override
    public void display() {
        iRoomRepo.display();
    }

    @Override
    public void addRoom() {
        System.out.println("Loại dịch vụ");
        String serviceName=input.nextLine();
        System.out.println("Nhập diện tích");
        String usableArea=input.nextLine();
        System.out.println("Chi phí cho thuê");
        String rentalCost=input.nextLine();
        System.out.println("Sức chứa người");
        String maxNumberPerson=input.nextLine();
        System.out.println("Kiểu cho thuê");
        String rentalType=input.nextLine();
        System.out.println("Dịch vụ ưu đãi");
        String freeService=input.nextLine();
        Room room= new Room(serviceName,usableArea,rentalCost,maxNumberPerson,rentalType,freeService);
        iRoomRepo.addRoom(room);
    }
}
