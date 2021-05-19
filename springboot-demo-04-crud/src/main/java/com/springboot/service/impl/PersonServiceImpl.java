package com.springboot.service.impl;

import com.springboot.dao.PersonDao;
import com.springboot.domain.Person;
import com.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao pd;

    @Override
    public List<Person> showPerson() {
        return pd.showPerson();
    }
}
