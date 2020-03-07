package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(1l,"Kevin");
        Assert.assertTrue(person.getId() == 1l);
        Assert.assertTrue(person.getName().equals("Kevin"));
    }

    @Test
    public void testName(){
        Person person = new Person(1l,"Kevin");
        person.setName("Rob");
        Assert.assertTrue(person.getName().equals("Rob"));
    }
}
