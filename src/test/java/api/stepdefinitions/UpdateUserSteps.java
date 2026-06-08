package api.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class UpdateUserSteps {

    Response response;
    String userId;
    Map<String, String> requestBody;

    @Given("user has existing user id")
    public void userHasExistingUserId() {

        userId = "60d0fe4f5311236168a109ca";

        requestBody = new HashMap<>();
        requestBody.put("firstName", "UpdatedName");
    }

    @When("user sends PUT request")
    public void userSendsPUTRequest() {

        response =
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .put("https://dummyapi.io/data/v1/user/" + userId);
    }

    @Then("user firstName should be updated")
    public void userFirstNameShouldBeUpdated() {

        String firstName =
                response.jsonPath().getString("firstName");

        assertEquals(firstName, "UpdatedName");
    }
}