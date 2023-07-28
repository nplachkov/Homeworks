package homework4;

public class Dog extends Pet{
    public Dog(String breed){
        super(breed); //calling the constructor breed from the super/parent class
    }

    //type specific actions
    public void bark(){
        System.out.println(getName() + " is barking...");
    }
}
