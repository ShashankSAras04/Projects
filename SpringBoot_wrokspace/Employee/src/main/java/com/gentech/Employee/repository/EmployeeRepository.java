package com.gentech.Employee.repository;

import com.gentech.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByJobName(String name);

    List<Employee> findByCityNameAndStateName(String cityName, String stateName);

    List<Employee> findByEmailidContaining(String keyword);

    @Query("FROM Employee Where jobName=:jobName OR cityName=:cityName")
    List<Employee> getEmployeesByJobNameOrCityName(@Param("jobName") String jobName, @Param("cityName") String cityName);

    @Transactional
    @Modifying
    @Query("Update Employee Set stateName=:stateName Where id=:id")
    int updateEmployeesByStateName(@Param("stateName") String stateName, @Param("id") Integer id);
}
