package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE;
    Instructor teacher0 = new Instructor(10l, "Kris");
    Instructor teacher1 = new Instructor(9l, "Roberto");
    Instructor teacher2 = new Instructor(8l, "Nobles");
    Instructor teacher3 = new Instructor(7l, "Dolio");

    private Instructors(){
        addPerson(teacher0);
        addPerson(teacher1);
        addPerson(teacher2);
        addPerson(teacher3);
    }

    static{
        try{
            INSTANCE = new Instructors();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

}
