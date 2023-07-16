package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {

        Cat c = new Cat();
        Dog d = new Dog();
        Hamster h = new Hamster();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have?");
        String numOfPets = scanner.nextLine();

        System.out.print(numOfPets);


    }



}
