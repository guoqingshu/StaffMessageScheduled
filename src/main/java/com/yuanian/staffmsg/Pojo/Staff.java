package com.yuanian.staffmsg.Pojo;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {

    private int id;
    private int usercode;
    private String username;
    private String department;
    private java.sql.Date hiredate;

    public Staff() {
    }

    public Staff(int id,int usercode, String username, String department, java.sql.Date hiredate) {
        this.id=id;
        this.usercode = usercode;
        this.username = username;
        this.department = department;
        this.hiredate = hiredate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsercode() {
        return usercode;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(java.sql.Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", usercode=" + usercode +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                ", hiredate=" + hiredate +
                '}';
    }
}
