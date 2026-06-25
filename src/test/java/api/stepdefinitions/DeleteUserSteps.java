package api.stepdefinitions;

import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

public class DeleteUserSteps {

    private final SharedContext context;
    String userId;

    public DeleteUserSteps(SharedContext context) {
        this.context = context;
    }

    @Given("user has existing user id for deletion")
    public void userHasExistingUserIdForDeletion() {
        userId = "60d0fe4f5311236168a109ca";
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