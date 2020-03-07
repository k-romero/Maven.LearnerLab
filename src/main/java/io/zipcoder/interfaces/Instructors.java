package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE;

    static{
        try{
            INSTANCE = new Instructors();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private Instructors(){
        addPerson(new Instructor(10l,"Kris"));
        addPerson(new Instructor(9l,"Roberto"));
        addPerson(new Instructor(8l,"Nobles"));
        addPerson(new Instructor(7l,"Dolio"));
    }

    public Instructor[] getArray() {
        Iterator<Instructor> iterator = iterator();
        Instructor[] instructors = new Instructor[this.getPeople()];
        for (int i = 0; i < this.getPeople(); i++) {
            instructors[i] = iterator.next();
        }
        return instructors;
    }




    public static Instructors getInstance(){
        return INSTANCE;
    }

}
