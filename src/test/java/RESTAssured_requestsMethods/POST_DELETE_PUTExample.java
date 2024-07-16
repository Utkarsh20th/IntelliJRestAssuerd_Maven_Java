package RESTAssured_requestsMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class POST_DELETE_PUTExample {

    @Test(priority=0)
    public void POST_operation() throws Exception{

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("id", "223");
        json.put("title", "A title# 223");
        json.put("views", "223");

        request.body(json.toJSONString());

        Response resp = request.post("http://localhost:3000/posts");
        int code = resp.getStatusCode();
        System. out.println("POST status code is: " + code);
//        Assert.assertEquals(code, 201);
        Thread.sleep(10000);
    }

    @Test(priority = 1)
    public void PUT_operation() throws Exception{

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject json = new JSONObject();
        json.put("id", "223");
        json.put("title", "A title# 223 - Utkarsh");
        json.put("views", "223");

        request.body(json.toJSONString());

        Response resp = request.put("http://localhost:3000/posts/223");
        int code = resp.getStatusCode();
        System. out.println("PUT status code is: " + code);
//        Assert.assertEquals(code, 200);
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    public void DELETE_operation() throws Exception{

        RequestSpecification request = RestAssured.given();

        Response resp = request.delete("http://localhost:3000/posts/223");
        int code = resp.getStatusCode();
        System. out.println("DELETE status code is: " + code);
//        Assert.assertEquals(code, 200);
        Thread.sleep(10000);
    }
}
