package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class TestPeople {
    Students people;
    Student newStudent;
    @Before
    public void setUp(){
        people = Students.getInstance();
        newStudent = new Student(56l,"Noob");
        people.addPerson(newStudent);
    }

    @After
    public void tearDown(){
        people.remove(newStudent);
    }

    @Test
    public void testAddPeople(){
        Assert.assertEquals(8,people.getPeople());
    }

    @Test
    public void findByIdTest(){
        Assert.assertTrue(people.findById(56l) == newStudent);
    }

    @Test
    public void containsTest(){
        Assert.assertTrue(people.contains(newStudent));
    }

    @Test
    public void removePersonTest(){
        people.remove(newStudent);
        Assert.assertFalse(people.contains(newStudent));
    }

    @Test
    public void removePersonByIdTest(){
        Assert.assertTrue(people.contains(newStudent));
        people.removeById(56l);
        Assert.assertFalse(people.contains(newStudent));
    }

    @Test
    public void removeAllTest(){
        people.removeAll();
        Assert.assertTrue(people.getPeople() == 0);
    }

    @Test
    public void iteratorTest(){
        Assert.assertTrue(people.iterator() instanceof Iterator);
    }
}
