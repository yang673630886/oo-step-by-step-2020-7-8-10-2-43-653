package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void should_return_introduce_then_introduce() {
        //given
        Teacher teacher = new Teacher (30,"Matt","Teacher");
        //when
        String result = teacher.introduce();
        //then
        assertEquals(result,"My name is Matt.I am 30 years old.I am a Teacher.");
    }
}
