package RESTAssured_authentication;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Authentication_preemptive extends BaseClass{

    @Test(priority = 0)
    public void method1() {

        int code = RestAssured.given().auth().preemptive().basic("user", "pas").when().get("https://authenticationtest.com/HTTPAuth/ ").getStatusCode();
        System.out.println("Response code is: " + code);
    }

    @Test(priority = 1)
    public void method2() {

        int code = RestAssured.given().auth().preemptive().basic("user", "pass").when().get("https://authenticationtest.com/HTTPAuth/").getStatusCode();
        System.out.println("Response code is: " + code);
    }

    @Test(priority = 2)
    public void savingCredentialInAnotherClass() {

        int code = RestAssured.given().get("https://authenticationtest.com/HTTPAuth/").getStatusCode();
        System.out.println("Response code is: " + code);
    }

    @Test(priority = 3)
    public void savingCredentialAndBaseURIInAnotherClass() {

        int code = RestAssured.given().get().getStatusCode();
        System.out.println("Response code is: " + code);
    }

}
