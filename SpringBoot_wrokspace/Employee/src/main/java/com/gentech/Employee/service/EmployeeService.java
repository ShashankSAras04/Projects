package com.gentech.Employee.service;

import com.gentech.Employee.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService
    {
        EmployeeDto createEmployee(EmployeeDto employeeDto);

        EmployeeDto getEmployee(Integer id);

        List<EmployeeDto> getAllEmployee();

        List<EmployeeDto> getAllEmployee(int pageNumber, int pageSize);

        List<EmployeeDto> getAllEmployee(String columnName);

        EmployeeDto updateEmployee(Integer id,EmployeeDto employeeDto);

        void deleteEmployee(Integer employeeId);

        List<EmployeeDto> getEmployeeByJobName(String name);

        List<EmployeeDto> getEmployeesByCityNameAndStateName(String city,String state);

        List<EmployeeDto> getEmployeesByEmailidKeyword(String emailKeyword);

        List<EmployeeDto> getEmployeesByJobNameOrCityName( String jobName, String cityName);

        int updateEmployeesByStateName( String stateName, Integer id);
    }

