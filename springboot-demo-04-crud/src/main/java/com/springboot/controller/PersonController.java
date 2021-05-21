package com.springboot.controller;

import com.springboot.domain.Person;
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
    public String showPerosn(Model model){
        ArrayList<Person> personArrayList = (ArrayList<Person>) ps.showPerson();
        System.out.println(personArrayList);
        model.addAttribute(personArrayList);
        return "index";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("/add")
    public String add(Person p){
        ps.add(p);
        return "redirect:list";
    }


    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,String name){
        Person person = ps.getP(name);
        System.out.println(person);
        model.addAttribute("person",person);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Person p){
        ps.update(p);
        return "redirect:list";
    }


    @RequestMapping("/delete")
    public String delete(String name){
        System.out.println(name);
        ps.delete(name);
        return "redirect:list";
    }


}
