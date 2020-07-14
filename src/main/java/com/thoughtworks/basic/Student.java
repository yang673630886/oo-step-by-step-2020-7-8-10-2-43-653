package com.thoughtworks.basic;

public class Student extends Person{
    public Student(int age, String name, int classNum) {
        super(age, name);
        this.classNum = classNum;
    }
    private int classNum;

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + getClassNum() + ".";
    }
}
