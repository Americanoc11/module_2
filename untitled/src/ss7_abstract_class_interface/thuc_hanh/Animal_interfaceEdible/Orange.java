package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Orange extends Fruit implements IHowToEat{
    public Orange() {

    }
    @Override
    public void howToEat() {
        IHowToEat.super.howToEat();
        System.out.println("Cut and eat....");
    }
}
