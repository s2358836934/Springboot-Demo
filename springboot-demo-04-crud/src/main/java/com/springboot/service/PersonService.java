package com.springboot.service;

import com.springboot.domain.Person;
import java.util.List;

public interface PersonService {

    public List<Person> showPerson();

    void add(Person person);

    void update(Person person);

    Person getP(String name);

    void delete(String name);
}
