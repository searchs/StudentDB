package com.ohprice.edurapps;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    Student student = new Student();


    @Test
    public void testEnroll() throws Exception {
        student.enroll();
    }

    @Test
    public void testToString() throws Exception {
        String result = student.toString();
        Assert.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme