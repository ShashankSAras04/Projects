package com.gentech.spring_demo.controller;

import com.gentech.spring_demo.entity.Department;
import com.gentech.spring_demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org .springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("http://localhost:3000")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/departments")
     public ResponseEntity<Department> createDept(@RequestBody Department department)
    {
        return new ResponseEntity<>(deptService.createDepartment(department), HttpStatus.CREATED);
    }

    @GetMapping("/departments")
    public ResponseEntity<List<Department>> getDepartments()
    {
        return new ResponseEntity<>(deptService.getAllDepartments(),HttpStatus.OK);
    }

    @GetMapping("/departments/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Integer id)
    {
        return new ResponseEntity<>(deptService.getDepartment(id),HttpStatus.OK);
    }

    @PutMapping("/departments/{id}")
     public ResponseEntity<Department> modifyDepartment(@PathVariable Integer id ,@RequestBody Department department)
    {
        return new ResponseEntity<>(deptService.updateDepartment(id,department),HttpStatus.OK);
    }


    @DeleteMapping("/departments/{id}")
    public  ResponseEntity<String> removeDepartment(@PathVariable Integer id)
    {
        deptService.deleteDepartment(id);
        return new ResponseEntity<>("The Department with department id = "+id+" successfully deleted",HttpStatus.OK);
    }
}
