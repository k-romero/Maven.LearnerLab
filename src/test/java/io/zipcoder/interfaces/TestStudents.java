package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testGetStudents(){
       Students students = Students.getInstance();
       Assert.assertTrue(students.contains(students.student0));
       Assert.assertTrue(students.contains(students.student1));
       Assert.assertTrue(students.contains(students.student2));
       Assert.assertTrue(students.contains(students.student3));
       Assert.assertTrue(students.contains(students.student4));
       Assert.assertTrue(students.contains(students.student5));
       Assert.assertTrue(students.contains(students.student6));
    }
}
