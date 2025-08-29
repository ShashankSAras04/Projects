package com.gentech.spring_demo.repository;

import com.gentech.spring_demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
