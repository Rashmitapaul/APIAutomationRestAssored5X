package org.example.testng;

import org.testng.annotations.Test;

public class Test012 {

    @Test(groups = { "init" },priority = 1)
    public void getToken() {
        System.out.println("serverStartedOk");
    }

    @Test(groups = { "init" },priority = 2, enabled = false)
    public void getBookingID() {
        System.out.println("initEnvironment");
    }


    @Test(dependsOnGroups = { "init.*" })
    public void testPutReq() {
        System.out.println("Now I will run");
    }
}
