package com.springboot.controller;

import com.springboot.pojo.Person;
import com.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PersonController {

    @Autowired
    private PersonService ps;


    @RequestMapping("/list")
    public String list(Model model){
        ArrayList<Person> personArrayList = ps.listPerson();
        model.addAttribute("personList",personArrayList);
        return "index";
    }
}
