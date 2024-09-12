package org.example.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG00 {


@Test
    public void Testcase1(){
    Assert.assertEquals(true,true);
    }


    @Test
    public void Testcase2(){
        Assert.assertEquals(false,true);
    }
}
