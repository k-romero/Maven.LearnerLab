package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestZipCodeWilmington {

    @Test
    public void testHostLecture(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getINSTANCE();
        zcw.hostLecture(zcw.instructors.findById(10l),70.0);
        Assert.assertTrue(zcw.students.student0.getTotalStudyTIme() == 10.0);
    }

    @Test
    public void testHostLectureById(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getINSTANCE();
        zcw.hostLectureById(10l,70.0);
        Assert.assertTrue(zcw.students.student0.getTotalStudyTIme() == 10.0);
    }

    @Test
    public void testGetStudyMap(){
        ZipCodeWilmington zcw = ZipCodeWilmington.getINSTANCE();
        zcw.hostLectureById(10l,70.0);
        HashMap<Student,Double> studyMap = zcw.getStudyMap();
        Assert.assertTrue(studyMap.get(zcw.students.student0) == 10.0);
    }
}
