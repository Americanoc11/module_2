package case_study.service;

import case_study.common.FileRead;
import case_study.model.Person.Customer;
import case_study.model.Person.Employee;
import case_study.repository.EmployeeRepo;
import case_study.repository.IEmployeeRepo;
import case_study.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepo iEmployeeRepo= new EmployeeRepo();
    private Scanner input= new Scanner(System.in);
    private static String pathEmployee="src/case_study/data/list_employee.txt";
    @Override
    public void display() {
        iEmployeeRepo.display();
    }

    @Override
    public void addEmployee() {
       List<Employee> employeeList= FileRead.readEmployee(pathEmployee);
        System.out.println("Nhập id khách hàng");
        try {
            int id = Integer.parseInt(input.nextLine());
            boolean isId = true;
            for (int i = 0; i < employeeList.size(); i++) {
                if (id == employeeList.get(i).getId()) {
                    isId = false;
                    break;
                }
            }
            if (isId) {
                System.out.println("Nhập tên khách hàng");
                String name = input.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = input.nextLine();
                System.out.println("Nhập giới tính");
                String tempGender = input.nextLine();
                Boolean gender;
                if (tempGender.equals("Nam") || tempGender.equals("nam")) {
                    gender = true;
                } else if (tempGender.equals("Nữ") || tempGender.equals("nữ")) {
                    gender = false;
                } else {
                    gender = null;
                }
                System.out.println("Nhập căn cước công dân");
                String identity = input.nextLine();
                System.out.println("Nhập số điện thoại");
                String phone = input.nextLine();
                System.out.println("Nhập email");
                String email = input.nextLine();
                System.out.println("Trình độ học vấn");
                String qualification=input.nextLine();
                System.out.println("Vị trí đang làm");
                String position = input.nextLine();
                System.out.println("Mức lương");
                String salary=input.nextLine();
                Employee employee = new Employee(id, name, dateOfBirth, gender, identity, phone, email, qualification, position,salary);
                iEmployeeRepo.addEmployee(employee);
            } else {
                System.out.println("Id đã tồn tại");
            }
        } catch (NumberFormatException e) {
            System.out.println("Xin nhập số");
        } catch (Exception e) {
            System.out.println("Lỗi ở đây" + e.getMessage());
            System.out.println("Mời nhập lại");
        }
    }

    @Override
    public void editEmployee() {

        List<Employee> employeeList = FileRead.readEmployee(pathEmployee);
        System.out.println("Nhập id nhân viên");
        int id;
        int index;
        try{
            id = Integer.parseInt(input.nextLine());
            boolean isId = false;
            index = -1;
            for (int i = 0; i < employeeList.size(); i++) {
                if (id == employeeList.get(i).getId()) {
                    index = i;
                    isId = true;
                    break;
                }
            }
            if (isId) {
                System.out.println("Id tồn tại");
                iEmployeeRepo.editEmployee(index, getInforEmployee(id));
            } else {
                System.out.println("Id không tồn tại, Xin nhập lại");
                editEmployee();
            }
        }catch (NumberFormatException e){
            System.out.println("Mời nhập số: "+ e.getMessage());
            editEmployee();
        }catch (Exception e){
            System.out.println("Lỗi ở đây: "+e.getMessage());
            System.out.println("Mời nhập lại");
        }
    }

    private Employee getInforEmployee(int id) {
        System.out.println("Nhập tên nhân viên");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính");
        String tempGender = input.nextLine();
        Boolean gender;
        if (tempGender.equals("Nam") || tempGender.equals("nam")) {
            gender = true;
        } else if (tempGender.equals("Nữ") || tempGender.equals("nữ")) {
            gender = false;
        } else {
            gender = null;
        }
        System.out.println("Nhập căn cước công dân");
        String identity = input.nextLine();
        System.out.println("Nhập số điện thoại ");
        String phone = input.nextLine();
        System.out.println("Nhập email");
        String email = input.nextLine();
        System.out.println("Nhập trình độ học vấn");
        String qualification = input.nextLine();
        System.out.println("Đang làm ở vị trí ");
        String position = input.nextLine();
        System.out.println("Nhập mức lương");
        String salary = input.nextLine();
        Employee employee = new Employee(id, name, dateOfBirth, gender
                , identity, phone, email
                , qualification, position, salary);
        return employee;
    }
}
