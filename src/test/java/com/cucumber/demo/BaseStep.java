package com.cucumber.demo;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import static demo.util.DriverFactory.getDriver;
import static demo.util.PropertyFileReader.getProperty;

public class BaseStep {

    protected WebDriver driver;

    @Before
    public void setup() {
        driver = getDriver(getProperty("browser"));
        driver.get(getProperty("application-url"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
