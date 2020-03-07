package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numOfHours){
        Learner[] learners = new Learner[students.getPeople()];
        learners[0] = students.student0;
        learners[1] = students.student1;
        learners[2] = students.student2;
        learners[3] = students.student3;
        learners[4] = students.student4;
        learners[5] = students.student5;
        learners[6] = students.student6;
        teacher.lecture(learners,numOfHours);
    }

    public void hostLectureById(Long id, double numOfHours){
        Teacher teacher = (Teacher) instructors.findById(id);
        Learner[] learners = new Learner[students.getPeople()];
        learners[0] = students.student0;
        learners[1] = students.student1;
        learners[2] = students.student2;
        learners[3] = students.student3;
        learners[4] = students.student4;
        learners[5] = students.student5;
        learners[6] = students.student6;
        teacher.lecture(learners,numOfHours);
    }

    public HashMap<Student,Double> getStudyMap(){
        HashMap<Student,Double> studyMap = new HashMap<Student, Double>();
        studyMap.put(students.student0,students.student0.getTotalStudyTIme());
        studyMap.put(students.student1,students.student1.getTotalStudyTIme());
        studyMap.put(students.student2,students.student2.getTotalStudyTIme());
        studyMap.put(students.student3,students.student3.getTotalStudyTIme());
        studyMap.put(students.student4,students.student4.getTotalStudyTIme());
        studyMap.put(students.student5,students.student5.getTotalStudyTIme());
        studyMap.put(students.student6,students.student6.getTotalStudyTIme());
        return studyMap;
    }
}




