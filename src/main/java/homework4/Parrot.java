package homework4;

public class Parrot extends Pet{
    public Parrot(String breed){
        super(breed); //calling the constructor breed from the super/parent class
    }

    //type specific actions
    public void speak(){
        System.out.println(getName() + " is speaking...");
    }
}
