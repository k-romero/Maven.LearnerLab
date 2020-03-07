package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetStudents(){
        Instructors instructors = Instructors.getInstance();
        Assert.assertTrue(instructors.contains(instructors.teacher0));
        Assert.assertTrue(instructors.contains(instructors.teacher1));
        Assert.assertTrue(instructors.contains(instructors.teacher2));
        Assert.assertTrue(instructors.contains(instructors.teacher3));
    }
}
