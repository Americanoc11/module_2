package case_study.repository;

import case_study.common.FileRead;
import case_study.common.FileWrite;
import case_study.model.Person.Customer;

import java.util.List;

public class CustomerRepo implements ICustomerRepo {

    private static String pathCustomer = "src/case_study/data/list_customer.txt";
    private static List<Customer> customerList = FileRead.readCustomer(pathCustomer);

    @Override
    public void display() {
        customerList = FileRead.readCustomer(pathCustomer);
        for (Customer c : customerList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList = FileRead.readCustomer(pathCustomer);
        customerList.add(customer);
        FileWrite.writeCustomer(pathCustomer, customer);
    }

    @Override
    public void editCustomer(int index, Customer inforCustomer) {
        customerList = FileRead.readCustomer(pathCustomer);
        customerList.set(index, inforCustomer);
        FileWrite.writeCustomer(pathCustomer, inforCustomer);
    }
}
