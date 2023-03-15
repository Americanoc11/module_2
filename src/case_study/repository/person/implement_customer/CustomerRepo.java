package case_study.repository.person.implement_customer;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    public static List<Customer> customerList = new ArrayList<>();

    public static String pathCustomer = "src/case_study/data/list_customer.txt";

    @Override
    public void display() {
        List<Customer> customerList1= FileRead.readCustomer(pathCustomer);
        for (Customer c: customerList1){
            System.out.println(c.toString());
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        FileWrite.writeCustomer(pathCustomer,customer);
    }

    @Override
    public void editCustomer(int index, Customer inforCustomer) {
        customerList.set(index,inforCustomer);
        FileWrite.writeCustomer(pathCustomer,inforCustomer);
    }
}
