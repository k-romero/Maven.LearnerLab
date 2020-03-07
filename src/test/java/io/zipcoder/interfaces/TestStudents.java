package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetStudents(){
       Students students = Students.getInstance();
       Assert.assertTrue(students.getArray().length == 7);
    }
}
