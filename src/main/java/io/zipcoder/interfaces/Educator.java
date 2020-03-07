package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    KRIS(new Instructor(10l, "Kris")),
    ROBERTO(new Instructor(9l, "Roberto")),
    NOBLES(new Instructor(8l, "Nobles")),
    DOLIO(new Instructor(7l, "Dolio"));

    final private Instructor instructor;
    private double timeWorked;

     Educator(Instructor instructor){
        this.instructor = instructor;
         this.timeWorked = 0.0;
    }
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner l : learners) {
            l.learn(numOfHoursPerLearner);
        }
        this.timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
