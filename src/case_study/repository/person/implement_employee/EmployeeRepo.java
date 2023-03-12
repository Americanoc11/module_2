package case_study.repository.person.implement_employee;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo implements IEmployeeRepo {
    public static List<Employee> employeeList= new ArrayList<>();
    static {
        employeeList.add(new Employee(01,"Duc","01/01",true,"20xxx0","0347xxxxx","hhd@gmail.com","12/12","nhan vien","7xxxxxx"));
        employeeList.add(new Employee(02,"Duc","01/01",true,"20xxx0","0347xxxxx","hhd@gmail.com","12/12","nhan vien","7xxxxxx"));
        employeeList.add(new Employee(03,"Duc","01/01",true,"20xxx0","0347xxxxx","hhd@gmail.com","12/12","nhan vien","7xxxxxx"));
    }
    public static String pathEmployee="src/case_study/data/list_employee.txt";
    @Override
    public void display() {
        for(Employee e: employeeList){
            System.out.println(e.toString());
        }
        System.out.println("List employee");
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



}
