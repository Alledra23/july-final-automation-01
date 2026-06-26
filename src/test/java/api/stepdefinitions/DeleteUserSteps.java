package api.stepdefinitions;

import io.cucumber.java.en.*;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;

public class DeleteUserSteps {

    private final SharedContext context;
    String userId;

    public DeleteUserSteps(SharedContext context) {
        this.context = context;
    }

    @Given("user has existing user id for deletion")
    public void userHasExistingUserIdForDeletion() {
        Map<String, String> body = new HashMap<>();
        body.put("firstName", "ToDelete");
        body.put("lastName", "User");
        body.put("email", "delete" + System.currentTimeMillis() + "@test.com");

        userId = given()
                .header("app-id", "63a804408eb0cb069b57e43a")
                .contentType("application/json")
                .body(body)
                .when()
                .post("https://dummyapi.io/data/v1/user/create")
                .jsonPath()
                .getString("id");
    }

    @When("user sends DELETE request")
    public void userSendsDELETERequest() {
        context.setResponse(
                given()
                        .header("app-id", "63a804408eb0cb069b57e43a")
                        .when()
                        .delete("https://dummyapi.io/data/v1/user/" + userId)
        );
    }
}