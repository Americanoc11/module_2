package case_study.repository.person.implement_customer;

import case_study.common.FileRead.FileWrite;
import case_study.model.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    public static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1, "Duc", "01/02", true, "2xxx", "09xxx", "duc@gmail.com", "kim cương", "Da nang"));
        customerList.add(new Customer(2, "Danh", "01/01", true, "2xxx", "09xxx", "duc@gmail.com", "bạch kim", "Sai gon"));
        customerList.add(new Customer(3, "Huy", "01/03", true, "2xxx", "09xxx", "duc@gmail.com", "bạch kim", "Ha noi"));
        customerList.add(new Customer(4, "Hoang", "01/04", true, "2xxx", "09xxx", "duc@gmail.com", "kim cương", "Hue"));
    }

    public static String pathCustomer = "src/case_study/data/list_customer.txt";

    @Override
    public void display() {
        for (Customer c : customerList) {
            System.out.println(c.toString());
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
        FileWrite.writeCustomer(pathCustomer,customer);
    }
}
