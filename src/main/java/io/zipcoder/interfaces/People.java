package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{
    private List<Person> myPeople;

    public People() {
        this.myPeople = new ArrayList<Person>();
    }

    public void addPerson(Person person){
        myPeople.add(person);
    }

    public Person findById(Long id){
        Person result = new Person(0l,"");
        for (Person p: myPeople) {
            if(p.getId() == id){
                result = p;

            }
        }
        return result;
    }

    public int getPeople(){
        return myPeople.size();
    }

    public boolean contains(Person p){
        return myPeople.contains(p);
    }

    public void remove(Student student2) {
        myPeople.remove(student2);
    }

    public void removeById(long l) {
        Person temp = new Person(0l,"");
        for (Person p : myPeople) {
            if(p.getId() == l) {
                temp = p;
            }
        }
        myPeople.remove(temp);
    }


    public void removeAll() {
        myPeople.clear();
    }

    public Iterator iterator() {
        Iterator<Person> iterator = myPeople.iterator();
        return iterator;
    }
}
