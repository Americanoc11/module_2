package case_study.repository;

import case_study.common.FileRead;
import case_study.common.FileWrite;
import case_study.model.Facillity.House;

import java.util.ArrayList;
import java.util.List;

public class HouseRepo implements IhouseRepo {
    private static String pathHouse = "src/case_study/data/list_house.txt";
    private static List<House> houseList = FileRead.readHouse(pathHouse);

    @Override
    public void display() {
        houseList = FileRead.readHouse(pathHouse);
        for (House h : houseList) {
            System.out.println(h.toString());
        }
    }

    @Override
    public void addHouse(House house) {
        houseList=FileRead.readHouse(pathHouse);
        houseList.add(house);
        FileWrite.writeHouse(pathHouse, house);
    }
}
