Feature: String service

  Scenario Outline: Edit string by providing input and method
    Given A valid <string> input
    And valid <method>
    When editing input
    Then  <output> edited accordingly to the provided method
    Examples:
      | string | method | output |
      | "aBcDeF" | "swap" | "AbCdEf" |
      | "aBcDeF"  | "reverse" | "FeDcBa" |
      | "aBcDeF"  | "capitalize" | "ABCDEF" |
      | "aBcDeF"  | "lowerise" | "abcdef" |

