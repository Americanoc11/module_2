package case_study.repository.facility.implement_house;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Facillity.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepo implements IhouseRepo {
    public static String pathHouse = "src/case_study/data/list_house.txt";
    List<House> houseList = new ArrayList<>();

    @Override
    public void display() {
        List<House> list = FileRead.readHouse(pathHouse);
        for (House h : list) {
            System.out.println(h.toString());
        }
    }

    @Override
    public void addHouse(House house) {
        houseList.add(house);
        FileWrite.writeHouse(pathHouse,house);
    }
}
