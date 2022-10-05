Feature: Bowling Game
  Bowling game consist of 10 frames where 9 first frames have 2 rolls and last frame has 3 rolls,
  game score rise by each pill knocked
  spare means that in one frame 10 pins has been knocked and gives bonus points
  of number of pins knocked off in the next roll
  Strike means that all pins were knocked in the first roll and it gives bonus points
  of number of pins knocked in next two rolls
  player who rolls a spare or strike is allowed to roll the extra balls to complete the frame
  However no more than three balls can be rolled in
  tenth frame.

Background:
   Scenario Outline: Player rolls a bowl an knocks some of the pins
    Given A game
    When player rolls a bowl and knocks some <amount> of the pins
    Then <new> score should rise
    Examples:
      | amount | new |
      | 10     | 10  |
      | 10     | 30  |
      | 10     | 60  |
      | 4      | 76  |
      | 4      | 80  |
      | 4      | 84  |
      | 4      | 88  |
      | 4      | 92  |
      | 5      | 97  |
      | 5      | 102 |


