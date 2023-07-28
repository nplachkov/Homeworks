package homework4;

public class Test {
    public static void main(String[] args) {
        Dog Hera = new Dog("Boxer");
        Hera.setName("Hera");
        Hera.setAge((byte) 12);
        Hera.setSex("Female");
        Hera.setWeight(29f);

        Parrot Stevie = new Parrot("Cockatiel");
        Stevie.setName("Stevie");
        Stevie.setAge((byte) 3);
        Stevie.setSex("Male");
        Stevie.setWeight(1.2f);

        Stevie.petDetails();
    }
}
