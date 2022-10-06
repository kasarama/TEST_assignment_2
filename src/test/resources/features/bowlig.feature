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


  Scenario Outline: Player rolls a bowl an knocks some of the pins
    Given a game
    When player rolls a bowl and knocks following <scores>
    Then <new> score should rise
    Examples:
      | scores                          | new |
      | 10, 10, 10, 4, 4, 4, 4, 4, 5, 5 | 102 |
      | 10, 10, 10                      | 60  |
      | 10, 10, 10, 4, 4, 4             | 84  |


