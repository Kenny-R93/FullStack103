package DAY50.ObjectInListsPractice;

import DAY50.ObjectInListsPractice.Animal;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        System.out.println("Animal Menu\n" + "Entering nothing will stop the loop\n");

        while(true) {
            System.out.println("Please enter a name:");
            String animalName= scanner.nextLine();
            if(animalName.isEmpty()){
                break;
            }

            System.out.println("Is it a dog? Yes or no:");
            String dogClassInput = scanner.nextLine();
            boolean dogClassification = dogClassInput.equalsIgnoreCase("yes");

            Animal animal = new Animal(animalName, dogClassification);
            animals.add(animal);

        }

        for(Animal animal: animals) {
            System.out.println(animal.toString());
        }


    }
}
