package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Tiger extends Animal implements IHowToEat {
    public Tiger() {

    }

    @Override
    public String makeSound() {
        return "GRaooooo....";
    }

    @Override
    public void howToEat() {
        IHowToEat.super.howToEat();
        System.out.println("Cut meat and grill meat");
    }
}
