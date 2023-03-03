package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharTest {
    public static void main(String[] args) {
        String regexTest = "   This guy";
        Pattern whiteSpace = Pattern.compile("\\s");
        Pattern whiteSpaces = Pattern.compile("\\s\\s");
        Matcher matcher = whiteSpaces.matcher(regexTest);
        for (int i = 0; i < regexTest.length(); i++) {
            if (Character.isWhitespace(regexTest.charAt(i))){

            }
        }
        System.out.println(matcher.matches());
        String characterTest = "This string is going to lab123450 for testing";

        //convert the string into an array of characters
        char[] charsFromString = characterTest.toCharArray();

        for (int i = 0; i < charsFromString.length; i++) {
            if (Character.isDigit(charsFromString[i])){
                System.out.print(charsFromString[i]);
            } else if (Character.isAlphabetic(charsFromString[i])) {

            }
        }
    }
}
