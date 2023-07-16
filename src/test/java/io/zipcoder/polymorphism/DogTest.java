package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
public class DogTest {

    @Test
    public void speakTest() {
        //given
        String expected = "Woof";
       Dog d = new Dog();


        //testing when the cat speaks
        // When
        String actual = d.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetName() {
        //given
        //if we put a name in the expected than that would be the

        Dog d = new Dog();
        String expected = "Spot";


        //testing when the cat speaks
        // When
        String actual = d.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSetName() {
        //given
        //if we put a name in the expected than that would be the

        Dog d = new Dog();
        String expected = "Coco";

        //after we set the name checking
        //calling the getname to ensure set name worked
        d.setName(expected);
        String actual = d.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }








}
