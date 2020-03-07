package io.zipcoder.interfaces;

import java.util.Iterator;

public final class Students extends People<Student> {
    private static final Students INSTANCE;
    Student student0 = new Student(0l, "a");
    Student student1 = new Student(1l, "b");
    Student student2 = new Student(2l, "c");
    Student student3 = new Student(3l, "d");
    Student student4 = new Student(4l, "e");
    Student student5 = new Student(5l, "f");
    Student student6 = new Student(6l, "g");



    private Students(){
        addPerson(student0);
        addPerson(student1);
        addPerson(student2);
        addPerson(student3);
        addPerson(student4);
        addPerson(student5);
        addPerson(student6);
    }

    public Student[] getArray() {
        Iterator<Student> iterator = iterator();
        Student[] studentsArray = new Student[this.getPeople()];
        for (int i = 0; i < this.getPeople(); i++) {
            studentsArray[i] = iterator.next();
        }
        return studentsArray;
    }

    static{
        try{
            INSTANCE  = new Students();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }


}
