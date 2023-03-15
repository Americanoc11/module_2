package case_study.service.person.employment;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Person.Employee;
import case_study.repository.person.implement_employee.EmployeeRepo;
import case_study.repository.person.implement_employee.IEmployeeRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepo iEmployeeRepo = new EmployeeRepo();
    Scanner input = new Scanner(System.in);
    public static String pathEmployee="src/case_study/data/list_employee.txt";

    @Override
    public void display() {
        iEmployeeRepo.display();
    }

    @Override
    public void addEmployee() {
        List<Employee> employeeList = FileRead.readEmployee(pathEmployee);
        System.out.println("Nhập id");
        int id = Integer.parseInt(input.nextLine());
        boolean isId= true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getId()) {
                isId= false;
                break;
            }
        }
        if (isId){
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
            iEmployeeRepo.addEmployee(employee);
        } else {
            System.out.println("Id đã tồn tại");
            addEmployee();
        }
    }

    @Override
    public void editEmployee() {
        List<Employee> employeeList=FileRead.readEmployee(pathEmployee);
        int id = Integer.parseInt(input.nextLine());
        boolean isId= false;
        int index=-1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getId()) {
                index=i;
                isId= true;
                break;
            }
        }
        if (isId){
            System.out.println("Id tồn tại");
            getInforEmployee(id);
            iEmployeeRepo.editEmployee(index,getInforEmployee(id));
        } else {
            System.out.println("Id không tồn tại");
        }
    }
    private Employee getInforEmployee(int id){
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
