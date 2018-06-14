package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TreePracticeTest {

    @BeforeMethod
    public void setUp() throws Exception {
    }

    @AfterMethod
    public void tearDown() throws Exception {
    }
    @Test
    public void treeTest(){
        int l[]={12,32,14,53,65,12,23,5,7,2,35,87,21,154,31,55};
        TreePractice.create(l);
    }
    @Test
    public void testCreate() throws Exception {
    }

    @Test
    public void testInsert() throws Exception {
    }

    @Test
    public void testErgodic() throws Exception {
    }
}