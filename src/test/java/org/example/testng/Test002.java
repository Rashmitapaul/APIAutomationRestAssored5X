package org.example.testng;

import org.testng.annotations.*;

public class Test002 {
    @BeforeSuite
    void demo1(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    void demo4(){
        //Read excel file
        //Text file,json,csv,data base
        //configuration load extract
        System.out.println("BeforeMethod");//@BeforeMethod is a step2
    }
    @Test
    void demo55(){
        System.out.println("Test1");//@TEST is a step 1
    }



    @AfterMethod
    void demo5(){
        //Close the files->here write the code
        System.out.println("AfterMethod");//@AfterMethod is a step3
    }

    @AfterClass
    void demo6(){
        System.out.println("AfterClass");
    }
    @AfterTest
    void demo7(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo8(){
        System.out.println("AfterSuite");
    }


}
