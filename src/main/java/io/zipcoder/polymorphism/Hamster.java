package io.zipcoder.polymorphism;

public class Hamster extends Pet{

    public Hamster() {

        super( "Toopy");
    }


    public Hamster(String name) {
        super(name);
    }




    public String speak() {
        return "Boop";
    }


}
