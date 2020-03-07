package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class TestPeople {
    People people;
    Student student0;
    Student student1;
    Student student2;
    Student student3;
    Instructor nobles;

    @Before
    public void setUp(){
        people = new People();
        student0 = new Student(0l,"Kevin0");
        student1 = new Student(1l,"evin1");
        student2 = new Student(2l,"vin2");
        student3 = new Student(3l,"in3");
        nobles = new Instructor(100l, "Chris");
        people.addPerson(student0);
        people.addPerson(student1);
        people.addPerson(student2);
        people.addPerson(student3);
        people.addPerson(nobles);
    }

    @Test
    public void testAddPeople(){
        Assert.assertEquals(5,people.getPeople());
    }

    @Test
    public void findByIdTest(){
        Assert.assertEquals(nobles,people.findById(100l));
    }

    @Test
    public void containsTest(){
        Assert.assertTrue(people.contains(nobles));
    }

    @Test
    public void removePersonTest(){
        people.remove(student2);
        Assert.assertFalse(people.contains(student2));
    }

    @Test
    public void removePersonByIdTest(){
        people.removeById(2l);
        Assert.assertFalse(people.contains(student2));
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
