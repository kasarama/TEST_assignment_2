package com.cph.testass2.string.stringUtilities;

import com.cph.testass2.StringUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinition {
    private String validInput;
    private String swapped;
    private String reversed;
    private String capitalized;
    private String lowercase;
    private String invalidInput;

    private Exception swapException;
    private StringUtility su = new StringUtility();

    @Given("A valid {string} input")
    public void receiveValidInput(String string) {
        validInput = string;
    }


    @When("I swap string input")
    public void swapString() {
        swapped = su.swap(validInput);
    }

    @Then("I should get {string} input")
    public void returnSwappedString(String string) {
        assertEquals(string, swapped);

    }

    @When("I reverse string input")
    public void reverseString() {
        reversed = su.reverse(validInput);
    }


    @Then("I should get {string} reversed string")
    public void returnReversedString(String string) {
        assertEquals(string, reversed);
    }

    @When("I capitalize string input")
    public void i_capitalize_string_input() {
        capitalized = su.capitalize(validInput);
    }

    @Then("I should get {string} capitalized string")
    public void i_should_get_capitalized_string(String string) {
        assertEquals(string, capitalized);
    }

    @When("I lower string input")
    public void i_lower_string_input() {
        lowercase = su.lowercase(validInput);
    }

    @Then("I should get {string} lower case string")
    public void i_should_get_lower_case_string(String string) {
        assertEquals(string, lowercase);
    }


    @Given("invalid input {string} that contains not only letters")
    public void invalid_invalid_string_that_contains_not_only_letters(String input) {
        invalidInput = input;
    }

    @When("swapping string input")
    public void swapping_string_input() {
        try {
            su.swap(invalidInput);
        } catch (IllegalArgumentException e) {
            swapException = e;
        }
    }

    @Then("Exception IllegalArgumentException is thrown")
    public void exception_illegal_argument_exception_is_thrown() {
        assertTrue(swapException.getClass() == IllegalArgumentException.class);
    }


}
