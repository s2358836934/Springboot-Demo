package com.springboot.service.impl;

import com.springboot.dao.PersonDao;
import com.springboot.pojo.Person;
import com.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao pd;

    @Override
    public ArrayList<Person> listPerson() {
        return pd.listPerson();
    }
}
