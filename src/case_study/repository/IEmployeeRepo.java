package case_study.repository;

import case_study.model.Person.Employee;

import java.util.List;

public interface IEmployeeRepo {
    void display();

    void addEmployee(Employee employee);


    void editEmployee(int index, Employee inforEmployee);
}
