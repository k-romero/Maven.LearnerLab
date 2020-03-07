package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    public double totalStudyTime;


    public Student(Long id, String name) {
        super(id, name);
        this.totalStudyTime = 0;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTIme() {
        return totalStudyTime;
    }

}
