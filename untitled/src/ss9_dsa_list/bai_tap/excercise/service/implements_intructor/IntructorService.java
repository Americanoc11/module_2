package ss9_dsa_list.bai_tap.excercise.service.implements_intructor;

import ss9_dsa_list.bai_tap.excercise.repository.implements_intructor.IIntructorRepository;
import ss9_dsa_list.bai_tap.excercise.repository.implements_intructor.IntructorRepository;
import ss9_dsa_list.bai_tap.excercise.service.implements_intructor.IIntructorService;

public class IntructorService implements IIntructorService {
    private IIntructorRepository intructorRepository = new IntructorRepository();

    @Override
    public void displayIntructor() {
        intructorRepository.displayIntructor();
    }

    @Override
    public void addNewIntructor() {
        intructorRepository.addNewIntructor();
    }

    @Override
    public void deletedIntructor(int id) {
        intructorRepository.deletedIntructor(id);
    }
}
