package com.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Person {

    private Integer id;
    private String name;
    private String profession;
}
