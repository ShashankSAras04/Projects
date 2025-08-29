package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent()
    {
        Student student=new Student(101,"Veena","Computers","Bangalore");
        return student;
    }
    @GetMapping("/student1")
    public Student getStudent1()
    {
       Student student=new Student();
       student.setRollNo(102);
       student.setFirstName("Vinith");
       student.setCourseName("Research");
       student.setCityName("Dallas");
       return student;
    }
    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        List<Student> students =new ArrayList<>();
        students.add(new Student(103,"Manju","Service Engineer","Gadag"));
        students.add(new Student(104,"Adi","Research","Mangalore"));
        return students;
    }
}
