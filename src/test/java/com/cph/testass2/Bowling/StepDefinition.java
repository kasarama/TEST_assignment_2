package com.cph.testass2.Bowling;

import com.cph.testass2.Game;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinition {
    private Game g;
private int count=0;
    @Given("A game")
    public void a_game() {
       g = new Game();
    }
    @When("player rolls a bowl and knocks some {int} of the pins")
    public void player_rolls_a_bowl_and_knocks_some_of_the_pins(Integer pins) {
        System.out.println(g.score());
        count +=1;
        System.out.println(count);
        g.roll(pins);
        System.out.println(g.score());
    }
    @Then("{int} score should rise")
    public void score_should_rise(Integer score) {
       assertTrue(score == g.score());
    }

  }
