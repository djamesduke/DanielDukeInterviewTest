package com.Duke.Test;

import com.jayway.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.jayway.restassured.RestAssured.given;

/**
 * Created by danield on 22/10/2016.
 * Could use a helper method if going to re-use
 */
public class Test2 {
//
//    Test 2
//    On the ClearScore login page (https://www.clearscore.com/account/login), write an API test to check that:
//             A failed login returns the correct API response (HTTP 403 error)
//


    @Test
    public void shouldReturnA403WithWhenFailedLogin() throws MalformedURLException {

        URL url = new URL("https://www.clearscore.com/account/login");

        Response response = given().get(url);

        response.then().assertThat().statusLine("403");

    }

    @Test
    public void shouldReturnA403WithWhenFailedLoginPOST() throws MalformedURLException {

        Response response = given()
                .body("{\"email\":\"jflksjfkl@google.com\",\"password\":\"sdlfjalfkl\"}")
                .header("Content-Type", "application/json")
                .when()
                .post("https://api.clearscore.com/caesium-api/users/signIn");

        response.then().assertThat().statusCode(403);

    }





}
