package case_study.repository.person.implement_customer;

import case_study.model.Person.Customer;

public interface ICustomerRepo {
    void display();

    void addCustomer(Customer customer);

    void editCustomer(int index, Customer inforCustomer);
}
