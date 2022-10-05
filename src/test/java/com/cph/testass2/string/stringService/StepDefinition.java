package com.cph.testass2.string.stringService;

import com.cph.testass2.StringService;
import com.sun.javaws.exceptions.InvalidArgumentException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinition {
    private String validInput;
    private String validMethod;
    private String edited;
    private String invalidInput;
    private Exception exception;
    private StringService ss = new StringService();

    @Given("A validInput {string} and validMethod {string}")
    public void valid(String input, String method) {
        validInput = input;
        validMethod = method;
    }


    @Then("{string} output is edited accordingly to the provided method")
    public void edited_accordingly_to_the_provided_method(String output) {
        assertEquals(output, edited);
    }

    @When("editing input")
    public void editing_validInput() {
        try {edited = ss.edit(validInput, validMethod);}
        catch (IllegalArgumentException e) {
            exception = e;
        }
    }

    @Given("A invalidInput {string} and validMethod {string}")
    public void invalidInput(String input, String method) {
        invalidInput = input;
        validMethod = method;
    }

    @When("editing invalid input")
    public void editing_invalidInput() {
        try {edited = ss.edit(invalidInput, validMethod);}
        catch (IllegalArgumentException e) {
            exception = e;
        }
    }

    @Then("Exception IllegalArgumentException is thrown there")
    public void editing_invalid_input_throws_exception() {
        assertEquals(IllegalArgumentException.class, exception.getClass());
    }

}
