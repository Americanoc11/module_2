package case_study.service;

import case_study.common.FileRead;
import case_study.model.Facillity.Room;
import case_study.repository.IRoomRepo;
import case_study.repository.RoomRepo;
import case_study.service.IRoomService;
import case_study.utils.Utils;

import java.util.List;
import java.util.Scanner;

public class RoomService implements IRoomService {
    private static String pathRoom = "src/case_study/data/list_room";

    private IRoomRepo iRoomRepo = new RoomRepo();
    private Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        iRoomRepo.display();
    }

    @Override
    public void addRoom() {
        List<Room> roomList = FileRead.readRoom(pathRoom);

        boolean isServiceName = true;
        do {
            isServiceName = false;
            System.out.println("Nhập tên dịch vụ.VD: SVRO-YYYY");
            String serviceName = input.nextLine();
            while (!Utils.checkValidateRoom(serviceName)) {
                System.out.println("Xin nhập đúng cú pháp. VD: SVRO-YYYY");
                serviceName = input.nextLine();
            }
            for (int i = 0; i < roomList.size(); i++) {
                if (roomList.get(i).getServiceName().equals(serviceName)) {
                    isServiceName = true;
                    break;
                }
            }
            if (isServiceName) {
                System.out.println("Tên dịch vụ đã tồn tại ");
            } else {
                double usableArea;
                boolean isUsableArea = true;
                do {
                    try {
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea = true;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Xin hãy nhập số");
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea = true;
                        }
                    } catch (Exception e) {
                        System.out.println(" Lỗi ở đây: " + e.getMessage());
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea = true;
                        }
                    }
                } while (isUsableArea);

                long rentalCost;
                boolean isRentalCost = true;
                do {
                    try {
                        System.out.println("Chi phí thuê");
                        rentalCost = Long.parseLong(input.nextLine());
                        if (rentalCost > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea = true;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Xin hãy nhập số");
                        System.out.println("Chi phí thuê");
                        rentalCost = Long.parseLong(input.nextLine());
                        if (rentalCost > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea = true;
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi ở đây: " + e.getMessage());
                        System.out.println("Chi phí thuê");
                        rentalCost = Long.parseLong(input.nextLine());
                        if (rentalCost > 0) {
                            isUsableArea = false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea = true;
                        }
                    }
                } while (isUsableArea);
                int maxNumberPerson = 0;
                boolean isMaxPerson = true;
                do {
                    isMaxPerson = false;
                    try {
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson = Integer.parseInt(input.nextLine());
                        if (maxNumberPerson > 0 && maxNumberPerson < 20) {
                            isMaxPerson = false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Xin hay nhập số");
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson = Integer.parseInt(input.nextLine());
                        if (maxNumberPerson > 0 && maxNumberPerson < 20) {
                            isMaxPerson = false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    } catch (Exception e) {
                        System.out.println("Lỗi ở đây: " + e.getMessage());
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson = Integer.parseInt(input.nextLine());
                        if (maxNumberPerson > 0 && maxNumberPerson < 20) {
                            isMaxPerson = false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    }
                } while (isMaxPerson);
                System.out.println("Kiểu cho thuê");
                String rentalType = input.nextLine();
                System.out.println("Dịch vụ ưu đãi");
                String freeService = input.nextLine();
                Room room = new Room(serviceName, usableArea, rentalCost, maxNumberPerson, rentalType, freeService);
                iRoomRepo.addRoom(room);
            }
        } while (isServiceName);
    }
}
