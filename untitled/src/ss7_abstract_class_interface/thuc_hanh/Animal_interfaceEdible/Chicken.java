package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Chicken extends Animal{
    @Override
    public String makeSound() {
        return "chruck...chruck";
    }

    @Override
    public String howToEat() {
        return "Grill and eat";
    }
}
