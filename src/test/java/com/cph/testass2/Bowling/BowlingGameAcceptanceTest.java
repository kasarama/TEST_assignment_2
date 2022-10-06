package com.cph.testass2.Bowling;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/bowlig.feature")
public class BowlingGameAcceptanceTest {
}
