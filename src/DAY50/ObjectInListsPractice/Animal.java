package DAY50.ObjectInListsPractice;

// Animal Assignment
public class Animal {
    private String animalName;

    private boolean dogClassification;

    public Animal(String animalName, boolean dogClassification) {
        this.animalName = animalName;
        this.dogClassification = dogClassification;




    }
    // Create 2 getters within the class & get the name and get the boolean
    public String getAnimalName() {
        return animalName;
    }

    public boolean isDogClassification() {
        return dogClassification;
    }

    public String toString() {
        return this.animalName + " is a dog = " + this.dogClassification;
    }

}
