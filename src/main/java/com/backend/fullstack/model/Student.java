package com.backend.fullstack.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int roll_no;

    private String name;

    private String surname;

    private int percentage;
}
