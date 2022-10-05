package com.cph.testass2;

public class StringService {
    private StringUtility su;

    public StringService() {
        StringUtility su = new StringUtility();
    }

    public String edit(String input, String method) {
        switch (method) {
            case "swap":
                return su.swap(input);
            case "reverse":
                return su.reverse(input);
            case "capitalize":
                return su.capitalize(input);
            case "lowercase":
                return su.lowercase(input);
            default:
                throw new IllegalArgumentException("Invalid Method");
        }
    }
}
