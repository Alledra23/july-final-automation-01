package api.stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DeleteUserSteps {

    Response response;
    String userId;

    @Given("user has existing user id for deletion")
    public void userHasExistingUserIdForDeletion() {

        userId = "60d0fe4f5311236168a109ca";
    }

    @When("user sends DELETE request")
    public void userSendsDELETERequest() {

        response =
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .when()
                        .delete("https://dummyapi.io/data/v1/user/" + userId);
    }

    @Then("response status code should be 200")
    public void responseStatusCodeShouldBe200() {

        response.then().statusCode(200);
    }
}