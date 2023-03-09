package ss7_abstract_class_interface.thuc_hanh.Animal_interfaceEdible;

public class AnimalController {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals) {
            System.out.println(animal.makeSound());
            System.out.println(animal.howToEat());
        }
    }
}
