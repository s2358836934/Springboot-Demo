package com.springboot.dao;

import com.springboot.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDao {

    private static List<Person> personList = new ArrayList<>();

    static{
        personList.add(new Person("喜","火之高兴"));
        personList.add(new Person("怒","学生"));
        personList.add(new Person("哀","霜之哀伤"));
        personList.add(new Person("乐","救世主"));
    }

    public List<Person> showPerson(){
        return personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public void update(Person person){
        Person oldPerson = this.getP(person.getName());
        if(oldPerson != null){
             oldPerson.setName(person.getName());
             oldPerson.setProfession(person.getProfession());
        }

    }

    public Person getP(String name){
        for(int i = 0; i < personList.size(); i++){
            if(personList.get(i).getName().equals(name)){
                return personList.get(i);
            }
        }
        return null;
    }

    public void delete(String name){
        for(int i = 0; i < personList.size(); i++){
            if(personList.get(i).getName().equals(name)){
                personList.remove(i);
            }
        }
    }

}
