package case_study.service.person.customer;

import case_study.model.Person.Customer;
import case_study.repository.person.implement_customer.CustomerRepo;
import case_study.repository.person.implement_customer.ICustomerRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepo iCustomerRepo = new CustomerRepo();
    Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        iCustomerRepo.display();
    }

    @Override
    public void addCustomer() {
        List<Customer> list = new ArrayList<>();
        System.out.println("Nhập id khách hàng");
        int id = Integer.parseInt(input.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("id đã tồn tại, xin nhập lại");
                addCustomer();
            }
        }
        System.out.println("Nhập tên khách hàng");
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
        System.out.println("Nhập số điện thoại");
        String phone = input.nextLine();
        System.out.println("Nhập email");
        String email = input.nextLine();
        System.out.println("Nhập hạng thành viên");
        String guestType = input.nextLine();
        System.out.println("Nhập địa chỉ resort đang thuể");
        String andress = input.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, identity, phone, email, guestType, andress);
        iCustomerRepo.addCustomer(customer);
    }
}
