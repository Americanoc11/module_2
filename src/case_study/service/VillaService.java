package case_study.service;

import case_study.common.FileRead;
import case_study.model.Facillity.Vila;
import case_study.repository.IVillaRepo;
import case_study.repository.VillaRepo;
import case_study.service.IVillaService;
import case_study.utils.Utils;

import java.util.List;
import java.util.Scanner;

public class VillaService implements IVillaService {
    private static String pathVilla="src/case_study/data/list_villa";
   private IVillaRepo iVillaRepo= new VillaRepo();
   private Scanner input= new Scanner(System.in);
    @Override
    public void display() {
        iVillaRepo.display();
    }

    @Override
    public void addVilla() {
        List<Vila> vilaList= FileRead.readVilla(pathVilla);
        boolean isServiceName= true;
        do {
           isServiceName= false;
            System.out.println("Nhập tên dịch vụ. VD: SVVL-YYYY");
            String serviceName=input.nextLine();
            while (!Utils.checkValidateVilla(serviceName)){
                System.out.println("Xin nhập đúng cú pháp. VD: SVVL-YYYY");
                serviceName = input.nextLine();
            }
            for (int i = 0; i < vilaList.size(); i++) {
                if (vilaList.get(i).getServiceName().equals(serviceName)){
                    isServiceName= true;
                    break;
                }
            }
            if (isServiceName){
                System.out.println("Id dịch vụ đã tồn tại");
            } else {

                double usableArea;
                boolean isUsableArea= true;
                do {
                    try {
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea>0){
                            isUsableArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea= true;
                        }
                    }catch (NumberFormatException e) {
                        System.out.println("Xin hãy nhập số");
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea>0){
                            isUsableArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea= true;
                        }
                    }catch (Exception e){
                        System.out.println(" Lỗi ở đây: "+ e.getMessage());
                        System.out.println("Diện tích sử dụng");
                        usableArea = Double.parseDouble(input.nextLine());
                        if (usableArea>0){
                            isUsableArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isUsableArea= true;
                        }
                    }
                }while (isUsableArea);

                long rentalCost;
                boolean isRentalCost= true;
                do {
                    try {
                        System.out.println("Chi phí thuê");
                        rentalCost= Long.parseLong(input.nextLine());
                        if (rentalCost>0){
                            isUsableArea=false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea= true;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Xin hãy nhập số");
                        System.out.println("Chi phí thuê");
                        rentalCost= Long.parseLong(input.nextLine());
                        if (rentalCost>0){
                            isUsableArea=false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea= true;
                        }
                    }catch (Exception e){
                        System.out.println("Lỗi ở đây: "+e.getMessage());
                        System.out.println("Chi phí thuê");
                        rentalCost= Long.parseLong(input.nextLine());
                        if (rentalCost>0){
                            isUsableArea=false;
                        } else {
                            System.out.println("Chi phí thuê phải là số dương");
                            isUsableArea= true;
                        }
                    }
                }while (isUsableArea);
                int maxNumberPerson = 0;
                boolean isMaxPerson = true;
                do {
                    isMaxPerson= false;
                    try {
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson= Integer.parseInt(input.nextLine());
                        if (maxNumberPerson>0 && maxNumberPerson< 20){
                            isMaxPerson=false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Xin hay nhập số");
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson= Integer.parseInt(input.nextLine());
                        if (maxNumberPerson>0 && maxNumberPerson< 20){
                            isMaxPerson=false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    } catch (Exception e){
                        System.out.println("Lỗi ở đây: "+e.getMessage() );
                        System.out.println("Nhập sức chứa");
                        maxNumberPerson= Integer.parseInt(input.nextLine());
                        if (maxNumberPerson>0 && maxNumberPerson< 20){
                            isMaxPerson=false;
                        } else {
                            System.out.println("Phải là số dương");
                        }
                    }
                } while (isMaxPerson);
                System.out.println("Kiểu cho thuê");
                String rentalType = input.nextLine();
                System.out.println("Tiêu chuẩn phòng");
                String roomStandards = input.nextLine();
                double poolArea;
                boolean isPoolArea= true;
                do {
                    try {
                        System.out.println("Diện tích hồ bơi");
                        poolArea= Double.parseDouble(input.nextLine());
                        if (poolArea>0){
                            isPoolArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isPoolArea= true;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Xin hãy nhập số");
                        System.out.println("Diện tích hồ bơi");
                        poolArea= Double.parseDouble(input.nextLine());
                        if (poolArea>0){
                            isPoolArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isPoolArea= true;
                        }
                    }catch (Exception e){
                        System.out.println("Lỗi ở đây: "+e.getMessage());
                        System.out.println("Diện tích hồ bơi");
                        poolArea= Double.parseDouble(input.nextLine());
                        if (poolArea>0){
                            isPoolArea= false;
                        } else {
                            System.out.println("Diện tích phải là số dương");
                            isPoolArea= true;
                        }
                    }
                }while (isPoolArea);
                int floors;
                boolean isFloors=true;
                do {
                    try {
                        System.out.println("Số tầng");
                        floors = Integer.parseInt(input.nextLine());
                        if (floors>0){
                            isFloors= false;
                        } else {
                            System.out.println("Số tầng phải là số nguyên dương");
                            isFloors= true;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("Xin hãy nhập số ");
                        System.out.println("Số tầng");
                        floors = Integer.parseInt(input.nextLine());
                        if (floors>0){
                            isFloors= false;
                        } else {
                            System.out.println("Số tầng phải là số nguyên dương");
                            isFloors= true;
                        }
                    }catch (Exception e){
                        System.out.println("Lỗi ở đây: "+ e.getMessage());
                        System.out.println("Số tầng");
                        floors = Integer.parseInt(input.nextLine());
                        if (floors>0){
                            isFloors= false;
                        } else {
                            System.out.println("Số tầng phải là số nguyên dương");
                            isFloors= true;
                        }
                    }
                } while (isFloors);
                Vila vila= new Vila(serviceName,usableArea,rentalCost
                        ,maxNumberPerson,rentalType,roomStandards,poolArea,floors);
                iVillaRepo.addVilla(vila);
                isServiceName= false;
            }
        }while (isServiceName);
    }
}
