package api.stepdefinitions;

import io.cucumber.java.en.*;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class UpdateUserSteps {

    private final SharedContext context;
    String userId;
    Map<String, String> requestBody;

    public UpdateUserSteps(SharedContext context) {
        this.context = context;
    }

    @Given("user has existing user id")
    public void userHasExistingUserId() {
        userId = "60d0fe4f5311236168a109ca";
        requestBody = new HashMap<>();
        requestBody.put("firstName", "UpdatedName");
    }

    @When("user sends PUT request")
    public void userSendsPUTRequest() {
        context.setResponse(
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .put("https://dummyapi.io/data/v1/user/" + userId)
        );
    }

    @Then("user firstName should be updated")
    public void userFirstNameShouldBeUpdated() {
        String firstName = context.getResponse().jsonPath().getString("firstName");
        assertEquals(firstName, "UpdatedName");
    }
}