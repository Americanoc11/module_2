package case_study.common.FileRead;

import algorithm_ex.Ex;
import case_study.model.Facillity.House;
import case_study.model.Facillity.Room;
import case_study.model.Facillity.Vila;
import case_study.model.Person.Customer;
import case_study.model.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static List<House> readHouse(String path) {
        List<House> houseList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            House house;
            String[] temArr;
            while ((temp = bufferedReader.readLine()) != null) {
                temArr = temp.split(",");
                house = new House(temArr[0], temArr[1], temArr[2], temArr[3], temArr[4], temArr[5],temArr[6]);
                houseList.add(house);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public static List<Vila> readVilla(String path) {
        List<Vila> vilaList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            Vila vila;
            String[] temArr;
            while ((temp = bufferedReader.readLine()) != null) {
                temArr = temp.split(",");
                vila = new Vila(temArr[0], temArr[1], temArr[2], temArr[3], temArr[4], temArr[5], temArr[6],temArr[7]);
                vilaList.add(vila);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vilaList;
    }

    public static List<Room> readRoom(String path) {
        List<Room> roomList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            Room room;
            String[] temArr;
            while ((temp = bufferedReader.readLine()) != null) {
                temArr = temp.split(",");
                room = new Room(temArr[0], temArr[1], temArr[2], temArr[3], temArr[4],temArr[5]);
                roomList.add(room);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public static List<Employee> readEmployee(String path) {
        List<Employee> employeeList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            Employee employee;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");

                employee = new Employee(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2]
                        , Boolean.parseBoolean(tempArr[3]), tempArr[4], tempArr[5]
                        , tempArr[6], tempArr[7], tempArr[8],
                        tempArr[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employeeList;
    }

    public static List<Customer> readCustomer(String path) {
        List<Customer> customerList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String temp = "";
            Customer customer;
            String[] tempArr;
            while ((temp = bufferedReader.readLine()) != null) {
                 tempArr= temp.split(",");
                int tempArr1 = Integer.valueOf(tempArr[0]);
                Boolean gender = Boolean.valueOf(tempArr[3]);
                 customer= new Customer(Integer.parseInt(tempArr[0]),tempArr[1],tempArr[2],Boolean.parseBoolean(tempArr[3]),tempArr[4],tempArr[5],tempArr[6],tempArr[7],tempArr[8]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
