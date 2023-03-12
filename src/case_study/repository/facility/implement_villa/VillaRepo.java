package case_study.repository.facility.implement_villa;

import case_study.common.FileRead.FileRead;
import case_study.common.FileRead.FileWrite;
import case_study.model.Facillity.Vila;
import ss9_dsa_list.bai_tap.excercise.model.Student;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.FileRead.FileRead.readVilla;

public class VillaRepo implements IVillaRepo{
    public static String pathVilla="src/case_study/data/list_villa";
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
