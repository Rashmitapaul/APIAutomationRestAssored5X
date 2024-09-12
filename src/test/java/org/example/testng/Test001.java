package org.example.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test001 {
    @BeforeMethod
    void demo4(){
        //Read excel file
        //Text file,json,csv,data base
        //configuration load extract
        System.out.println("BeforeMethod");//@BeforeMethod is a step2
    }
    @Test
    void demo5(){
        System.out.println("Test1");//@TEST is a step 1
    }
    @Test
    void demo55(){
        System.out.println("Test2");//@TEST is a step 4
    }

    @AfterMethod
    void demo6(){
        //Close the files->here write the code
        System.out.println("AfterMethod");//@AfterMethod is a step3
    }

}
