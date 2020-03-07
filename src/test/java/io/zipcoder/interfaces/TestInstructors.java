package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void testGetInstructors(){
        Instructors instructors = Instructors.getInstance();
        Assert.assertTrue(instructors.getArray().length == 4);
    }
}
