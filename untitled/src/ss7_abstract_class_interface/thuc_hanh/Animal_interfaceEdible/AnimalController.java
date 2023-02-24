package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class AnimalController {
    public static void main(String[] args) {
        Tiger tiger= new Tiger();
        tiger.howToEat();
        Chicken chicken= new Chicken();
        chicken.howToEat();
        Orange orange= new Orange();
        orange.howToEat();
        Apple apple= new Apple();
        apple.howToEat();
    }
}
