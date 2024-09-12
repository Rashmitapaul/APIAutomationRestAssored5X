package org.example.testng;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test004 {
    // PUT
    String token;
    Integer bookingID;


    public String getToken() {
        token = "123";//This is called 1st
        return token;
    }

    @BeforeTest
    public void getTokenAndBookingID() {
        token = getToken();
        // POST Req -
        // POST code
        bookingID = 123;//This is called 2nd
    }


    @Test
    public void testPUTReq() {
        System.out.println(token);
        System.out.println(bookingID);//This is called 3rd
    }

    @Test
    public void testPUTReq2() {
        System.out.println(token);
        System.out.println(bookingID);
    }

    @Test
    public void testPUTReq3() {
        System.out.println(token);
        System.out.println(bookingID);
    }
}
