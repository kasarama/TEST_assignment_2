Feature: String utility

  Scenario Outline: Swap string so capital letter become small and vice versa
    Given A valid <string> input

    When I swap string input
    Then I should get <swapped> input
    Examples:
      | string  | swapped |
      | "aBc"   | "AbC"   |
      | "XYz"   | "xyZ"   |
      | "magdA" | "MAGDa" |


  Scenario Outline: Reverse string so it's in backwards order
    Given A valid <string> input
    When I reverse string input
    Then I should get <reversed> reversed string
    Examples:
      | string  | reversed |
      | "aBc"   | "cBa"   |
      | "XYz"   | "zYX"   |
      | "magdA" | "Adgam" |


  Scenario Outline: Capitalize string so all letters are capital letters
    Given A valid <string> input
    When I capitalize string input
    Then I should get <capitalized> capitalized string
    Examples:
      | string  | capitalized |
      | "aBc"   | "ABC"   |
      | "XYz"   | "XYZ"   |
      | "magdA" | "MAGDA" |


  Scenario Outline: Lower case string so all letters are lower case letters
    Given A valid <string> input
    When I lower string input
    Then I should get <lowercase> lower case string
    Examples:
      | string  | lowercase |
      | "aBc"   | "abc"   |
      | "XYz"   | "xyz"   |
      | "magdA" | "magda" |

  Scenario:
    Given invalid input "ab23" that contains not only letters
    When swapping string input
    Then Exception IllegalArgumentException is thrown
