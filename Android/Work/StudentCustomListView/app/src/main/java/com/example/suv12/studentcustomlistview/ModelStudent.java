package com.example.suv12.studentcustomlistview;

/**
 * Created by suv12 on 2018-01-01.
 */

public class ModelStudent {

    private String name;
    private String number;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ModelStudent{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public ModelStudent() {
    }

    public ModelStudent(String name, String number, String department) {
        this.name = name;
        this.number = number;
        this.department = department;
    }
}
