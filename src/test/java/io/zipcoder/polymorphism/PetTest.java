package io.zipcoder.polymorphism;



//the only thing that goes in here is test for inheritnce


import org.junit.Assert;
import org.junit.Test;

public class PetTest {


    @Test

    public void petInheritanceTest() {
        //Given

        Pet cat = new Cat();

        //When

        //Then
        //for this particular cat
        Assert.assertTrue(cat instanceof Pet);









    }



}
