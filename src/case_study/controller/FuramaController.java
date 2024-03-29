package case_study.controller;

import case_study.service.*;

import java.util.Scanner;

public class FuramaController {
    static IHouseService iHouseService = new HouseService();
    static IVillaService iVillaService = new VillaService();
    static IRoomService iRoomService = new RoomService();
    static IEmployeeService iEmployeeService = new EmployeeService();
    static ICustomerService iCustomerService = new CustomerService();
    Scanner input = new Scanner(System.in);

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int choice;
        int choiceTwo;
        boolean isChoiceOne= true;
        boolean isChoiceTwo;
        do {
            isChoiceOne=false;
            try{
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
                        employeeManagement();
                        break;
                    case 2:
                        customerManagement();
                        break;
                    case 3:
                        facilityManagement();
                        break;
                    case 4:
                        bookingManagement();
                        break;
                    case 5:
                        promotionManagament();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "\n Xin hãy nhập số");
                isChoiceOne= true;
            } catch (Exception e) {
                System.out.println("Lỗi ở đây: " + e.getMessage());
                System.out.println("Mời nhập lại:");
                isChoiceOne= true;
            }
            } while (isChoiceOne);

    }

    public static void employeeManagement() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        boolean isChoiceOne = true;
        try {
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
                        isChoiceOne = true;
                        break;
                    case 2:
                        iEmployeeService.addEmployee();
                        isChoiceOne = true;
                        break;
                    case 3:
                        //Lôi ghi file
                        iEmployeeService.editEmployee();
                        isChoiceOne = true;
                        break;
                    case 4:
                         menu();
                        break;
                }
            } while (isChoiceOne);
        } catch (NumberFormatException e) {
            System.out.println("Xin nhập số " + e.getMessage());
            System.out.println("Mời nhập lại");
            employeeManagement();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Mời nhập lại:");
            employeeManagement();
        }
    }

    public static void customerManagement() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        boolean isChoiceOne = true;
        try {
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
                        // lỗi sửa không ghi vào được file
                        iCustomerService.editCustomer();
                        isChoiceOne = true;
                        break;
                    case 4:
                        menu();
                        break;
                }
            } while (isChoiceOne);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
            System.out.println("Mời nhâp lại");
            customerManagement();
        } catch (Exception e) {
            System.out.println("Lỗi ở đây: " + e.getMessage());
            System.out.println("Mời nhập lại");
            customerManagement();
        }
    }


    public static void facilityManagement() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        int choiceTwo;
        boolean isChoiceOne = true;
        boolean isChoiceTwo = true;
        try {
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
                        try {
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
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
                            System.out.println("Mời nhâp lại");
                            customerManagement();
                        } catch (Exception e) {
                            System.out.println("Lỗi ở đây: " + e.getMessage());
                            System.out.println("Mời nhập lại");
                            customerManagement();
                        }
                        break;
                    case 2:
                        try {
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
                                        isChoiceTwo = true;
                                        break;
                                    case 2:
                                        iVillaService.addVilla();
                                        isChoiceTwo = true;

                                        break;
                                    case 3:
                                        iRoomService.addRoom();
                                        isChoiceTwo = true;
                                        break;
                                    case 4:
                                        menu();
                                        break;
                                }
                            } while (isChoiceTwo);
                        } catch (NumberFormatException e) {
                            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
                            System.out.println("Mời nhâp lại");
                            facilityManagement();
                        } catch (Exception e) {
                            System.out.println("Lỗi ở đây: " + e.getMessage());
                            System.out.println("Mời nhập lại");
                            facilityManagement();
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        menu();
                        break;
                }
            } while (isChoiceOne);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
            System.out.println("Mời nhâp lại");
            facilityManagement();
        } catch (Exception e) {
            System.out.println("Lỗi ở đây: " + e.getMessage());
            System.out.println("Mời nhập lại");
            facilityManagement();
        }
    }

    public static void bookingManagement() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        boolean isChoiceOne = true;
        try {
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
                        isChoiceOne = true;
                        break;
                    case 2:
                        isChoiceOne = true;
                        break;
                    case 3:
                        isChoiceOne = true;
                        break;
                    case 4:
                        isChoiceOne = true;
                        break;
                    case 5:
                        isChoiceOne = true;
                        break;
                    case 6:
                        menu();
                        break;
                }

            }
            while (isChoiceOne);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
            System.out.println("Mời nhâp lại");
            bookingManagement();
        } catch (Exception e) {
            System.out.println("Lỗi ở đây: " + e.getMessage());
            System.out.println("Mời nhập lại");
            bookingManagement();
        }
    }

    public static void promotionManagament() {
        Scanner input = new Scanner(System.in);
        int choiceOne;
        boolean isChoiceOne = true;
        try {
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
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "\n Xin hãy nhập số");
            System.out.println("Mời nhâp lại");
            promotionManagament();
        } catch (Exception e) {
            System.out.println("Lỗi ở đây: " + e.getMessage());
            System.out.println("Mời nhập lại");
            promotionManagament();
        }
    }
}
    