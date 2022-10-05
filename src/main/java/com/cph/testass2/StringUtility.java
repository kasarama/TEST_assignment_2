package com.cph.testass2;

public class StringUtility {
    private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final char[] ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    public String swap(String input) {
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            char replacement = '*';
            for (int j = 0; j < alphabet.length; j++) {
                if (inputArr[i] == alphabet[j]) {
                    replacement = ALPHABET[j];
                } else if (inputArr[i] == ALPHABET[j]) {
                    replacement = alphabet[j];
                }
                if (j == alphabet.length - 1 && replacement == '*') {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
            inputArr[i] = replacement;
        }

        return new String(inputArr);
    }

    public String reverse(String input) {

        char[] inputChar = input.toCharArray();
        char[] outputChar = new char[inputChar.length];

        for (int i = 0; i < inputChar.length; i++) {
            outputChar[inputChar.length - 1 - i] = inputChar[i];
        }
        return new String(outputChar);
    }

    public String capitalize(String input) {
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            char replacement = '*';
            for (int j = 0; j < alphabet.length; j++) {
                if (inputArr[i] == alphabet[j]) {
                    replacement = ALPHABET[j];
                } else if (inputArr[i] == ALPHABET[j]) {
                    replacement = ALPHABET[j];
                }
                if (j == alphabet.length - 1 && replacement == '*') {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
            inputArr[i] = replacement;
        }

        return new String(inputArr);
    }

    public String lowercase(String input) {
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            char replacement = '*';
            for (int j = 0; j < alphabet.length; j++) {
                if (inputArr[i] == alphabet[j]) {
                    replacement = alphabet[j];
                } else if (inputArr[i] == ALPHABET[j]) {
                    replacement = alphabet[j];
                }
                if (j == alphabet.length - 1 && replacement == '*') {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
            inputArr[i] = replacement;
        }

        return new String(inputArr);
    }


}
