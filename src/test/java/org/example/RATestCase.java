package org.example;

import io.restassured.RestAssured;

public class RATestCase {
    public static void main(String[] args) {
        //Need
        //1.Get request -http://api.zippoptam.us/IN/757001
        //2.URL -no
        //3.HEADERS -NO
        //4.Get Method -Yes
        //5.base uri - http://api.zippoptam.us
        //6.base path -/IN/757001
        //7.payload - no
        //Authentication - Basic, Digest, JWT,Bearer Token,OAuth 2.0 - no


        //What you want to validate? -status code ,Response body, Time ,Headers ,Cookies

        //Gherkin syn text --> Given, when , then -> it is just a style of BBD not a BBD framework

        //RestAssured.given().when().then() -DSL(Domain specific language)(in java only)

        //given() ->under come(URL,Headers,base url,base path,Authentication)

        //when() ->under come(payload,Get Method)

        //then() ->under come(Response,validation ,status code ,Response body, Time ,Headers ,Cookies)

        RestAssured
                .given()
                .baseUri("http://api.zippoptam.us").basePath("/IN/757001")

                .when()
                .get()

                .then().statusCode(200);

        RestAssured
                .given()
                .baseUri("http://api.zippoptam.us").basePath("/IN/757001")

                .when().log().all()
                .get()

                .then().log().all().statusCode(201);

    }
}
