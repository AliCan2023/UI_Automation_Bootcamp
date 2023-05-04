package com.demoqa.step_definitions;

import com.demoqa.pages.AccordianPage;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccordianStepsDefs {


    @Given("Navigate to {string} page")
    public void navigate_to_page(String path) {

    }
    @When("click {string} accordion")
    public void click_accordion(String number) {


    }



    @Then("verify class text is {string} for {string}")
    public void verifyClassTextIsFor(String stateOfAccordian, String number) {

    }
}
