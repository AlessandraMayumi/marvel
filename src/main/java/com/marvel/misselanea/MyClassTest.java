package com.marvel.misselanea;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void validateGrade() {
        MyClass myClass = new MyClass();
        assertEquals(11, myClass.processGrade());
    }
}
