package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {


    //tests are always void
    @Test
    public void speakTest() {
        //given
        String expected = "Meow";
        Cat c = new Cat();


        //testing when the cat speaks
       // When
       String actual = c.speak();

       //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetName() {
        //given
        //if we put a name in the expected than that would be the

        Cat c = new Cat();
        String expected = "Jimmy";


        //testing when the cat speaks
        // When
        String actual = c.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }


    //we dont want a return bc we get the name after we set it
    @Test
    public void testSetName() {
        //given
        //if we put a name in the expected than that would be the

        Cat c = new Cat();
        String expected = "Meena";

        //after we set the name checking
        //calling the getname to ensure set name worked
        c.setName(expected);
        String actual = c.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }









}
