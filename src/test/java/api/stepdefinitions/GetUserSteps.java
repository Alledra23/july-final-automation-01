package api.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetUserSteps {

    Response response;
    String userId;

    @Given("user has valid user id")
    public void userHasValidUserId() {
        userId = "60d0fe4f5311236168a109ca";
    }

    @When("user sends GET request")
    public void userSendsGetRequest() {

        response =
                given()
                        .header("app-id",
                                "63a804408eb0cb069b57e43a")
                        .when()
                        .get("https://dummyapi.io/data/v1/user/" + userId);
    }

    @Then("response status code should be 200")
    public void responseStatusCodeShouldBe200() {
        response.then().statusCode(200);
    }

    @Then("response contains firstName")
    public void responseContainsFirstName() {

        String firstName =
                response.jsonPath().getString("firstName");

        assert firstName != null;
    }
}