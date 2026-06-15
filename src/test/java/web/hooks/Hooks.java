package web.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import web.utils.DriverFactory;

public class Hooks {

    @Before
    public void setup() {

        DriverFactory.setupDriver();
    }

    @After
    public void teardown() {

        DriverFactory.quitDriver();
    }
}