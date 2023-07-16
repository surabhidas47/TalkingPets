package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;
public class HamsterTest {

    @Test
    public void speakTest() {
        //given
        String expected = "Boop";
        Hamster h = new Hamster();


        //testing when the cat speaks
        // When
        String actual = h.speak();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetName() {
        //given
        //if we put a name in the expected than that would be the

        Hamster h = new Hamster();
        String expected = "Toopy";


        //testing when the cat speaks
        // When
        String actual = h.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSetName() {
        //given
        //if we put a name in the expected than that would be the

        Hamster h = new Hamster();
        String expected = "Poppy";

        //after we set the name checking
        //calling the getname to ensure set name worked
        h.setName(expected);
        String actual = h.getName();

        //Then
        Assert.assertEquals(expected, actual);


    }



}
