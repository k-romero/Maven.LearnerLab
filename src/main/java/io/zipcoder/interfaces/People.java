package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable{

    private List<E> myPeople;

    public People() {
        this.myPeople = new ArrayList<E>();
    }

    public void addPerson(E person){
        myPeople.add(person);
    }

    public E findById(Long id){
        for (E p: myPeople) {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public int getPeople(){
        return myPeople.size();
    }

    public boolean contains(E p){
        return myPeople.contains(p);
    }

    public void remove(E person) {
        myPeople.remove(person);
    }

    public void removeById(long l) {
        for (E p : myPeople) {
            if(p.getId() == l) {
               E person = p;
               myPeople.remove(person);
               break;
            }
        }
    }

    public abstract E[] getArray();

    public void removeAll() {
        myPeople.clear();
    }

    public Iterator iterator() {
        Iterator<E> iterator = myPeople.iterator();
        return iterator;
    }
}
