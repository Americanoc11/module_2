package case_study.controller;

import case_study.repository.person.implement_customer.ICustomerRepo;
import case_study.service.facillity.implement_house.HouseService;
import case_study.service.facillity.implement_house.IHouseService;
import case_study.service.facillity.implement_room.IRoomService;
import case_study.service.facillity.implement_room.RoomService;
import case_study.service.facillity.implement_vila.IVillaService;
import case_study.service.facillity.implement_vila.VillaService;
import case_study.service.person.customer.CustomerService;
import case_study.service.person.customer.ICustomerService;
import case_study.service.person.employment.EmployeeService;
import case_study.service.person.employment.IEmployeeService;

import java.util.Scanner;

public class FuramaController {

    public static void menu() {
        IHouseService iHouseService = new HouseService();
        IVillaService iVillaService = new VillaService();
        IRoomService iRoomService = new RoomService();
        IEmployeeService iEmployeeService = new EmployeeService();
        ICustomerService iCustomerService = new CustomerService();


        Scanner input = new Scanner(System.in);
        int choice;
        int choiceOne;
        int choiceTwo;
        boolean isChoiceOne;
        boolean isChoiceTwo;
        do {
            System.out.println("Ứng dụng quản lý khu nghỉ dưỡng Furama");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Chọn chức năng:");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    isChoiceOne = true;
                    do {
                        isChoiceOne = false;
                        System.out.println("--Employee Management--");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        System.out.println("Please choice number: ");
                        choiceOne = Integer.parseInt(input.nextLine());
                        switch (choiceOne) {
                            case 1:
                                iEmployeeService.display();
                                isChoiceOne = false;
                                break;
                            case 2:
                                iEmployeeService.addEmployee();
                                isChoiceOne = false;
                                break;
                            case 3:
                                // chưa làm được
                                isChoiceOne = false;
                                break;
                            case 4:
                                menu();
                                break;
                        }
                    } while (isChoiceOne);
                    break;
                case 2:
                    isChoiceOne = true;
                    do {
                        isChoiceOne = false;
                        System.out.println("--Customer Management--");
                        System.out.println("1. Display list customers");
                        System.out.println("2. Add new customers");
                        System.out.println("3. Edit customers");
                        System.out.println("4. Return main menu");
                        System.out.println("Please choice number: ");
                        choiceOne = Integer.parseInt(input.nextLine());
                        switch (choiceOne) {
                            case 1:
                                iCustomerService.display();
                                isChoiceOne = true;
                                break;
                            case 2:
                                iCustomerService.addCustomer();
                                isChoiceOne = true;
                                break;
                            case 3:
                                // chưa làm được
                                isChoiceOne = true;
                                break;
                            case 4:
                                menu();
                                break;
                        }
                    } while (isChoiceOne);
                    break;
                case 3:
                    isChoiceOne = true;
                    isChoiceTwo = true;
                    do {
                        isChoiceOne = false;
                        System.out.println("--Facility Management--");
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Edit facility");
                        System.out.println("4. Return main facility");
                        System.out.println("Please choice number: ");
                        choiceOne = Integer.parseInt(input.nextLine());
                        switch (choiceOne) {
                            case 1:
                                do {
                                    isChoiceTwo = false;
                                    System.out.println("--Display list facility--");
                                    System.out.println("1. House");
                                    System.out.println("2. Villa");
                                    System.out.println("3. Room");
                                    System.out.println("4. Return main menu");
                                    System.out.println("Please choice number: ");
                                    choiceTwo = Integer.parseInt(input.nextLine());
                                    switch (choiceTwo) {
                                        case 1:
                                            iHouseService.display();
                                            isChoiceTwo = true;
                                            break;
                                        case 2:
                                            iVillaService.display();
                                            isChoiceTwo = true;
                                            break;
                                        case 3:
                                            iRoomService.display();
                                            isChoiceTwo = true;
                                            break;
                                        case 4:
                                            menu();
                                            break;
                                    }
                                } while (isChoiceTwo);
                                isChoiceOne = false;
                                break;
                            case 2:
                                do {
                                    isChoiceTwo = false;
                                    System.out.println("--Add new facility--");
                                    System.out.println("1. Add House");
                                    System.out.println("2. Add Villa");
                                    System.out.println("3. Add Room");
                                    System.out.println("4. Return main menu");
                                    System.out.println("Please choice number: ");
                                    choiceTwo = Integer.parseInt(input.nextLine());
                                    switch (choiceTwo) {
                                        case 1:
                                            iHouseService.addHouse();
                                            break;
                                        case 2:
                                            iVillaService.addVilla();
                                            break;
                                        case 3:
                                            iRoomService.addRoom();
                                            break;
                                        case 4:
                                            menu();
                                            break;
                                    }
                                } while (isChoiceTwo);
                                isChoiceOne = false;
                                break;
                            case 3:
                                isChoiceOne = false;
                                break;
                            case 4:
                                menu();
                                break;
                        }
                    } while (isChoiceOne);
                    break;
                case 4:
                    isChoiceOne = true;
                    do {
                        isChoiceOne = false;
                        System.out.println("--Booking Management");
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new constracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        choiceOne = Integer.parseInt(input.nextLine());
                        switch (choiceOne) {
                            case 1:
                                isChoiceOne = false;
                                break;
                            case 2:
                                isChoiceOne = false;
                                break;
                            case 3:
                                isChoiceOne = false;
                                break;
                            case 4:
                                isChoiceOne = false;
                                break;
                            case 5:
                                isChoiceOne = false;
                                break;
                            case 6:
                                menu();
                                break;
                        }

                    }
                    while (isChoiceOne);
                    break;
                case 5:
                    isChoiceOne = true;
                    do {
                        isChoiceOne = false;
                        System.out.println("--Promotion Management--");
                        System.out.println("1. Display list customers use");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        choiceOne = Integer.parseInt(input.nextLine());
                        switch (choiceOne) {
                            case 1:
                                isChoiceOne = true;
                                break;
                            case 2:
                                isChoiceOne = true;
                                break;
                            case 3:
                                menu();
                                break;
                        }
                    } while (isChoiceOne);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (choice > 0 && choice < 7);
    }

    public static void main(String[] args) {
        menu();
    }
}
