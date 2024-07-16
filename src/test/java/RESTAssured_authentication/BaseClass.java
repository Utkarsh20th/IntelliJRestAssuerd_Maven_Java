package RESTAssured_authentication;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    @BeforeClass
    public void setup(){
        RestAssured.authentication = RestAssured.preemptive().basic("user", "pass");
        RestAssured.baseURI = "https://authenticationtest.com/HTTPAuth/";

    }

}
