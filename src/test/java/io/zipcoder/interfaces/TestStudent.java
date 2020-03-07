package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudent {

    Student student;
    @Before
    public void setUp(){
        student = new Student(1l,"Kevin");
    }

    @Test
    public void testLearner(){
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testPerson(){
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        student.learn(100.0);
        Assert.assertTrue(student.getTotalStudyTIme() == 100.0);
    }
}
