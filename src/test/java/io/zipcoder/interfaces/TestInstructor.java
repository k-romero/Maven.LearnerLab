package io.zipcoder.interfaces;

import com.sun.codemodel.internal.JForEach;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInstructor {
    Student student0;
    Student student1;
    Student student2;
    Student student3;
    Learner[] students;
    Instructor nobles;

    @Before
    public void setUp(){
        student0 = new Student(0l,"Kevin0");
        student1 = new Student(1l,"evin1");
        student2 = new Student(2l,"vin2");
        student3 = new Student(3l,"in3");
        students = new Student[4];
        students[0] = student0;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        nobles = new Instructor(100l, "Chris");
    }

    @Test
    public void teacherPersonInheritanceTest(){
        Assert.assertTrue(nobles instanceof Teacher);
        Assert.assertTrue(nobles instanceof Person);
    }

    @Test
    public void teachSingleStudentTest(){
        nobles.teach(student0,10.0);
        Assert.assertEquals(10.0, student0.getTotalStudyTIme(), .0);

    }

    @Test
    public void giveLectureTest(){
        nobles.lecture(students,40.0);
        double expected = 10.0;
        Assert.assertEquals(expected, student0.getTotalStudyTIme(), .0);
    }
}
