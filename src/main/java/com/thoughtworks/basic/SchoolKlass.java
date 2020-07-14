package com.thoughtworks.basic;

import java.util.List;

public class SchoolKlass {
    private int classNumber;
    private List<Student> students;
    private Teacher teacher;

    public SchoolKlass(int classNumber, List<Student> students, Teacher teacher) {
        this.classNumber = classNumber;
        this.students = students;
        this.teacher = teacher;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        sendMessage(student.introduce()+"now");
    }

    private void sendMessage(String message) {
        for (Student student1 : this.students){
            student1.getMessage(message);
        }
        teacher.getMessage(message);

    }
}
