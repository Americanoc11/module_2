package case_study.repository;

import case_study.common.FileRead;
import case_study.common.FileWrite;
import case_study.model.Person.Employee;

import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    private static String pathEmployee = "src/case_study/data/list_employee.txt";
    private static List<Employee> employeeList = FileRead.readEmployee(pathEmployee);


    @Override
    public void display() {
         employeeList = FileRead.readEmployee(pathEmployee);
        if (employeeList.size() == 0) {
            System.out.println("Danh sách hiện đang trống");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public void addEmployee(Employee employee) {
         employeeList = FileRead.readEmployee(pathEmployee);
        employeeList.add(employee);
        FileWrite.writeEmployee(pathEmployee, employee);
    }

    @Override
    public void editEmployee(int index, Employee inforEmployee) {
         employeeList = FileRead.readEmployee(pathEmployee);
        employeeList.set(index, inforEmployee);
        FileWrite.writeEmployee(pathEmployee, inforEmployee);
    }


}