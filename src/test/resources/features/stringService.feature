Feature: String service

  Scenario Outline: Edit string by providing input and method
    Given A validInput <validString> and validMethod <validMethod>
    When editing input
    Then  <output> output is edited accordingly to the provided method
    Examples:
      | validString | validMethod  | output   |
      | "aBcDeF"    | "swap"       | "AbCdEf" |
      | "aBcDeF"    | "reverse"    | "FeDcBa" |
      | "aBcDeF"    | "capitalize" | "ABCDEF" |
      | "aBcDeF"    | "lowercase"  | "abcdef" |

  Scenario Outline: Edit string by providing input and method
    Given A invalidInput <invalidString> and validMethod <validMethod>
    When editing invalid input
    Then Exception IllegalArgumentException is thrown there
    Examples:
      | invalidString | validMethod  |
      | "1aBcDeF"     | "swap"       |
      | "1aBcDeF"     | "capitalize" |
      | "1aBcDeF"     | "lowercase"  |