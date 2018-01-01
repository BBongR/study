package com.example.suv12.customlistview;

/**
 * Created by suv12 on 2017-12-29.
 */

public class PersonData {

    public String name;
    public String dept;
    public int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PersonData() {}

    public PersonData(String name, String dept, int number) {
        this.name = name;
        this.dept = dept;
        this.number = number;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", number=" + number +
                '}';
    }
}
