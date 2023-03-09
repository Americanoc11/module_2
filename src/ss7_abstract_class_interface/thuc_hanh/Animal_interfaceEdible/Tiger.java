package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class Tiger extends Animal {
    public Tiger() {
    }

    @Override
    public String makeSound() {
        return "Grao..grao";
    }

    @Override
    public String howToEat() {
        return "Cut meat and grill";
    }
}
