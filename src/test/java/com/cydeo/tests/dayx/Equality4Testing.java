package com.cydeo.tests.dayx;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 7/30/2024
 * @project playwright-with-java
 */
public class Equality4Testing {
    @Test
    public void test01(){
        int num=5;
        Assertions.assertEquals(num,5);
    }

    @Test
    public void test02(){
        int num=6;
        Assertions.assertEquals(num,6);
    }

    @Test
    public void test03(){
        int num=7;
        Assertions.assertEquals(num+1,8);
    }

    @Test
    public void test04(){
        int num=8;
        Assertions.assertEquals(num+1,9);
    }
}
