package api.stepdefinitions;

import io.cucumber.java.en.*;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.*;

public class CreateUserSteps {

    private final SharedContext context;
    Map<String, String> requestBody;

    public CreateUserSteps(SharedContext context) {
        this.context = context;
    }

    @Given("user prepares new user data")
    public void userPreparesNewUserData() {
        requestBody = new HashMap<>();
        requestBody.put("firstName", "Ardella");
        requestBody.put("lastName", "Putra");
        requestBody.put("email", "ardella" + System.currentTimeMillis() + "@test.com");
    }

    @When("user sends POST request")
    public void userSendsPOSTRequest() {
        context.setResponse(
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .contentType("application/json")
                        .body(requestBody)
                        .when()
                        .post("https://dummyapi.io/data/v1/user/create")
        );
    }

    @Then("created user firstName should be Ardella")
    public void createdUserFirstNameShouldBeArdella() {
        String firstName = context.getResponse().jsonPath().getString("firstName");
        assertEquals(firstName, "Ardella");
    }
}