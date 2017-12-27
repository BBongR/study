package com.example.suv12.customview;

import android.graphics.drawable.Drawable;

/**
 * Created by suv12 on 2017-12-27.
 */

public class PersonData {

    private Drawable photo;
    private String name;
    private int age;

    // getter & setter
    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
        return "PersonData{" +
                "photo=" + photo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // constructor
    public PersonData() { }

    public PersonData(Drawable photo, String name, int age) {
        this.photo = photo;
        this.name = name;
        this.age = age;
    }
}
