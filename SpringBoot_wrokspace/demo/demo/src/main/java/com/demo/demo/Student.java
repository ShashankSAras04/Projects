package com.gentech.demo;

public class Student {
    private int rollNo;
    private String firstName;
    private String courseName;
    private String cityName;

    public Student(){

    }
    public Student(int rollNo,String firstName,String courseName,String cityName )
    {
        this.rollNo=rollNo;
        this.firstName=firstName;
        this.courseName=courseName;
        this.cityName=cityName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
