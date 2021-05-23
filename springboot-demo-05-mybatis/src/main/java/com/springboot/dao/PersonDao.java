package com.springboot.dao;

import com.springboot.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface PersonDao {


    public ArrayList<Person> listPerson();
}
