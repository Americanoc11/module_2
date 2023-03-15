package case_study.service.person.customer;

import case_study.common.FileRead.FileRead;
import case_study.model.Person.Customer;
import case_study.repository.person.implement_customer.CustomerRepo;
import case_study.repository.person.implement_customer.ICustomerRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    ICustomerRepo iCustomerRepo = new CustomerRepo();
    Scanner input = new Scanner(System.in);
    public static String pathCustomer = "src/case_study/data/list_customer.txt";


    @Override
    public void display() {
        iCustomerRepo.display();
    }

    @Override
    public void addCustomer() {
        List<Customer> list = FileRead.readCustomer(pathCustomer);
        System.out.println("Nhập id khách hàng");
        try {
            int id = Integer.parseInt(input.nextLine());
            boolean isId = true;
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    isId = false;
                    break;
                }
            }
            if (isId) {
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
            } else {
                System.out.println("Id đã tồn tại");
                addCustomer();
            }
        } catch (NumberFormatException e) {
            System.out.println("Xin nhập số");
            addCustomer();
        } catch (Exception e) {
            System.out.println("Lỗi ở đây" + e.getMessage());
            System.out.println("Mời nhập lại");
            addCustomer();
        }
    }

    @Override
    public void editCustomer() {
        List<Customer> customerList= FileRead.readCustomer(pathCustomer);
        System.out.println("Nhập id khách hàng");
        int id;
        int index;
        try {
            id=Integer.parseInt(input.nextLine());
            boolean isId= false;
            index=-1;
            for (int i = 0; i < customerList.size(); i++) {
                if (id==customerList.get(i).getId()){
                    index=i;
                    isId= true;
                    break;
                }
            }
            if (isId){
                System.out.println("Id tồn tại");
                iCustomerRepo.editCustomer(index,getInforCustomer(id));
                } else {
                System.out.println("Id không tồn tại, xin nhập lại");
                editCustomer();
            }
        }catch (NumberFormatException e){
            System.out.println("Xin nhập số. Lỗi: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Lỗi ở đây: "+e.getMessage());
        }
    }
    private Customer getInforCustomer(int id){
        System.out.println("Nhập tên nhân viên");
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
        System.out.println("Nhập số điện thoại ");
        String phone = input.nextLine();
        System.out.println("Nhập email");
        String email = input.nextLine();
        System.out.println("Nhập hạng thành viên");
        String guestType = input.nextLine();
        System.out.println("Nhập địa chỉ resort đang thuê");
        String andress = input.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, identity
                , phone, email, guestType, andress);
        return customer;
    }
}
