package case_study.repository;

import case_study.common.FileWrite;
import case_study.model.Facillity.Vila;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.FileRead.readVilla;

public class VillaRepo implements IVillaRepo {
    private static String pathVilla="src/case_study/data/list_villa";
    @Override
    public void display() {
        List<Vila> vilaList= readVilla(pathVilla);
        for (Vila v: vilaList){
            System.out.println(v.toString());
        }
    }

    @Override
    public void addVilla(Vila vila) {
        List<Vila> vilaList= new ArrayList<>();
        vilaList.add(vila);
        FileWrite.writeVilla(pathVilla,vila);
    }
}
