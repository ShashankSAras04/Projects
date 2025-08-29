package com.gentech.spring_demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "tbl_department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_no")
    private Integer id;

    @Column(name = "department_name")
    private String dname;

    @Column(name = "department_location")
    private String loc;

    public Department(){

    }
    public Department(Integer id, String loc, String dname) {
        this.id = id;
        this.loc = loc;
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getLoc() {
        return loc;
    }

    public String getDname() {
        return dname;
    }
}
