package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void should_return_introduce_when_introduce() {
        //given
        Student student = new Student(21,"Tom",1);
        //when
        String result = student.introduce();
        //then
        assertEquals(result,"My name is Tom.I am 21 years old.I am a Student of Class 1.");
}

}
