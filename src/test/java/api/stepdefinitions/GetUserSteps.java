package api.stepdefinitions;

import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

public class GetUserSteps {

    private final SharedContext context;
    String userId;

    public GetUserSteps(SharedContext context) {
        this.context = context;
    }

    @Given("user has valid user id")
    public void userHasValidUserId() {
        userId = "60d0fe4f5311236168a109ca";
    }

    @When("user sends GET request")
    public void userSendsGetRequest() {
        context.setResponse(
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .when()
                        .get("https://dummyapi.io/data/v1/user/" + userId)
        );
    }

    @Then("response contains firstName")
    public void responseContainsFirstName() {
        String firstName = context.getResponse().jsonPath().getString("firstName");
        System.out.println("firstName: " + firstName);
        org.testng.Assert.assertNotNull(firstName);
    }
}