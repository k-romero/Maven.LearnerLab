package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void testTeach(){
        Learner newStudent = new Student(19l,"Guy");
        Educator.NOBLES.teach(newStudent,10.0);
        Educator.KRIS.teach(newStudent,12.0);
        Educator.DOLIO.teach(newStudent,14.0);
        Educator.ROBERTO.teach(newStudent,16.0);
        Assert.assertTrue(Educator.NOBLES.getTimeWorked() == 10.0);
        Assert.assertTrue(Educator.KRIS.getTimeWorked() == 12.0);
        Assert.assertTrue(Educator.DOLIO.getTimeWorked() == 14.0);
        Assert.assertTrue(Educator.ROBERTO.getTimeWorked() == 16.0);
    }

    @Test
    public void testLecture(){
        Learner[] learners = new Learner[]{
                new Student(19l,"Guy"),
                new Student(18l,"Gal")
        };
        Educator.NOBLES.lecture(learners,10.0);
        Assert.assertTrue(Educator.NOBLES.getTimeWorked() == 10.0);
        Assert.assertTrue(learners[0].getTotalStudyTIme() == 5.0);
    }
}
