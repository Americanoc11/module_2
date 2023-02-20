package ss5_accessModifier_staticMethod_staticProperty.thuc_hanh;

public class Zoo {
    public String coolMethod() {
        return " Wow baby";
    }

    class Moo {
        public void useAZoo() {
            Zoo z = new Zoo();
            System.out.println("A zoo says: " + z.coolMethod());
        }
    }


}
