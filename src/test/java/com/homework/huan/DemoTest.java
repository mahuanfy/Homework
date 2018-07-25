package com.homework.huan;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class DemoTest {
    Demo demoTest = new Demo();
    @Test
    public void test_a_add_b(){
        int a = 2;
        int b = 3;
        assertThat(demoTest.addab(a,b),is(5));
    }
    @Test
    public void test_a_add_b2(){
        int a = 2;
        int b = 5;
        assertEquals(demoTest.addab(a,b),7);
    }
    @Test
    public void test_a_add_b3(){
        int a = 9;
        int b = 11;
        assertEquals(demoTest.addab(a,b),20);
    }
}