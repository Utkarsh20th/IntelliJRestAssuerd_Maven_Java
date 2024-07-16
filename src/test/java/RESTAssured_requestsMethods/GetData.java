package RESTAssured_requestsMethods;

import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetData {

    @Test(priority = 0)
    public void getResponseCode() {

        Response resp = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=834acf12037a4c05d5ec4c9c1b61d00c");
        int code = resp.getStatusCode();

        System.out.println("Status code is: " + code);

        Assert.assertEquals(code, 200);

    }

    @Test(priority = 1)
    public void testBody() {
        Response resp = RestAssured.get("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=834acf12037a4c05d5ec4c9c1b61d00c");
        String respBody = resp.asString();

        System.out.println("Response body data is: " + respBody);
        System.out.println("Response time is: " + resp.getTime() + " milliseconds");
    }

}