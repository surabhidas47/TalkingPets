package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {

        super("Jimmy");

    }


    public Cat(String name) {
        super(name);
    }








    public String speak() {
        return "Meow";
    }
}
