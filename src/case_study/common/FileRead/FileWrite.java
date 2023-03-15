package case_study.common.FileRead;

import case_study.model.Facillity.House;
import case_study.model.Facillity.Room;
import case_study.model.Facillity.Vila;
import case_study.model.Person.Customer;
import case_study.model.Person.Employee;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void writeHouse(String path, House house){
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter= new BufferedWriter(new FileWriter(path,true));
             bufferedWriter.write(house.writeToCsv());
             bufferedWriter.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void writeRoom(String path, Room room){
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter= new BufferedWriter(new FileWriter(path,true));
             bufferedWriter.write(room.writeToCsv());
             bufferedWriter.newLine();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeVilla(String path, Vila vila){
        BufferedWriter bufferedWriter= null;
        try {
             bufferedWriter= new BufferedWriter(new FileWriter(path,true));
             bufferedWriter.write(vila.writeToCsv());
             bufferedWriter.newLine();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeEmployee(String path, Employee employee) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(employee.writeToCsv());
            bufferedWriter.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeCustomer(String path, Customer customer) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(path,true));
            bufferedWriter.write(customer.writeToCsv());
            bufferedWriter.newLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
