package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Cat c = new Cat();
        Dog d = new Dog();
        Hamster h = new Hamster();

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many pets do you have?");
        int numOfPets = scanner.nextInt();
        scanner.nextLine();

       // Kennel[] pets = new Pet[];
        ArrayList<String> petRecord = new ArrayList<>();

        for (int i = 0; i < numOfPets; i++) {
            System.out.print("Enter the kind of pet (cat, dog or hamster):");
            String petType = scanner.nextLine();

            System.out.print("Enter the name of your pet:");
            String petName = scanner.nextLine();

            if (petType.equalsIgnoreCase("Cat")) {
                  c.setName(petName);
                  petRecord.add(petName+" "+c.speak());

            } else if (petType.equalsIgnoreCase("Dog")) {
                d.setName(petName);
                petRecord.add(petName+" "+d.speak());

            } else if (petType.equalsIgnoreCase("Hamster")) {
                h.setName(petName);
                petRecord.add(petName+" "+h.speak());

            } else {
                System.out.println("Invalid pet type");

            }


        }
        System.out.println("\nYour pet list:");
        for (int i=0;i<petRecord.size();i++){



            System.out.println(petRecord.get(i));
        }
//

//
//        System.out.println(c.getName()+ " "+ c.speak());
//        System.out.println(d.getName()+ " "+ d.speak());
//        System.out.println(h.getName()+ " "+ h.speak());

    }
}
