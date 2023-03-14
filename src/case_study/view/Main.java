package case_study.view;

import case_study.controller.FuramaController;
import case_study.model.Facillity.Facility;

public class Main {
    public static void main(String[] args) {
        FuramaController furamaController= new FuramaController();
        furamaController.menu();
    }
}
