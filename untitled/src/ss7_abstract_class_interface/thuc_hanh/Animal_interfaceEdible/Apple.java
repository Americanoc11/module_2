package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Apple extends Fruit implements IHowToEat{
    public Apple() {

    }

    @Override
    public void howToEat() {
        IHowToEat.super.howToEat();
        System.out.println("Bite....");
    }
}
