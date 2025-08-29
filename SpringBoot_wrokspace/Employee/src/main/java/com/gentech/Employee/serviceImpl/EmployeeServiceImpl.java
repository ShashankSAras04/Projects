package com.gentech.Employee.serviceImpl;

import com.gentech.Employee.dto.EmployeeDto;
import com.gentech.Employee.entity.Employee;
import com.gentech.Employee.exception.ResourceNotFoundException;
import com.gentech.Employee.mapper.EmployeeMapper;
import com.gentech.Employee.repository.EmployeeRepository;
import com.gentech.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
    public class EmployeeServiceImpl implements EmployeeService
    {
        @Autowired
        private EmployeeRepository repository;

        @Override
        public EmployeeDto createEmployee(EmployeeDto employeeDto)
        {
            Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
            Employee savedEmployee=repository.save(employee);
            return EmployeeMapper.mapToEmployeeDto(savedEmployee);
        }

        @Override
        public EmployeeDto getEmployee(Integer id)
        {
            Employee employee=repository.findById(id).orElseThrow(() ->
                    new ResourceNotFoundException("the employee id "+id+" has not found "));
            return EmployeeMapper.mapToEmployeeDto(employee);
        }

        @Override
        public List<EmployeeDto> getAllEmployee()
        {

            return repository.findAll().stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                    .collect(Collectors.toList());
        }

        @Override
        public List<EmployeeDto> getAllEmployee(int pageNumber, int pageSize) {
            Pageable pageable= PageRequest.of(pageNumber, pageSize);
            return repository.findAll(pageable).getContent().stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                    .collect(Collectors.toList());
        }

        @Override
        public List<EmployeeDto> getAllEmployee(String columnName) {
            Sort sort=Sort.by(Sort.Direction.ASC,columnName);
            return repository.findAll(sort).stream().map((employee -> EmployeeMapper.mapToEmployeeDto(employee)))
                    .collect(Collectors.toList());
        }

        @Override
        public EmployeeDto updateEmployee(Integer id, EmployeeDto employeeDto)
        {
            Employee employee=repository.findById(id).orElseThrow(() ->
                    new ResourceNotFoundException("the Employee id "+id+" has not found"));
            employee.setId(id);
            employee.setEname(employeeDto.getEname());
            employee.setEmailid(employeeDto.getEmailid());
            employee.setJobName(employeeDto.getJobName());
            employee.setSalary(employeeDto.getSalary());
            employee.setCityName(employeeDto.getCityName());
            employee.setStateName(employeeDto.getStateName());

            Employee saveEmployee=repository.save(employee);

            return EmployeeMapper.mapToEmployeeDto(saveEmployee);
        }

        @Override
        public void deleteEmployee(Integer employeeId)
        {
            Employee employee=repository.findById(employeeId).orElseThrow(()->
                    new ResourceNotFoundException("the employee id "+employeeId+"has not found"));
            repository.delete(employee);
        }

        @Override
        public List<EmployeeDto> getEmployeeByJobName(String name)
        {

            return repository.findByJobName(name).stream().map(employee -> EmployeeMapper.mapToEmployeeDto(employee))
                    .collect(Collectors.toList());
        }

        @Override
        public List<EmployeeDto> getEmployeesByCityNameAndStateName(String city, String state)
        {
            return repository.findByCityNameAndStateName(city,state).stream().map(employee -> EmployeeMapper.mapToEmployeeDto(employee))
                    .collect(Collectors.toList());
        }

        @Override
        public List<EmployeeDto> getEmployeesByEmailidKeyword(String emailKeyword)
        {
            return repository.findByEmailidContaining(emailKeyword).stream().map(employee -> EmployeeMapper.mapToEmployeeDto(employee))
                    .collect(Collectors.toList());
        }

        @Override
        public List<EmployeeDto> getEmployeesByJobNameOrCityName(String jobName, String cityName) {
            return repository.getEmployeesByJobNameOrCityName(jobName,cityName).stream().map(employee -> EmployeeMapper.mapToEmployeeDto(employee))
                    .collect(Collectors.toList());
        }

        @Override
        public int updateEmployeesByStateName(String stateName, Integer id) {

            return repository.updateEmployeesByStateName(stateName,id);
        }
    }


