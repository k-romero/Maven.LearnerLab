package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        zcw.hostLecture(zcw.instructors.teacher0,70.0);
        Assert.assertTrue(zcw.students.student0.getTotalStudyTIme() == 10.0);
    }

    @Test
    public void testHostLectureById(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        zcw.hostLectureById(10l,70.0);
        Assert.assertTrue(zcw.students.student0.getTotalStudyTIme() == 10.0);
    }

    @Test
    public void testGetStudyMap(){
        ZipCodeWilmington zcw = new ZipCodeWilmington();
        zcw.hostLectureById(10l,70.0);
        HashMap<Student,Double> studyMap = zcw.getStudyMap();
        Assert.assertTrue(studyMap.get(zcw.students.student0) == 10.0);
    }
}
