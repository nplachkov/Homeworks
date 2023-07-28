package homework4;

public class Pet {
    private String breed;
    private float weight;
    private String sex;
    private byte age;
    private String name;


//Getters and Setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        }
        else{
            //System.out.println("Error. Please enter a valid breed.");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight >= 0.1f) {
            this.weight = weight;
        }
        else{
            //System.out.println("Error. Please enter a valid weight.");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()) {
            this.sex = sex;
        }
        else{
            //System.out.println("Error. Please enter a valid sex.");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        }
        else {
            //System.out.println("Error. Please enter a valid age.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
        else {
            //System.out.println("Error. Please enter a valid name.");
        }
    }

    //actions
    public void eat(){
        System.out.println(getName() + " is eating...");
    }
    public void sleeps(){
        System.out.println(getName() + " is sleeping...");
    }

    public void walk() {
        System.out.println(getName() + " is walking...");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping...");
    }

    public void makeNoise() {
        System.out.println(getName() + " is making noise...");
    }

    public Pet(String breed){
        setBreed(breed);
    }
    public void petDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Type: " + getClass().getSimpleName());
        System.out.println("Breed: " + getBreed());
        System.out.println("Sex: " + getSex());
        System.out.println("Weight: " + getWeight() + "kg");
    }
}
