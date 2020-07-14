package com.thoughtworks.basic;

public class Teacher extends Person {
    public  Teacher(int age, String name,String job) {
        super(age, name);
        this.job=job;
    }

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String introduce() {
        return "My name is " + getName() + ".I am " + getAge() + " years old.I am a "+getJob() +".";
    }
}
