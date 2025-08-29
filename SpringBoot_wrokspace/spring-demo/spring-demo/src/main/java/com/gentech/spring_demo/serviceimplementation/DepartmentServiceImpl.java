package com.gentech.spring_demo.serviceimplementation;

import com.gentech.spring_demo.entity.Department;
import com.gentech.spring_demo.exception.ResourceNotFoundException;
import com.gentech.spring_demo.repository.DepartmentRepository;
import com.gentech.spring_demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository deptRepo;

    @Override
    public Department createDepartment(Department department) {
        return deptRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return deptRepo.findAll();
    }

    @Override
    public Department getDepartment(Integer id) {
//        Optional<Department> dept=deptRepo.findById(id);
//        return dept.get();
        return deptRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The department id= "+id+" is not found"));
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
//        Optional<Department> optionaldept=deptRepo.findById(id);
//        Department dept= optionaldept.get();
          Department dept= deptRepo.findById(id).orElseThrow(() ->
                  new ResourceNotFoundException("The department id= "+id+" is not found"));
        dept.setId(id);
        dept.setDname(department.getDname());
        dept.setLoc(department.getLoc());
        return deptRepo.save(dept);
    }

    @Override
    public void deleteDepartment(Integer id) {
//        Optional<Department> optionaldept=deptRepo.findById(id);
//        Department dept= optionaldept.get();
        Department dept=deptRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The department id= "+id+" is not found"));
        deptRepo.delete(dept);
    }


}
