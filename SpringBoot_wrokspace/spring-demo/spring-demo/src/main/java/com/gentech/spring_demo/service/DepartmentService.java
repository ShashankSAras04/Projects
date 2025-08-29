package com.gentech.spring_demo.service;

import com.gentech.spring_demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);

    List<Department> getAllDepartments();

    Department getDepartment(Integer id);

    Department updateDepartment(Integer id,Department department);

    void deleteDepartment(Integer id);
}
