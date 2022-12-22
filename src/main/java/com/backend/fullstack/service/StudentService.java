package com.backend.fullstack.service;

import com.backend.fullstack.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentService {

   private static List<Student> list=new ArrayList<>();

    static {
        list.add(new Student(1,"prathamesh","bhalwane",80));
        list.add(new Student(2,"akash","kawade",70));
        list.add(new Student(3,"sharan","shingnapure",60));
        list.add(new Student(4,"abc","xyz",50));
    }

    public List<Student> getAllStudent(){
        return list;
    }


    public Student getStudentByName(String name){
       return list.stream().filter(student -> student.getName().equals(name)).collect(Collectors.toList()).get(0);
    }

    public Student addStudent(Student student){
        list.add(student);
        return student;
    }

    public String deleteStudent(String name){
        list.remove(list.stream().filter(student -> student.getName().equals(name)).collect(Collectors.toList()).get(0));
      return name;
    }
}
