package org.example.testng;

import org.testng.annotations.Test;

public class Test011 {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }


}
