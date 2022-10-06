package com.cph.testass2.Bowling;

import com.cph.testass2.Game;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinition {
    private Game g = new Game();
    private int count = 0;

    @Given("a game")
    public void a_game() {
        g = new Game();
    }


    @When("player rolls a bowl and knocks following {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}, {int}")
    public void player_rolls_a_bowl_and_knocks_following(Integer int1, Integer int2, Integer int3, Integer int4,
                                                         Integer int5, Integer int6, Integer int7, Integer int8,
                                                         Integer int9, Integer int10) {
        g.roll(int1);
        g.roll(int2);
        g.roll(int3);
        g.roll(int4);
        g.roll(int5);
        g.roll(int6);
        g.roll(int7);
        g.roll(int8);
        g.roll(int9);
        g.roll(int10);
    }

    @When("player rolls a bowl and knocks following {int}, {int}, {int}")
    public void player_rolls_a_bowl_and_knocks_following(Integer int1, Integer int2, Integer int3) {
        g.roll(int1);
        g.roll(int2);
        g.roll(int3);
    }

    @When("player rolls a bowl and knocks following {int}, {int}, {int}, {int}, {int}, {int}")
    public void player_rolls_a_bowl_and_knocks_following(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        g.roll(int1);
        g.roll(int2);
        g.roll(int3);
        g.roll(int4);
        g.roll(int5);
        g.roll(int6);
    }


    @Then("{int} score should rise")
    public void score_should_rise(Integer score) {
        assertTrue(score == g.score());
    }

}
