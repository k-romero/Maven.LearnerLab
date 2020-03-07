package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    public Students students;
    public Instructors instructors = Instructors.getInstance();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public ZipCodeWilmington() {
        students = Students.getInstance();
    }

    public void hostLecture(Instructor teacher, double numOfHours){
        teacher.lecture(students.getArray(),numOfHours);
    }

    public void hostLectureById(Long id, double numOfHours){
        Instructor teacher = instructors.findById(id);
        teacher.lecture(students.getArray(),numOfHours);
    }

    public HashMap<Student,Double> getStudyMap(){
        HashMap<Student,Double> studyMap = new HashMap<Student, Double>();
        for (Student s : students.getArray()) {
            studyMap.put(s,s.getTotalStudyTIme());
        }
        return studyMap;
    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }
}




