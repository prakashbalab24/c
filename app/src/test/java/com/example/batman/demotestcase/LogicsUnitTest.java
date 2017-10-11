package com.example.batman.demotestcase;
import android.content.Context;

import com.example.batman.demotestcase.business.Logics;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by batman on 11/10/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LogicsUnitTest {
    //Mocking Context
    @Mock
    Context mockContext;
    @Test
    public void testThisMethodTest(){
        //String will be null so we are returning own dummy String
        when(mockContext.getString(R.string.app_name))
                .thenReturn("DemoTestCase");
        //Checking both strings
       assertEquals("DemoTestCase",Logics.testThisMethod(mockContext));
    }
}
