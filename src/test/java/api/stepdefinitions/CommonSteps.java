package api.stepdefinitions;

import io.cucumber.java.en.Then;

public class CommonSteps {

    private final SharedContext context;

    public CommonSteps(SharedContext context) {
        this.context = context;
    }

    @Then("response status code should be 200")
    public void responseStatusCodeShouldBe200() {
        context.getResponse().then().statusCode(200);
    }
}