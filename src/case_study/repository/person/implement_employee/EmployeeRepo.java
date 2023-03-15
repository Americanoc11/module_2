package case_study.repository.person.implement_employee;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    public static List<Employee> employeeList= new ArrayList<>();
    public static String pathEmployee="src/case_study/data/list_employee.txt";
    @Override
    public void display() {
        List<Employee> employeeList1= FileRead.readEmployee(pathEmployee);
        for (Employee e: employeeList1){
            System.out.println(e.toString());
        }
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        FileWrite.writeEmployee(pathEmployee,employee);
    }

    @Override
    public void editEmployee(int index, Employee inforEmployee) {
        employeeList.set(index,inforEmployee);
        FileWrite.writeEmployee(pathEmployee,inforEmployee);
    }


}
