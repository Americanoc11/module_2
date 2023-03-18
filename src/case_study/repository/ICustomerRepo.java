package case_study.repository;

import case_study.model.Person.Customer;

public interface ICustomerRepo {
    void display();

    void addCustomer(Customer customer);

    void editCustomer(int index, Customer inforCustomer);
}
