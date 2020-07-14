package com.thoughtworks.basic;

public class Student extends Person{
    public Student(int age, String name) {
        super(age, name);
    }
    private SchoolKlass classNum;

    public SchoolKlass getClassNum() {
        return classNum;
    }

    public void setClassNum(SchoolKlass classNum) {
        this.classNum = classNum;
    }




    @Override
    public String introduce() {
        return  "My name is " + getName() + ".I am " + getAge() + " years old." + "I am a Student of Class " + this.classNum.getClassNumber() + ".";
    }
}
