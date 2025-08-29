package com.gentech.demo;

public class Employee {
    private int empId;
    private String firstName;
    private String Designation;
    private String Branch;

    public Employee()
    {

    }

    public Employee(int empId, String firstName, String designation, String branch) {
        this.empId = empId;
        this.firstName = firstName;
        Designation = designation;
        Branch = branch;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}