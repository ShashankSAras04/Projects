package com.gentech.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @GetMapping("/Employee")
    public Employee getEmployee(){
        Employee Emp=new Employee(123,"Virat","Senior Manager","IT");
        return Emp;
    }
    @GetMapping("/Employee1")
    public Employee getEmployee1()
    {
        Employee Emp=new Employee();
        Emp.setEmpId(102);
        Emp.setFirstName("Vinith");
        Emp.setDesignation("Junior Developer");
        Emp.setBranch("IT");
        return Emp;
    }

    @GetMapping("/Employees")
    public List<Employee> getAllEmployees()
    {
        List<Employee> emp =new ArrayList<>();
        emp.add(new Employee(145,"Manju","Senior Engineer","Service"));
        emp.add(new Employee(104,"Adi","Employee","Finance"));
        emp.add(new Employee(234,"Akshara","Assistant","HR Dept"));
        return emp;
    }
}
