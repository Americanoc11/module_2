package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Chicken extends Animal implements IHowToEat {
    public Chicken() {

    }

    @Override
    public String makeSound() {
        return "Chuck-chuck";
    }

    @Override
    public void howToEat() {
        IHowToEat.super.howToEat();
        System.out.println("Pluck Chicken and grill chicken");
    }
}
