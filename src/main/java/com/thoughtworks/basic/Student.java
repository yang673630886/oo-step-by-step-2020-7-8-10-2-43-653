package com.thoughtworks.basic;

public class Student extends Person{
    public Student(int age, String name, int classNum) {
        super(age, name);
    }
    private int classNum;

    @Override
    public String introduce() {
        return  "My name is Tom.I am 21 years old.I am a Student of Class 1.";
    }
}
