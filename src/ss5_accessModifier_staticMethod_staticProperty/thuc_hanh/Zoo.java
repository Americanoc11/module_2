package ss5_accessModifier_staticMethod_staticProperty.thuc_hanh;

public class Zoo {
    public String coolMethod() {
        return " Wow baby";
    }

    class Moo extends Zoo {
        public void useAZoo() {
            System.out.println("A zoo says: " + this.coolMethod());
            Zoo z = new Zoo();
            System.out.println("Zoo says, "+ z.coolMethod());
        }
    }


}
